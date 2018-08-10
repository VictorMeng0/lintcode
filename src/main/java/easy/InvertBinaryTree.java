package easy;

/**
 * Created by menghan on 2018/8/10.
 */
public class InvertBinaryTree {
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        if(root == null) return ;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }

}
