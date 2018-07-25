package easy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/7/25.
 */
public class RecoverRotateSortedArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);


    }
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        int i=0;
        if(nums.size()<=1) return;
        while(i+1<nums.size()&&nums.get(i)<=nums.get(i+1))
            i++;
        reverse(nums,0,i);
        reverse(nums,i+1,nums.size()-1);
        reverse(nums,0,nums.size()-1);
    }
    public void reverse(List<Integer> list,int begin,int end){
        while(begin<end){
            int tmp = list.get(begin);
            list.set(begin,list.get(end));
            list.set(end,tmp);
            begin++;
            end--;
        }
    }
}
