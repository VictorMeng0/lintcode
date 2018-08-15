package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by menghan on 2018/8/13.
 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> list = new BinaryTreeInorderTraversal().inorderTraversal(root);
        System.out.println(list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode rot = root;
        while(rot!=null||!stack.isEmpty()){
            while(rot!=null){
                stack.push(rot);
                rot = rot.left;
            }
            rot = stack.pop();
            list.add(rot.val);
            rot = rot.right;
        }
        return list;
    }
}
