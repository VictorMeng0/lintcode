package middle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by menghan on 2018/8/16.
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(a));
    }
    public int longestConsecutive(int[] num) {
        // write your code here
        Map<Integer, Integer> map = new HashMap<>();
        int len = 0;
        for(int i=0;i<num.length;i++){
            if(!map.containsKey(num[i])) {
                int lenLeft = map.containsKey(num[i] - 1) ? map.get(num[i] - 1) : 0;
                int lenright = map.containsKey(num[i] + 1) ? map.get(num[i] + 1) : 0;
                int sum = lenLeft + lenright + 1;
                map.put(num[i] - lenLeft, sum);
                map.put(num[i] + lenright, sum);
                map.put(num[i], sum);
                len = Math.max(len, sum);
            }
        }
        return len;
    }
}
