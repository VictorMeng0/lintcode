package middle;

import java.util.Arrays;

/**
 * Created by menghan on 2018/8/10.
 */
public class ThreeSumCloest {
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        int minDiff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-2;i++){
            int tar = target - numbers[i];
            int begin = i+1;
            int end = numbers.length-1;
            while (begin < end){
                int diff = numbers[begin] + numbers[end] - tar;
                if(Math.abs(diff)<minDiff){
                    res = numbers[i] + numbers[begin] + numbers[end];
                    minDiff = Math.abs(diff);
                }
                if(diff > 0) end--;
                else if(diff == 0) return target;
                else begin++;
            }
        }
        return res;
    }
}
