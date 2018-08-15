package middle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by menghan on 2018/8/13.
 */
public class MajorityElementII {
    public static void main(String[] args) {
        int[] a = {3,1,2,3,2,3,3,4,4,4};
        List<Integer> list = Arrays.asList(3,1,2,3,2,3,3,4,4,4);
        System.out.println(new MajorityElementII().majorityNumber(list,3));
    }
    public int majorityNumber(List<Integer> nums, int k) {
        // write your code here
        Map<Integer,Integer> map = new ConcurrentHashMap<>();
        for(int num:nums){
            if(map.size()<k){
                int val = map.getOrDefault(num, 0);
                map.put(num, val+1);
            }
            else {
                if(map.containsKey(num)){
                    int val = map.get(num);
                    map.put(num,val+1);
                }
                else {
                    boolean canInsert = false;
                    for(int key:map.keySet()){
                        if(map.get(key)==1) {
                            map.remove(key);
                            canInsert = true;
                        }
                        else map.put(key, map.get(key)-1);
                    }
                    if(canInsert) map.put(num, 1);
                }
            }
        }
        int frequency = nums.size()/k;
        for(int num:map.keySet()){
            int cnt = 0;
            for(int number:nums){
                if(number == num) cnt++;
            }
            if(cnt>frequency) return num;
        }
        return -1;
    }
}
