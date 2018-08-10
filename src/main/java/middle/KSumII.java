package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/10.
 */
public class KSumII {
    public List<List<Integer>> kSumII(int[] A, int k, int targer) {
        // write your code here
        Arrays.sort(A);
        List<List<Integer>> list = new ArrayList<>();
        dfs(A,0,k,targer,list,new ArrayList<>());
        return list;
    }
    public void dfs(int[] arr,int i,int k,int target,List<List<Integer>> list,List<Integer> sublist){
        if(k==0&&target==0){
            List<Integer> tmp = new ArrayList<>();
            for(Integer num:sublist)
                tmp.add(num);
            list.add(tmp);
            return;
        }
        if(k<0||i>=arr.length||arr[i]>target) return;
        for(int index = i;index<arr.length;index++){
            sublist.add(arr[index]);
            dfs(arr,index+1,k-1,target-arr[index],list,sublist);
            sublist.remove(sublist.size()-1);
        }
    }
}
