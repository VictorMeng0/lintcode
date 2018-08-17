package easy;

/**
 * Created by menghan on 2018/8/16.
 */
public class InsertNodeInBST {
    public static void main(String[] args) {
    }
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root==null||node==null) return node;
        if(node.val<root.val){
            if(root.left==null) {
                root.left = node;
            }
            else insertNode(root.left,node);
        }
        else if(node.val>root.val){
            if(root.right == null){
                root.right = node;
            }
            else insertNode(root.right,node);
        }
        return root;
    }

}
