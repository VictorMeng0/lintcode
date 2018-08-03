package middle;

import easy.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by menghan on 2018/8/1.
 */
public class SearchRangeInBST {
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        List<Integer> list = new ArrayList<>();
        searchRange(root,list,k1,k2);
        return list;
    }
    public void searchRange(TreeNode root,List<Integer> list,int begin,int end){
        if(root == null) return;
        if(root.val>=begin&&root.val<=end){
            list.add(root.val);
            searchRange(root.left,list,begin,root.val);
            searchRange(root.right,list,root.val,end);
        }
        else if(root.val<begin){
            searchRange(root.right,list,begin,end);
        }
        else searchRange(root.left,list,begin,end);
    }
}
