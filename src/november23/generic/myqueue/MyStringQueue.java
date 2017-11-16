package november23.generic.myqueue;

import static com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT.value;

public class MyStringQueue {

    private Node head = new Node();
    private Node tail = head;

    private static class Node {

        String value;
        Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }

        public String getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }
    }

    public void add(String value) {

        head = new Node(value, head);

    }

    public boolean hasNext() {
        return tail.getNext() != null;
    }

    public String get() {

        String value = null;

        if (hasNext()) {
            value = head.getNext().getValue();
            tail = tail.getNext().getNext();
        }

        return value;
    }

}




