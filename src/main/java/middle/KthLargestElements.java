package middle;

/**
 * Created by menghan on 2018/7/26.
 */
public class KthLargestElements {
    public static void main(String[] args) {
        int[] a = {9,3,2,4,8};
        System.out.println(new KthLargestElements().kthLargestElement(3,a));
    }
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        return kthLargest(nums,0,nums.length-1,nums.length-k);

    }

    public int kthLargest(int[] arr,int begin,int end,int k){
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
        if(i>k) return kthLargest(arr,begin,i-1,k);
        else return kthLargest(arr,i+1,end,k);

    }
    public void swap(int[] arr,int i ,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
