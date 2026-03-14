package BinaryTree;

public class CheckIfTheBinaryTreeIsBalancedBinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    static class Solution {

        public static boolean isBalanced(Node root) {
            if (root == null) {
                return true;
            }

            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            if (Math.abs(leftHeight - rightHeight) <= 1 &&
                    isBalanced(root.left) &&
                    isBalanced(root.right)) {
                return true;
            }

            return false;
        }

        public static int getHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        if (Solution.isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
    }
}
