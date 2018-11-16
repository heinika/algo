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

    // 单链表反转
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

    // 检测是否为循环链表
    public static boolean checkCricle(Node head) {
        if (head == null) {
            return false;
        }
        Node fastNode = head.next;
        Node slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            if (fastNode == slowNode) {
                return true;
            }
            fastNode = head.next.next;
            slowNode = head.next;
        }
        return false;
    }

    // 有序链表合并
    public static Node mergeSortedLists(Node la, Node lb) {
        if (la == null)
            return lb;
        if (lb == null)
            return la;

        Node p = la;
        Node q = lb;
        Node head;
        if (p.data < q.data) {
            head = p;
            p = p.next;
        } else {
            head = q;
            q = q.next;
        }

        Node r = head;
        while (p != null && q != null) {
            if (p.data < q.data) {
                r.next = p;
                p = p.next;
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }

        if (p != null) {
            r.next = p;
        } else {
            r.next = q;
        }
        return head;
    }

    // 删除倒数第 k 个节点
    public static Node deleteLastKth(Node head, int k) {
        Node fast = head;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }

        if (fast == null)
            return head;

        Node slow = head;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev = null) {
            head = prev.next;
        } else {
            prev.next = prev.next.next;
        }
        return head;
    }

    // 求中心节点
    public static Node findMiddleNode(Node head) {
        if (head == null)
            return null;

        Node fast = head;
        Node slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}