package middle;

import java.util.List;

public class MajorityElement {



    public int majorityNumber(List<Integer> nums) {
        // write your code here
        if(nums.size()<=0) return -1;
        int a = 0;
        int b = 0;
        int ca = 0;
        int cb = 0;
        for(int num: nums){
            if(a == num) ca++;
            else if(b == num) cb++;
            else if(ca == 0){
                a = num;
                ca = 1;
            }
            else if(cb == 0){
                b = num;
                cb = 1;
            }else {
                ca--;
                cb--;
            }
        }
        ca = cb = 0;
        for(int num : nums){
            if(num == ca) ca++;
            if(num == cb) cb++;
        }
        if(ca > nums.size()/3) return a;
        else  return b;
    }
}
