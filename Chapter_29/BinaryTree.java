import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    // Node class to represent each node in the binary tree
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Class to store diameter and height of the tree
    public static class Info {
        int diameter;
        int height;

        public Info(int d, int h) {
            diameter = d;
            height = h;
        }
    }

    static class BinaryTreeC {
        // Static index used to build the tree from array representation
        private static int index = -1;

        // Build the binary tree from the given array
        public static Node buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Count the total number of nodes in the tree
        public static int countNode(Node root) {
            if (root == null) {
                return 0;
            }
            return countNode(root.left) + countNode(root.right) + 1;
        }

        // Compute the height of the tree
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            return Math.max(height(root.left), height(root.right)) + 1;
        }

        // Calculate the sum of all nodes' data
        public static int sumNode(Node root) {
            if (root == null) {
                return 0;
            }
            return root.data + sumNode(root.left) + sumNode(root.right);
        }

        // Print the nodes of the tree in in-order traversal
        public static void inOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }

        // Print the nodes of the tree in pre-order traversal
        public static void preOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        // Print the nodes of the tree in post-order traversal
        public static void postOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        // Print the nodes of the tree in level-order traversal
        public static void levelOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (!queue.isEmpty()) {
                        queue.add(null);
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

        // Print the nodes of the tree in kth level traversal
        public static void levelOrderTraversal(Node root, int k) {
            if (root == null) {
                return;
            }
            int cnt = 0;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);
            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    cnt++;
                    if (!queue.isEmpty()) {
                        queue.add(null);
                    } else {
                        break;
                    }
                } else {
                    if (cnt == k - 1) {
                        System.out.print(currNode.data + " ");
                    }
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }

        // Print Kth Level Of Tree
        public static void levelOrderTraversalKth(Node root, int level, int targetLevel) {
            if (root == null) {
                return;
            }
            if (level == targetLevel) {
                System.out.print(root.data + " ");
                return;
            }
            levelOrderTraversalKth(root.left, level + 1, targetLevel);
            levelOrderTraversalKth(root.right, level + 1, targetLevel);
        }

        // Model Class Info2 for storing node and its horizontal distance for top view
        public static class Info2 {
            int horizontalDistance;
            Node node;

            Info2(Node node, int horizontalDistance) {
                this.horizontalDistance = horizontalDistance;
                this.node = node;
            }
        }

        // Print the top view of the tree
        public static void topViewOfTree(Node root) {
            if (root == null) {
                return;
            }
            int min = 0, max = 0;
            HashMap<Integer, Node> map = new HashMap<>();
            Queue<Info2> queue = new LinkedList<>();
            queue.add(new Info2(root, 0));
            queue.add(null);
            while (!queue.isEmpty()) {
                Info2 curr = queue.remove();
                if (curr == null) {
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    if (curr.node.left != null) {
                        queue.add(new Info2(curr.node.left, curr.horizontalDistance - 1));
                        min = Math.min(min, curr.horizontalDistance - 1);
                    }
                    if (curr.node.right != null) {
                        queue.add(new Info2(curr.node.right, curr.horizontalDistance + 1));
                        max = Math.max(max, curr.horizontalDistance + 1);
                    }
                    if (!map.containsKey(curr.horizontalDistance)) {
                        map.put(curr.horizontalDistance, curr.node);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

        // Check if the given tree is identical to another tree
        public static boolean isIdentical(Node root, Node subroot) {
            if (root == null && subroot == null) {
                return true;
            } else if (root == null || subroot == null || root.data != subroot.data) {
                return false;
            }
            if (!isIdentical(root.left, subroot.left)) {
                return false;
            }
            if (!isIdentical(root.right, subroot.right)) {
                return false;
            }
            return true;
        }

        // Check if the given tree is a subtree of another tree
        public static boolean isSubtree(Node root, Node subroot) {
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }

        // Find the diameter of the tree with O(N^2) time complexity
        public static int diameterOfTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDiameter = diameterOfTree(root.left);
            int rightDiameter = diameterOfTree(root.right);
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(Math.max(leftDiameter, rightDiameter), leftHeight + rightHeight + 1);
        }

        // Find the diameter of the tree with O(N) time complexity
        public static Info diameterOfTreeInfo(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info left = diameterOfTreeInfo(root.left);
            Info right = diameterOfTreeInfo(root.right);
            int height = Math.max(left.height, right.height) + 1;
            int diameter = Math.max(Math.max(left.diameter, right.diameter), left.height + right.height + 1);
            return new Info(diameter, height);
        }

        // Find Lowest Common Ancestor
        public static void commonAncestor(Node root, Node first, Node second) {
            List<Node> firstPath = new ArrayList<>();
            List<Node> secondPath = new ArrayList<>();
            isPresentAncestor(root, first, firstPath);
            isPresentAncestor(root, second, secondPath);
            Node common = null;
            for (int i = 0; i < Math.min(firstPath.size(), secondPath.size()); i++) {
                if (firstPath.get(i).data == secondPath.get(i).data) {
                    common = firstPath.get(i);
                }
            }
            System.out.println("\nCommon Ancestor of these two nodes is " + common.data);
        }

        // Helper method to check if target is present in the tree and store the path
        public static boolean isPresentAncestor(Node root, Node target, List<Node> list) {
            if (root == null) {
                return false;
            }
            list.add(root);
            if (root.data == target.data)
                return true;
            if (isPresentAncestor(root.left, target, list)) {
                return true;
            }
            if (isPresentAncestor(root.right, target, list)) {
                return true;
            }
            list.remove(list.size() - 1);
            return false;
        }

        // Find Lowest Common Ancestor with another method
        public static Node commonAncestor2(Node root, Node n1, Node n2) {
            if (root == null || root.data == n1.data || root.data == n2.data) {
                return root;
            }
            Node leftNode = commonAncestor2(root.left, n1, n2);
            Node rightNode = commonAncestor2(root.right, n1, n2);

            if (leftNode == null) {
                return rightNode;
            }
            if (rightNode == null) {
                return leftNode;
            }
            return root;
        }

        // Find kth ancestor distance
        public static int kthAncestorDistance(Node root, int node, int k) {
            if (root == null) {
                return -1;
            }

            if (root.data == node) {
                return 0;
            }

            int left = kthAncestorDistance(root.left, node, k);
            int right = kthAncestorDistance(root.right, node, k);

            if (left == -1 && right == -1) {
                return -1;
            }
            int max = Math.max(left, right);
            if (max + 1 == k) {
                System.out.println(root.data);
            }
            return max + 1;
        }

        // Find minimum distance between two ancestors
        public static int minDistanceOfTwoAncestors(Node root, Node n1, Node n2) {
            List<Node> firstPath = new ArrayList<>();
            List<Node> secondPath = new ArrayList<>();
            isPresentAncestor(root, n1, firstPath);
            isPresentAncestor(root, n2, secondPath);
            for (int i = 0; i < Math.min(firstPath.size(), secondPath.size()); i++) {
                if (firstPath.get(i).data == secondPath.get(i).data) {
                    firstPath.remove(i);
                    secondPath.remove(i);
                    i = -1;
                }
            }
            return firstPath.size() + secondPath.size();
        }

        // Transform tree into sum tree
        public static int transformSum(Node root) {
            if (root == null) {
                return 0;
            }
            int value = root.data;
            int leftValue = transformSum(root.left);
            int rightValue = transformSum(root.right);
            root.data = leftValue + rightValue;
            return value + leftValue + rightValue;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // Building the binary tree from the array representation
        Node root = BinaryTreeC.buildTree(nodes);

        // InOrder Traversal
        System.out.print("InOrder Traversal: ");
        BinaryTreeC.inOrderTraversal(root);
        System.out.print("\n");

        // PreOrder Traversal
        System.out.print("PreOrder Traversal: ");
        BinaryTreeC.preOrderTraversal(root);
        System.out.print("\n");

        // PostOrder Traversal
        System.out.print("PostOrder Traversal: ");
        BinaryTreeC.postOrderTraversal(root);
        System.out.print("\n");

        // LevelOrder Traversal
        System.out.println("LevelOrder Traversal: ");
        BinaryTreeC.levelOrderTraversal(root);

        // Height of Tree
        System.out.println("Height of Tree is: " + BinaryTreeC.height(root));

        // Number of Nodes in Tree
        System.out.println("Number of Nodes in Tree is: " + BinaryTreeC.countNode(root));

        // Sum Of All Node's data
        System.out.println("Sum Of All Node's data is: " + BinaryTreeC.sumNode(root));

        // Diameter of Tree (O(N^2))
        System.out.println("Diameter of Tree (O(N^2)) is: " + BinaryTreeC.diameterOfTree(root));

        // Diameter of Tree (O(N))
        System.out.println("Diameter of Tree (O(N)) is: " + BinaryTreeC.diameterOfTreeInfo(root).diameter);

        // Sub Tree
        /*
         * Subtree to check
         * 2
         * / \
         * 4 5
         */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println("Is subtree: " + BinaryTreeC.isSubtree(root, subroot));

        // Top View of Tree
        System.out.println("Top View of Tree: ");
        BinaryTreeC.topViewOfTree(root);

        // LevelOrder Traversal of kth level
        System.out.println("LevelOrder Traversal of 2nd level: ");
        BinaryTreeC.levelOrderTraversal(root, 2);
        System.out.print("\n");

        // Print Kth Level Of Tree
        System.out.println("Kth Level Traversal (3rd level): ");
        BinaryTreeC.levelOrderTraversalKth(root, 1, 3);
        System.out.print("\n");

        // Find Common Ancestor
        System.out.println("Common Ancestor of root.left.left and root.left.right:");
        BinaryTreeC.commonAncestor(root, root.left.left, root.left.right);

        System.out.println("Common Ancestor (Method 2) of root.right.right and root.left.right: "
                + BinaryTreeC.commonAncestor2(root, root.right.right, root.left.right).data);

        // Find minimum distance between two ancestors
        System.out.println("Minimum Distance of Two Ancestors (root.right.right, root.left.right): "
                + BinaryTreeC.minDistanceOfTwoAncestors(root, root.right.right, root.left.right));

        // Test tree for kth ancestor
        Node an = new Node(1);
        an.left = new Node(2);
        an.right = new Node(3);
        an.left.left = new Node(4);
        an.left.right = new Node(5);
        an.right.left = new Node(6);
        an.right.right = new Node(7);
        System.out.println("Kth Ancestor Distance (5, 1): ");
        BinaryTreeC.kthAncestorDistance(an, 5, 1);

        // Transform Tree into Sum Tree
        System.out.println("Sum of Transformed Tree: " + BinaryTreeC.transformSum(an));
        System.out.println("LevelOrder Traversal of Transformed Tree: ");
        BinaryTreeC.levelOrderTraversal(an);
    }
}
