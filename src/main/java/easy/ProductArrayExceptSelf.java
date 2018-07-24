package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(new ProductArrayExceptSelf().productExcludeItself(Arrays.asList(2,3,4,5)));
    }
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        long[] left = new long[nums.size()];
        Arrays.fill(left, 1);
        for(int i=1;i<nums.size();i++){
            left[i] = left[i-1] * nums.get(i-1);
        }
        long tmp = nums.get(nums.size()-1);
        for(int j=left.length-2;j>=0;j--){
            left[j] = left[j] * tmp;
            tmp = tmp*nums.get(j);
        }
        List<Long> res = new ArrayList<Long>(nums.size());
        for(long num: left)
            res.add(num);
        return res;
    }
}
