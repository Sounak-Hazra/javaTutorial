public class DoblyLinkedlist {


    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    void printDLL() {
        if (head == null) {
            System.out.println("Link list is Empty ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print("<-" + temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size += 1;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        size += 1;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size += 1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
        size += 1;
    }

    void removeFirst() {
        if (head == null) {
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    void removeLast() {
        if (head == null) {
            return;
        }
        if (size == 1) {
            head = tail = null;
            size -= 1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.prev;
        prev.next = null;
        tail = prev;
        size -= 1;
    }



    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String args[]) {
        DoblyLinkedlist dll = new DoblyLinkedlist();
        dll.addFirst(20);
        dll.addFirst(10);
        dll.printDLL();
        // dll.removeFirst();
        // dll.printDLL();
        dll.addLast(30);
        dll.printDLL();
        dll.removeLast();
        dll.printDLL();
    }
}
