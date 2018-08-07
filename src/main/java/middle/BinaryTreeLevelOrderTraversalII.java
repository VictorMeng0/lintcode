package middle;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by menghan on 2018/8/6.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return res;
        queue.offer(root);
        int parentSize = 1;
        int childSize = 0;
        List<Integer> list = new ArrayList<>();
        res.add(list);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            parentSize--;
            res.get(0).add(tmp.val);
            if(tmp.left!=null){
                queue.offer(tmp.left);
                childSize++;
            }
            if(tmp.right!=null){
                queue.offer(tmp.right);
                childSize++;
            }
            if(parentSize==0&&!queue.isEmpty()){
                res.add(0,new ArrayList<>());
                parentSize = childSize;
                childSize = 0;
            }
        }
        return res;
    }
}
