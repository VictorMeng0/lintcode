package middle;

import easy.TreeNode;

/**
 * Created by menghan on 2018/8/14.
 */
public class ConsrtuctBinaryTreeFromInorderAndPostOrder {
    public static void main(String[] args) {
        int[] inorder = {1,2,3};
        int[] posrtorder = {1,3,2};
        new ConsrtuctBinaryTreeFromInorderAndPostOrder().buildTree(inorder,posrtorder);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode buildTree(int[] inorder,int iBegin,int iEnd,int[] postorder,int pBegin,int pEnd){
        if(iBegin>iEnd) return null;
        TreeNode root = new TreeNode(postorder[pEnd]);
        int i = iBegin;
        for(;i<=iEnd;i++){
            if(inorder[i] == postorder[pEnd]) break;
        }
        int leftlen = i-iBegin;
        root.left = buildTree(inorder,iBegin,i-1,postorder,pBegin,pBegin+leftlen-1);
        root.right = buildTree(inorder,i+1,iEnd,postorder,pBegin+leftlen,pEnd-1);
        return root;
    }
}
