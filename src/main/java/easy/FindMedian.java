package easy;

/**
 * Created by menghan on 2018/7/25.
 */
public class FindMedian {
    public static void main(String[] args) {
        int a[] = {3,4,1,2,5,8};
        System.out.println(new FindMedian().median(a) );

    }
    public int median(int[] nums) {
        // write your code here
        return findKth(nums,0, nums.length-1,nums.length%2==0?nums.length/2-1:nums.length/2);
    }

    public int findKth(int[] arr,int begin,int end,int k){
        if(begin>end) return -1;
        int tmp = arr[begin];
        int i = begin;
        for(int j=begin+1;j<=end;j++){
            if(arr[j]<tmp){
                swap(arr,i+1,j);
                i++;
            }
        }
        if(i == k) return tmp;
        swap(arr,i,begin);
        if(i>k) return findKth(arr,begin,i-1,k);
        else return findKth(arr,i+1,end,k);

    }
    public void swap(int[] arr,int i ,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
