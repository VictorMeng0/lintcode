package middle;

import java.util.List;

/**
 * Created by menghan on 2018/8/31.
 */
// something wrong,to be done
public class PreviousPermutation {
    public List<Integer> previousPermuation(List<Integer> nums) {
        // write your code here
        for(int i=0;i<nums.size();i++){
            int j = i+1;
            while(j<nums.size()&&nums.get(i)<nums.get(j)) j++;
            if(j == nums.size()){
                continue;
            }
            swap(nums,i,j);
            reverse(nums,i+1,nums.size()-1);
            return nums;
        }
        reverse(nums,0,nums.size()-1);
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
