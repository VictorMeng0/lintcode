package middle;

import easy.TreeNode;

/**
 * Created by menghan on 2018/8/15.
 */
public class ConsrtuctBinaryTreeFromInorderAndPreOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        return buildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);

    }

    public TreeNode buildTree(int[] inorder,int iBegin,int iEnd,int[] preorder,int pBegin,int pEnd){
        if(iBegin>iEnd) return null;
        TreeNode root = new TreeNode(preorder[pBegin]);
        int i = iBegin;
        for(;i<=iEnd;i++){
            if(inorder[i] == preorder[pBegin]) break;
        }
        int leftlen = i-iBegin;
        root.left = buildTree(inorder,iBegin,i-1,preorder,pBegin+1,pBegin+leftlen);
        root.right = buildTree(inorder,i+1,iEnd,preorder,pBegin+leftlen+1,pEnd);
        return root;
    }
}
