package easy;

public class FirstPositionOfTarget {
    public int binarySearch(int[] nums, int target) {
        // write your code here
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
}
