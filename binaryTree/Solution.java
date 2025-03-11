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
    }
    public static void main(String args[]) {
        binaryTree t1 = new binaryTree();
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6,-1, -1};
        t1.buildTree(arr);

        t1.inorderTraversal(t1.root);
    }
}