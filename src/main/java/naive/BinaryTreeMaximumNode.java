package naive;

import easy.TreeNode;

public class BinaryTreeMaximumNode {
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if(root == null) return null;
        TreeNode leftMax = maxNode(root.left);
        TreeNode rightMax = maxNode(root.right);
        TreeNode max = root;
        if(leftMax!=null&&max.val<leftMax.val) max = leftMax;
        if(rightMax!=null&&max.val<rightMax.val) max = rightMax;
        return max;

    }
}
