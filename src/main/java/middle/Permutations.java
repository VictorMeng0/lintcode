package middle;

import datastructure.ListBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/31.
 */
public class Permutations {
    public static void main(String[] args) {
        int[] res = {1,2,3,4,5};
        List<List<Integer>> list = new Permutations().permute(res);
        System.out.println(list);
    }
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<1) {
            res.add(new ArrayList<>());
            return res;
        }

        do {
           res.add(transferList(nums));
        }while (doPermute(nums));
        return res;
    }
    public boolean doPermute(int[] nums){
        int j = nums.length - 1;
        while(j>0){
            if(nums[j]>nums[j-1]) break;
            j--;
        }
        if(j==0) return false;
        int i = nums.length - 1;
        for(;i>=j;i--){
            if(nums[i]>nums[j-1]) break;
        }
        swap(nums,j-1,i);
        reverse(nums,j,nums.length-1);
        return true;
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
    public List<Integer>  transferList(int[] nums){
        List<Integer> list = new ArrayList<>(nums.length);
        for(int num:nums)
            list.add(num);
        return list;
    }
}
