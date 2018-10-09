public class LinkedListAlgo {
    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    public static Node reverse(Node head) {
        Node headNode = null;
        Node preNode = null;
        Node curNode = head;
        while (curNode != null) {
            Node nextNode = curNode.next;
            if (nextNode == null) {
                headNode = curNode;
            }
            curNode.next = preNode;
            preNode = curNode;
            nextNode = curNode.next;
        }

        return headNode;
    }
}