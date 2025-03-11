import java.util.*;

public class Solution {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class binaryTree {

        Node root = null;
        
        static int index = -1;

        public Node buildTree(int arr[]) {
            index++;

            if (arr[index] == -1) {
                return null;
            }

            
            Node newNode = new Node(arr[index]);
            if (index == 0) {
                root = newNode;
            }
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;
        }

        public void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            System.out.println(root.data);

            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        public void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);
        }

        public void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.println(root.data);
        }
        

        public void livelorderTraversal(Node root) {

            if (root == null) {
                System.out.println("Tree is empty BSDK add some data !");
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node current = q.remove();


                if (current == null) {
                    System.out.println();

                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (current.left != null) {
                        q.add(current.left);
                    }
                    if (current.right != null) {
                        q.add(current.right);
                    }
                    System.out.print(current.data + " ");
                }

            }
        }
    }
    public static void main(String args[]) {
        binaryTree t1 = new binaryTree();
        int arr[] ={ 1, 2, 4, 8, -1, -1, 9, -1, -1, 5, 10, -1, -1, 11, -1, -1, 3, 6, 12, -1, -1, 13, -1, -1, 7, 14, -1, -1, 15, -1, -1 };
        t1.buildTree(arr);

        t1.preorderTraversal(t1.root);
    }
}