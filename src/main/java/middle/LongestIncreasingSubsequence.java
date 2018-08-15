package middle;

import java.util.Arrays;

/**
 * Created by menghan on 2018/8/15.
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a = {4,2,4,5,3,7};
        System.out.println(new LongestIncreasingSubsequence().longestIncreasingSubsequence(a));
    }
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        int i = 0 ;
        int[] tmp = new int[nums.length];
        Arrays.fill(tmp, 0);
        for(int k=0;k<nums.length;k++) {
            int index = Arrays.binarySearch(tmp,0,i,nums[k]);
            index = index<0?-(index+1):index;
            tmp[index] = nums[k];
            if(index>=i) i++;
        }
        return i;
    }
}
