package middle;

import datastructure.ListBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/24.
 */
public class FourSum {
    public static void main(String[] args) {
        List<List<Integer>> list = new FourSum().fourSum(new int[]{1,0,-1,0,-2,2},0);
        for(List<Integer> sub: list) System.out.println(sub);
    }
    public List<List<Integer>> fourSum(int[] numbers, int target) {
        // write your code here
        Arrays.sort(numbers);
        List<List<Integer>> res = new ArrayList<>();
        if(numbers.length<4) return res;
        for(int i = 0;i<numbers.length-3;i++){
            int valA = numbers[i];
            if(i>0&&numbers[i] == numbers[i-1]) continue;
            for(int j = i+1;j<numbers.length-2;j++){
                if(j>i+1&&numbers[j] == numbers[j-1]) continue;
                int valB = numbers[j];
                int tar = target - valA - valB;
                int begin = j + 1;
                int end = numbers.length - 1;
                while(begin<end){
                    if(numbers[begin] + numbers[end] == tar){
                        res.add(Arrays.asList(valA, valB, numbers[begin], numbers[end]));
                        while(begin+1<numbers.length&&numbers[begin]==numbers[begin+1]) begin++;
                        while(end-1>=0&&numbers[end] == numbers[end-1]) end--;
                        begin++;
                        end--;
                    }
                    else if(numbers[begin] + numbers[end] > tar) end--;
                    else begin++;
                }
            }
        }
        return res;
    }
}
