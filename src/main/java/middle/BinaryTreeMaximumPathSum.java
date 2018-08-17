package middle;

import easy.TreeNode;

/**
 * Created by menghan on 2018/8/17.
 */
public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        new BinaryTreeMaximumPathSum().maxPathSum(root);
    }
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // write your code here
        cal(root);
        return res;
    }
    public int cal(TreeNode root){
        if(root==null) return 0;
        int leftPath = cal(root.left);
        int rightPath = cal(root.right);
        int max = (leftPath>0?leftPath:0) + (rightPath>0?rightPath:0) + root.val;
        res = Math.max(max , res);
        return Math.max(root.val+leftPath, root.val+rightPath);
    }

}
