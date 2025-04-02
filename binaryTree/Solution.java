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
        

        public void lavelorderTraversal(Node root) {

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

        int heightOftree(Node root) {
            if (root == null) {
                return 0;
            }

            return 1 + Math.max(heightOftree(root.left), heightOftree(root.right));
        }
        int totalNumberOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            return 1 + totalNumberOfNodes(root.left) + totalNumberOfNodes(root.right);
        }

        int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }

            return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
        }
        
        int diameterOfaTree(Node root) {
            if (root == null) {
                return 0;
            }

            int leftTreeHeight = heightOftree(root.left);
            int rightTreeHeight = heightOftree(root.right);

            int diameterOfTheTree = leftTreeHeight + rightTreeHeight + 1;

            return Math.max(Math.max(diameterOfaTree(root.left), diameterOfaTree(root.right)), diameterOfTheTree);
        }
        
        public static class Info {
            int diameter;
            int height;

            public Info(int diameter, int height) {
                this.diameter = diameter;
                this.height = height;
            }
        }

        Info diameterOfaTreeOptimized(Node root) {

            if (root == null) {
                return new Info(0, 0);
            }
            
            Info rightInfo = diameterOfaTreeOptimized(root.right);
            Info leftInfo = diameterOfaTreeOptimized(root.left);

            int dim = Math.max(Math.max(rightInfo.diameter, leftInfo.diameter), rightInfo.height + leftInfo.height + 1);
            int height = Math.max(leftInfo.height, rightInfo.height) + 1;

            return new Info(dim, height);
        }
    }
    public static void main(String args[]) {
        binaryTree t1 = new binaryTree();
        int arr[] ={ 1, 2, 4, 8, -1, -1, 9, -1, -1, 5, 10, -1, -1, 11, -1, -1, 3, 6, 12, -1, -1, 13, -1, -1, 7, 14, -1, -1, 15, -1, -1 };
        t1.buildTree(arr);

        
        System.out.println(t1.heightOftree(t1.root));
        System.out.println(t1.totalNumberOfNodes(t1.root));
        System.out.println(t1.sumOfNodes(t1.root));

        System.out.println(t1.diameterOfaTreeOptimized(t1.root).diameter);
    }
}