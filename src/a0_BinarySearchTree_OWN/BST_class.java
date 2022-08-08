package a0_BinarySearchTree_OWN;

class Node{
    int value;
    Node left;
    Node right;
    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class BST_class {

    Node root;

    public BST_class() {
        root = null;
    }

    void insert(int value){
        root = insert_recursive(root, value);
    }
    private Node insert_recursive(Node root, int value) {
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.value){
            root.left = insert_recursive(root.left, value);
        }
        if(value > root.value){
            root.right = insert_recursive(root.right, value);
        }
        return root;
    }

    boolean search(int value){
        root = search_recursive(root, value);
        if(root != null){
            return true;
        } else {
            return false;
        }
    }
    private Node search_recursive(Node root, int value) {
        if(root == null || root.value == value){
            return root;
        }
        if(root.value > value){
            return search_recursive(root.left, value);
        } else {
            return search_recursive(root.right, value);
        }
    }

    int delete(int value){
        root = delete_recursive(root, value);
        return value;
    }

    private Node delete_recursive(Node root, int value) {
        if(root == null){
            return root;
        }
        if(value < root.value){
            root.left = delete_recursive(root.left, value);
        } else if (value > root.value){
            root.right = delete_recursive(root.right, value);
        } else {
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }
            root.value = minValue(root.right);
            root.right = delete_recursive(root.right, root.value);
        }
        return root;
    }
    private int minValue(Node root) {
        int minValue = root.value;

        while(root.left != null){
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    void inOrder(){
        inOrder_recursive(root);
    }
    private void inOrder_recursive(Node root) {
        if(root != null){
            inOrder_recursive(root.left);
            System.out.print(root.value + " ");
            inOrder_recursive(root.right);
        }
    }

    public static void main(String[] args) {
        BST_class bst = new BST_class();
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(90);
        bst.insert(50);
        bst.inOrder();
        System.out.println();
        System.out.println(bst.search(50));
        bst.inOrder();
        System.out.println("Deleted: " + bst.delete(50));
        bst.inOrder();
        System.out.println(bst.search(50));
        bst.inOrder();
        
    }
}
