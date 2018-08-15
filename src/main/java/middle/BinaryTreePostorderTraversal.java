package middle;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by menghan on 2018/8/15.
 */
public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        List<Integer> list = new BinaryTreePostorderTraversal().postorderTraversal(root);
        System.out.println(list);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        TreeNode rot = root;
        TreeNode previsit = null;
        while(rot!=null||!stack.isEmpty()){
            while(rot!=null){
                stack.push(rot);
                rot = rot.left;
            }
            rot = stack.peek();
            if(rot.right==null||rot.right==previsit){
                list.add(stack.pop().val);
                previsit = rot;
                rot = null;
            }
            else rot = rot.right;
        }
        return list;
    }
}
