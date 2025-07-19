public class CountNumberOfNodes {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Total number of nodes: " + countNodes(root));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = countNodes(root.left);
        int r = countNodes(root.right);
        return l + r + 1;
    }
}
