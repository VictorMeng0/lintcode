package middle;

/**
 * Created by menghan on 2018/9/3.
 */
public class PartitionArray {
    public int partitionArray(int[] nums, int k) {
        // write your code here
        int i = 0;
        for(int m = 0;m<nums.length;m++){
            if(nums[m]<k){
               swap(nums,i++,m);
            }
        }
        return i;
    }
    public void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
