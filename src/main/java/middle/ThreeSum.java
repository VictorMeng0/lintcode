package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/7/27.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {-2,-3,5,-1,-4,5,-11,7,1,2,3,4,-7,-1,-2,-3,-4,-5};
        List<List<Integer>> list = new ThreeSum().threeSum(a);
        for(List<Integer> sub:list)
            System.out.println(sub);
        System.out.println(list.size());
    }
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i = 0;i<numbers.length-2;i++){
            if(i>0&&numbers[i]==numbers[i-1]) continue;
            int begin = i+1;
            int end = numbers.length-1;
            int target = -numbers[i];
            while(begin<end){
                if(numbers[end]+numbers[begin]>target) end--;
                else if(numbers[begin]+numbers[end]<target) begin++;
                else {
                    res.add(new ArrayList<>(Arrays.asList(numbers[i],numbers[begin],numbers[end])));
                    while(end-1>=0&&numbers[end-1]==numbers[end]) end--;
                    while(begin+1<numbers.length&&numbers[begin]==numbers[begin+1]) begin++;
                    end--;
                    begin++;
                }
            }
        }
        return res;
    }
}
