package easy;

import apple.laf.JRSUIUtils;

/**
 * Created by menghan on 2018/9/4.
 */
public class ConvertSortedArrayToBSTMInimumHeight {
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        return doBuild(A,0,A.length-1);
    }
    public TreeNode doBuild(int[] a,int begin,int end){
        if(begin>end) return null;
        int mid = begin + (end - begin)/2;
        TreeNode root = new TreeNode(a[mid]);
        root.left = doBuild(a,begin,mid-1);
        root.right = doBuild(a,mid+1,end);
        return root;
    }
}
