import com.sun.source.tree.Tree;

public class CountNumberOfNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(countNodes(root));

    }
    public static int countNodes(TreeNode root) {
        if(root == null ){
            return 0;
        }
        int l = countNodes(root.left);
        int r = countNodes(root.right);

        return l+r+1;



    }

}


