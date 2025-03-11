public class Solution {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static class QueueL {
        static Node head = null;
        static Node tail = null;
        static int size = 0;

        boolean isEmpty() {
            return head == null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int dequeue() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            } else {
                int val = head.data;
                head = head.next;
                return val;
            }
        }

        int peek() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            } else {
                return head.data;
            }
        }
    }
    public static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int size) {
            Queue.arr = new int[size];
            Queue.size = size;
            Queue.rear = -1;
        }
        
        boolean isEmpty() {
            return rear == -1;
        }

        boolean isFull() {
            return rear == size - 1;
        }

        void add(int data) {
            if (isFull()) {
                return;
            }
            arr[++rear] = data;
        }
        
        int remove() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            } else {
                int val = arr[0];
                for (int i = 0; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                rear--;
                return val;
            }
        }
        
        int peak() {
            return arr[rear];
        }
    }
    public static void main(String args[]) {
        QueueL q = new QueueL();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
        System.out.println(q.peek());
    }
}