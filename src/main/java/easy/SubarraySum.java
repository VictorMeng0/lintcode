package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        System.out.println(new SubarraySum().subarraySum(new int[]{-3,1,2,-3,4}));
    }
    public List<Integer> subarraySum(int[] nums) {
        // write your code here
        List<Integer> res = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum)){
                res.add(map.get(sum)+1);
                res.add(i);
                return  res;
            }
            map.put(sum,i);
        }
        return res;
    }
}
