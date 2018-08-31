package hard;

import easy.TreeNode;

import java.util.Stack;

/**
 * Created by menghan on 2018/8/31.
 */
public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        // do intialization if necessary
        stack = new Stack<>();
        while(root!=null){
            stack.push(root);
            root = root.left;
        }
    }

    /*
     * @return: True if there has next node, or false
     */
    public boolean hasNext() {
        // write your code here
        return !stack.isEmpty();
    }

    /*
     * @return: return next node
     */
    public TreeNode next() {
        // write your code here
        TreeNode top = stack.pop();
        if(top.right!=null){
            TreeNode right = top.right;
            while(right!=null){
                stack.push(right);
                right = right.left;
            }
        }
        return top;
    }
}
