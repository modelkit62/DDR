package Graph1_CloneGraph;

import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class App {

    public Node cloneGraph(Node start) {
        if (start == null) return null;
        HashMap<Node, Node> map = new HashMap<>();                      // for each node in graph we create a new node
        map.put(start, new Node(start.val, new ArrayList<Node>()));     // add starting node
        Queue<Node> q = new LinkedList<>();                             // queue for bfs
        q.offer(start);                                                 // add start node to queue
        while (!q.isEmpty()) {                                           // iterate until queue is empty
            Node curr = q.poll();                                       // get the first node in queue
            for (Node n : curr.neighbors) {                              // for every neighbor of first node
                if (!map.containsKey(n)) {                               // if neighbor not in map
                    map.put(n, new Node(n.val, new ArrayList<Node>())); // create new node for neighbor
                    q.offer(n);                                         // also add neighbor to queue
                }
                map.get(curr).neighbors.add(map.get(n));                // add neighbor to list of neighbors of first node
            }
        }
        return map.get(start);                                          // return the duplicate of start node
    }

}
