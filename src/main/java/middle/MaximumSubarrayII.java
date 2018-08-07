package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/6.
 */
public class MaximumSubarrayII {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,-1,2,-1,2);
        System.out.println(new MaximumSubarrayII().maxTwoSubArrays(list));
    }
    public int maxTwoSubArrays(List<Integer> nums) {
        // write your code here
        if(nums.size()<=0) return -1;
        int[] front = new int[nums.size()];
        int[] after = new int[nums.size()];
        front[0] = nums.get(0);
        after[after.length-1] = nums.get(nums.size()-1);
        for(int i=1;i<nums.size();i++){
            front[i] = Math.max(nums.get(i),front[i-1]+nums.get(i));
            after[after.length-1-i] = Math.max(nums.get(after.length-1-i),after[after.length-i]+nums.get(after.length-1-i));
        }
        for(int i = 1;i<nums.size();i++){
            int k = nums.size()-1-i;
            front[i] = Math.max(front[i-1],front[i]);
            after[k] = Math.max(after[k],after[k+1]);
        }
        int res = Integer.MIN_VALUE;
        for(int i=0;i<nums.size()-1;i++){
            res = Math.max(front[i]+after[i+1],res);
        }
        return res;
    }
}
