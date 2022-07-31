package LinkedList1_reverse_linkedList;

public class App {

    public static ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(listNode1);
        System.out.println(reverseList(listNode1));
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public String toString() {
            String result = val + " ";
            if (next != null) {
                result = result + "-> " + next;
            }
            return result;
        }
    }
}
