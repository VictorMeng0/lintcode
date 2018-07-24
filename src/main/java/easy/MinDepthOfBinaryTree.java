package easy;

import org.omg.CORBA.INTERNAL;

public class MinDepthOfBinaryTree {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        // write your code here
        getMinDepth(root, 1);
        return min;
    }
    public void getMinDepth(TreeNode node,int depth){
        if(node == null) return;
        if(node.left==null&&node.right==null){
            min = Math.min(depth,min);
        }
        getMinDepth(node.left, depth+1);
        getMinDepth(node.right, depth+1);
    }
}
