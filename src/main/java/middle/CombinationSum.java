package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/10.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        dfs(list,new ArrayList<>(),0,target,candidates);
        return list;
    }
    public void dfs(List<List<Integer>> list,List<Integer> sublist,int k,int target,int[] arr){
        if(target<0) return;
        if(target == 0){
            List<Integer> tmp = new ArrayList<>();
            for(Integer number:sublist)
                tmp.add(number);
            list.add(tmp);
            return;
        }
        if(k>=arr.length||arr[k]>target) return;
        for(int i=k;i<arr.length;i++){
            if(i>k&&arr[i]==arr[k]) continue;
            sublist.add(arr[i]);
            dfs(list,sublist,i,target-arr[i],arr);
            sublist.remove(sublist.size()-1);
        }
    }
}
