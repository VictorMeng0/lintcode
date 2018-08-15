package easy;

/**
 * Created by menghan on 2018/8/13.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(new RemoveDuplicatesFromSortedArrayII().removeDuplicates(arr));
        for(int k:arr)
            System.out.println(k);
    }
    public int removeDuplicates(int[] nums) {
        // write your code here
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }
}
