package easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(a));
        for(int num:a)
            System.out.print(num+" ");
    }
    public int removeDuplicates(int[] nums) {
        // write your code here
        if(nums.length<=1) return nums.length;
        int i = 0;
        int j = 0;
        while (j<nums.length){
            int tar = nums[i];
            j=i+1;
            while(j<nums.length&&nums[j]<=nums[i]) j++;
            if(j<nums.length)
                swap(nums, i+1, j);
            i++;
        }
        return i;
    }
    public void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
