package easy;

import java.util.List;

public class MajorityElement {
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int res = nums.get(0);
        int cnt = 1;
        for(int i = 1;i<nums.size();i++){
            if(nums.get(i)!=res){
                if(cnt>0) cnt--;
                else {
                    res = nums.get(i);
                    cnt = 1;
                }
            }
            else {
                cnt++;
            }
        }
        return res;

    }
}
