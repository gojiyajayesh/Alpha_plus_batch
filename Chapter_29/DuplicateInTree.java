import java.util.Queue;
import java.util.HashSet;
import java.util.LinkedList;

public class DuplicateInTree {
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

    public static class BinaryTree {

        // Builds the binary tree from an array of node values
        public static Node buildTree(int[] nodes, int[] index) {
            index[0]++;
            if (index[0] >= nodes.length || nodes[index[0]] == -1) {
                return null;
            }
            Node node = new Node(nodes[index[0]]);
            node.left = buildTree(nodes, index);
            node.right = buildTree(nodes, index);
            return node;
        }

        // Inverts the binary tree
        public static void inverseTree(Node root) {
            if (root == null) {
                return;
            }
            // Swap left and right children
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            // Recursively invert the left and right subtrees
            inverseTree(root.left);
            inverseTree(root.right);
        }

        // Checks if two trees are inverse of each other
        public static boolean isInverseTree(Node root, Node root2) {
            if (root == null && root2 == null) {
                return true;
            }
            if (root == null || root2 == null || root.data != root2.data) {
                return false;
            }
            // Check if the left subtree of root is inverse of the right subtree of root2
            // and vice versa
            return isInverseTree(root.left, root2.right) && isInverseTree(root.right, root2.left);
        }

        // Performs level order traversal of the binary tree
        public static void levelOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null); // Marker for end of level

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println(); // End of level
                    if (!queue.isEmpty()) {
                        queue.add(null); // Add marker for next level
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }

        // Delete All Target Integer Leave Node delete
        public static Node deleteNode(Node root, int target) {
            if (root == null) {
                return null;
            }
            root.left=deleteNode(root.left, target);
            root.right=deleteNode(root.right, target);
            if (root.left == null && root.right == null && root.data == target) {
                return null;
            }
            return root;
        }

        // Checks if the binary tree contains any duplicate values
        public static boolean containsDuplicate(Node root) {
            if (root == null) {
                return false;
            }
            Queue<Node> q = new LinkedList<>();
            HashSet<Integer> set = new HashSet<>();
            q.add(root);

            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (set.contains(curr.data)) {
                    return true; // Duplicate found
                } else {
                    set.add(curr.data);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 3, -1, -1, 4, -1, -1, 5, -1, -1 };
        Node root = BinaryTree.buildTree(nodes, new int[] { -1 });

        // Check for duplicates in the tree
        System.out.println(BinaryTree.containsDuplicate(root));

        // Perform level order traversal
        BinaryTree.levelOrderTraversal(root);

        // Invert the tree and perform level order traversal again
        BinaryTree.inverseTree(root);
        BinaryTree.levelOrderTraversal(root);

        int[] nodes2 = { 1, 2, 3, -1, -1, 4, -1, -1, 8, -1, -1 };
        Node root2 = BinaryTree.buildTree(nodes2, new int[] { -1 });

        // Check if the two trees are inverses of each other
        System.out.println(BinaryTree.isInverseTree(root, root2));
        int[] nodes3 = { 1, 3, 3, -1, -1, 2, -1, -1, 3, -1, -1 };
        Node delNode = BinaryTree.buildTree(nodes3, new int[] { -1 });
        BinaryTree.levelOrderTraversal(delNode);
        BinaryTree.deleteNode(delNode, 3);
        BinaryTree.levelOrderTraversal(delNode);
    }
}
