package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTLevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<List<Integer>> res = new BSTLevelOrder().levelOrder(root);
        for(List<Integer> list:res){
            System.out.println(list);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int parentSize = 1;
        int childSize = 0;
        int depth = 1;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(depth>res.size()){
                List<Integer> sublist = new ArrayList<Integer>();
                sublist.add(node.val);
                res.add(sublist);
            }else res.get(res.size()-1).add(node.val);
            if(node.left!=null) {
                queue.offer(node.left);
                childSize++;
            }
            if(node.right!=null){
                queue.offer(node.right);
                childSize++;
            }
            parentSize -- ;
            if(parentSize == 0){
                parentSize = childSize;
                childSize = 0;
                depth ++ ;
            }
        }
        return res;
    }
}
