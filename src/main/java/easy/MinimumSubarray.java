package easy;

import java.util.Arrays;
import java.util.List;

public class MinimumSubarray {
    public static void main(String[] args) {
        System.out.println(new MinimumSubarray().minSubArray(Arrays.asList(1, -1, -2, 1)));
    }
    public int minSubArray(List<Integer> nums) {
        // write your code here
        int[] res = new int[nums.size()];
        res[0] = nums.get(0);
        int min = res[0];
        for(int i=1;i<res.length;i++){
            res[i] = Math.min(res[i-1]+nums.get(i),nums.get(i));
            min = Math.min(res[i], min);
        }
        return min;
    }
}
