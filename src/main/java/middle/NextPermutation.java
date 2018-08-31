package middle;

/**
 * Created by menghan on 2018/8/31.
 */
public class NextPermutation {
    public int[] nextPermutation(int[] nums) {
        // write your code here
        if(nums.length<=1) return nums;
        int j = nums.length - 1;
        while(j>0){
            if(nums[j]>nums[j-1]) break;
            j--;
        }
        if(j==0) {
            reverse(nums,0,nums.length-1);
            return nums;
        }
        int i = nums.length - 1;
        for(;i>=j;i--){
            if(nums[i]>nums[j-1]) break;
        }
        swap(nums,j-1,i);
        reverse(nums,j,nums.length-1);
        return nums;
    }
    public void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public void reverse(int[] arr,int begin,int end){
        while(begin<end){
            swap(arr,begin++,end--);
        }
    }
}
