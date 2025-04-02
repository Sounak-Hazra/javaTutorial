public class LinkList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    void printLL() {
        if (head == null) {
            System.out.println("Link list is Empty ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void addFirst(int data) {
        // step - 1
        Node newNode = new Node(data);
        size++;

        //if the link list is empty (initially)
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step - 2
        newNode.next = head;

        //step - 3
        head = newNode;
    }

    void addLast(int data) {
        //step - 1
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        //step - 2
        tail.next = newNode;

        //step - 3
        tail = newNode;
    }

    void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        //step - 1
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        //step - 2
        newNode.next = temp.next;
        temp.next = newNode;
    }

    int removeFirst() {
        //if link list is empty
        if (size == 0) {
            System.out.println("Link list is emmpty.");
            return Integer.MIN_VALUE;
        }

        //if only a single element in the link list
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // step - 1
        int val = head.data;

        // step - 2
        head = head.next;

        // step - 3
        size--;
        return val;
    }

    int removeLast() {
        //if the link list is empty
        if (size == 0) {
            System.out.println("Link list is empty ");
            return Integer.MIN_VALUE;
        }

        //if their is only one element in the link list 
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        Node temp = head.next;
        while (temp.next != null) {
            prev = prev.next;
            temp = temp.next;
        }
        int val = temp.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    int removeNthFromLast(int index) {

        if (size == 0) {
            return Integer.MIN_VALUE;
        }

        //if the deleting index is head
        if (index == size) {
            int val = head.data;
            head = head.next;
            return val;
        }

        //if the deleting index is last index
        if (index == 0) {
            Node prev = head;
            Node temp = head.next;
            while (temp.next != null) {
                prev = prev.next;
                temp = temp.next;
            }
            int val = temp.data;
            prev.next = null;
            tail = prev;
            return val;
        }

        //for other cases 
        int delIndex = size - index + 1;
        Node prev = head;
        Node temp = head.next;
        for (int i = 1; i < delIndex - 1; i++) {
            prev = prev.next;
            temp = temp.next;
        }
        int val = temp.data;
        prev.next = temp.next;
        return val;
    }
    
    int search(int data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == data) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    int helperForRecSearch(int data, Node head) { // Time complexcity O(n) Space complexcity O(n) because of stack calls
        //base case
        if (head == null) {
            return -1;
        }

        if (head.data == data) {
            return 0;
        }

        int index = helperForRecSearch(data, head.next);

        //if not data is not found in whole link list 
        if (index == -1) {
            return -1;
        }

        return index + 1; // or ++index not index++ 
    }
    
    int recSearch(int data) {
        return helperForRecSearch(data, head);
    }

    void reverse() {
        Node prev = head;
        Node curr = head.next;
        tail = prev;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        tail.next = null;
        return;
    }

    Node findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    boolean isPalidrom() {
        Node mid = findMid();
        Node prev = mid;
        Node curr = mid.next;
        mid.next = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr = next;
            prev = curr;
        }
        Node temp1 = head;
        Node temp2 = tail;
        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

    //Find if any cycle exist in a link list 
    boolean checkCycle(Node head) {

        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;

    }

    //Remove cycle from a Link list 
    void removeCycle(Node head) {
        if (head == null) {
            return;
        }

        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        //if no cycle exist 
        if (!isCycle) {
            return;
        }

        //if cycle exist
        Node prev = null;
        slow = head;

        //For a case when cycle is happend with head node 
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        }

        //For normal cycles
        else {
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;
        }
    }

    

    public static void main(String args[]) {
        LinkList ll = new LinkList();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(2);
        ll.addLast(3);
        ll.addMiddle(4, 4);
        // ll.printLL();
        // ll.removeLast();
        ll.printLL();
        // System.out.println(ll.search(10));
        // System.out.println(ll.search(3));
        // System.out.println(ll.recSearch(10));
        // System.out.println(ll.recSearch(3));
        // ll.printLL();
        // System.out.println("Reversing the whole link list .");
        // ll.reverse();
        // ll.printLL();
        // ll.removeLast();
        // ll.removeLast();
        // ll.removeLast();
        // ll.printLL();
        // ll.reverse();
        // ll.printLL();
        ll.removeNthFromLast(0);
        ll.printLL();
    }
}

