public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int result = maxPathSum(root);
        System.out.println("Maximum Path Sum: " + result);

    }

    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        calculateMaxPath(root);
        return maxSum;
    }

    public static int calculateMaxPath(TreeNode node)
    {
        if (node == null) return 0;

        int left = Math.max(calculateMaxPath(node.left), 0);
        int right = Math.max(calculateMaxPath(node.right), 0);
        int currentPathSum = node.val + left + right;

        maxSum = Math.max(maxSum, currentPathSum);

        return node.val + Math.max(left, right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }


    }
}



