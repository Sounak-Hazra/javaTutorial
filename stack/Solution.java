public class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        static Node head;
        
        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peak() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }

            return head.data;
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(3);
        s.push(4);
        s.print();
        // System.out.println(s.pop());
        // s.print();
        System.out.println(s.peak());
        s.print();
    }
}