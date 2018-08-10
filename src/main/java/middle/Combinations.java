package middle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by menghan on 2018/8/10.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,1,k,new ArrayList<>(),n);
        return res;
    }
    public void dfs(List<List<Integer>> list,int num,int k,List<Integer> sublist,int n){
        if(k<0) return;
        if(k == 0){
            List<Integer> tmp = new ArrayList<>();
            for(Integer number:sublist)
                tmp.add(number);
            list.add(tmp);
            return;
        }
        for(int i=num;i<=n;i++){
            sublist.add(i);
            dfs(list,i+1,k-1,sublist,n);
            sublist.remove(sublist.size()-1);
        }
    }
}
