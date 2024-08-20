import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        int[] values = { 6, 5, 7, 4, 8, 3, 9, 2, 10, 1 };
        Node root = null;

        for (int value : values) {
            root = BinarySearchTreeB.insertBST(root, value);
        }

        System.out.println("Inorder Traversal:");
        BinarySearchTreeB.inorderTraversal(root);
        System.out.println();

        System.out.println("Preorder Traversal:");
        BinarySearchTreeB.preorderTraversal(root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        BinarySearchTreeB.postorderTraversal(root);
        System.out.println();

        System.out.println("Level Order Traversal:");
        BinarySearchTreeB.levelOrderTraversal(root);
        System.out.println();

        System.out.println("Search for 10:");
        Node result = BinarySearchTreeB.searchInTree(root, 10);
        if (result != null) {
            System.out.println("Found node with value: " + result.data);
        } else {
            System.out.println("Node with value 10 not found.");
        }
    }

    public static class BinarySearchTreeB {

        // Inorder Traversal (Left, Root, Right)
        public static void inorderTraversal(Node root) {
            if (root != null) {
                inorderTraversal(root.left);
                System.out.print(root.data + " ");
                inorderTraversal(root.right);
            }
        }

        // Preorder Traversal (Root, Left, Right)
        public static void preorderTraversal(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
        }

        // Postorder Traversal (Left, Right, Root)
        public static void postorderTraversal(Node root) {
            if (root != null) {
                postorderTraversal(root.left);
                postorderTraversal(root.right);
                System.out.print(root.data + " ");
            }
        }

        // Level Order Traversal
        public static void levelOrderTraversal(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                if (current == null) {
                    System.out.println();
                    if (queue.isEmpty())
                        break;
                    else
                        queue.add(null);
                } else {
                    System.out.print(current.data + " ");
                    if (current.left != null) {
                        queue.add(current.left);
                    }
                    if (current.right != null) {
                        queue.add(current.right);
                    }
                }
            }
            System.out.println();
        }

        // Search for a value in the BST
        public static Node searchInTree(Node root, int target) {
            while (root != null) {
                if (root.data == target) {
                    return root;
                } else if (root.data > target) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return null; // Target not found
        }

        // Insert a value into the BST
        public static Node insertBST(Node root, int val) {
            if (root == null) {
                return new Node(val);
            }
            if (root.data > val) {
                root.left = insertBST(root.left, val);
            } else if (root.data < val) {
                root.right = insertBST(root.right, val);
            }
            // If the value is equal, do nothing (or handle duplicates as needed)
            return root;
        }
    }
}
