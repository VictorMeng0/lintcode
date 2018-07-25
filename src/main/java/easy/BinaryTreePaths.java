package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by menghan on 2018/7/25.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        traverse(root,res,sb);
        return res;
    }
    public void traverse(TreeNode root,List<String> list,StringBuilder sb){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            sb.append(root.val);
            list.add(sb.toString());
        }
        sb.append(root.val+"->");
        traverse(root.left,list,new StringBuilder(sb));
        traverse(root.right,list,new StringBuilder(sb));
    }
}
