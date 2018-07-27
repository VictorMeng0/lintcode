package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/7/27.
 */
public class SubSets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = new SubSets().subsets(arr);
        for(List<Integer> sub:list)
            System.out.println(sub);
    }
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        doExe(res,new ArrayList<>(),0,nums);
        return res;
    }
    public void doExe(List<List<Integer>> res,List<Integer> list,int index,int[] nums){
        List<Integer> sublist = new ArrayList<>(list);
        res.add(sublist);
        for(int i = index;i<nums.length;i++){
            list.add(nums[i]);
            doExe(res,list,i+1,nums);
            list.remove(list.size()-1);
        }
    }
}
