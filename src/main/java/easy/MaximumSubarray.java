package easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // write your code here
        int[] res = new int[nums.length];
        res[0] = nums[0];
        int max = res[0];
        for(int i=1;i<res.length;i++){
            res[i] = Math.max(res[i-1]+nums[i],nums[i]);
            max = Math.max(res[i], max);
        }
        return max;
    }
}
