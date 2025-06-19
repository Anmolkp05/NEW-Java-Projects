public class BalancedBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }

    }

        public static void main(String[] args) {
            BalancedBinaryTree solution = new BalancedBinaryTree();

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            System.out.println("Is the tree balanced? " + solution.isBalanced(root));
            TreeNode unbalancedRoot = new TreeNode(1);
            unbalancedRoot.left = new TreeNode(2);
            unbalancedRoot.left.left = new TreeNode(3);
            unbalancedRoot.left.left.left = new TreeNode(4);

            System.out.println("Is the tree balanced? " + solution.isBalanced(unbalancedRoot));
        }

        public boolean isBalanced(TreeNode root) {
            return height(root) != -1;
        }

        private int height(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            if (leftHeight == -1) return -1;
            int rightHeight = height(root.right);
            if (rightHeight == -1) return -1;
            if (Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            }

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


