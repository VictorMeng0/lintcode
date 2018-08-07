package middle;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by menghan on 2018/8/6.
 */
public class BinaryTreeZigzagLevelTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        search(res,root,1);
        return res;
    }
    public void search(List<List<Integer>> list,TreeNode root, int depth){
        if(root == null) return;
        if(list.size()<depth){
            List<Integer> subList = new ArrayList<>();
            list.add(subList);
        }
        if(depth%2==0){
            list.get(depth-1).add(0,root.val);
        }else {
            list.get(depth-1).add(root.val);
        }
        search(list,root.left,depth+1);
        search(list,root.right,depth+1);
    }

}
