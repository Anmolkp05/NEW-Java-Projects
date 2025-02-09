import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> result = preorderTraversal(root);
        System.out.println(result);
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
    }

    private static void preOrderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        preOrderHelper(node.left, result);
        result.add(node.val);
        preOrderHelper(node.right, result);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}

