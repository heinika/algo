public class Test {
    public static void main(String[] args) {
        System.out.println("Hello LinkedList!!!");
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertToHead(1);
        linkedList.insertToHead(2);
        linkedList.insertToHead(3);
        SinglyLinkedList.Node p = linkedList.findByValue(1);
        System.out.println(p.getData());
        linkedList.insertAfter(p, 2);
        linkedList.insertBefore(p, 0);
        linkedList.printAll();
    }
}
