package middle;

import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/31.
 */
public class PreviousPermutation {
    public static void main(String[] args) {
        System.out.println(new PreviousPermutation().previousPermuation(Arrays.asList(2,1,1)));
    }
    public List<Integer> previousPermuation(List<Integer> nums) {
        // write your code here
        if(nums.size()<=1) return nums;
        int j = nums.size()-1;
        for(;j>0;j--){
            if(nums.get(j-1)>nums.get(j)) break;
        }
        if(j==0){
            reverse(nums,0,nums.size()-1);
            return nums;
        }
        int i = nums.size()-1;
        while(nums.get(i)>=nums.get(j-1)) i--;
        swap(nums,j-1,i);
        reverse(nums,j,nums.size()-1);
        return nums;
    }
    public void swap(List<Integer> list,int i,int j){
        int tmp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,tmp);
    }
    public void reverse(List<Integer> list,int begin,int end){
        while(begin<end){
            swap(list,begin++,end--);
        }
    }

}
