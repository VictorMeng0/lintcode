package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTPreorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> res = new BSTPreorder().preorderTraversal(root);
        System.out.println(res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack=new Stack();
        TreeNode rot=root;
        List<Integer> list=new ArrayList();
        while(rot!=null||!stack.empty())
        {
            if(rot!=null)
            {
                list.add(rot.val);
                stack.push(rot);
                rot=rot.left;
            }
            else
            {
                rot=stack.pop().right;
            }
        }
        return list;
    }
}
