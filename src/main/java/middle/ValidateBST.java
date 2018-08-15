package middle;

import easy.TreeNode;

/**
 * Created by menghan on 2018/8/15.
 */
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        // write your code here
        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean validate(TreeNode root,long min,long max){
        if(root == null) return true;
        if(root.val<=min||root.val>=max) return false;
        return validate(root.left,min,root.val)&&validate(root.right,root.val,max);
    }
}
