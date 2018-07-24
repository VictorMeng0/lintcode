package naive;

import java.util.Random;

/**
 * Created by menghan on 2018/7/24.
 */
public class SecondMaxOfArray {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = {1,2};

        int b =new SecondMaxOfArray().quickSort(a,0,a.length-1,a.length-2);
        System.out.println(b);

    }
    public int secondMax(int[] nums) {
           // write your code here
        //return quickSort(nums,0,nums.length-1,2);
        if(nums.length<2) return -1;
        return quickSort(nums,0,nums.length-1,nums.length-2);
    }
    public int quickSort(int[] arr,int begin,int end,int k){
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
        if(i>k) return quickSort(arr,begin,i-1,k);
        else return quickSort(arr,i+1,end,k);

    }
    public void swap(int[] arr,int i ,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
