package middle;

import easy.TreeNode;

/**
 * Created by menghan on 2018/8/7.
 */
public class LowestCommonAncestorOfBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        if(root == null) return root;
        if(root==A||root==B) return root;
        TreeNode left = lowestCommonAncestor(root.left,A,B);
        TreeNode right = lowestCommonAncestor(root.right,A,B);
        return left==null?right:right==null?left:root;
    }
}
