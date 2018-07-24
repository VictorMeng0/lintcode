package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        // write your code here
        int[][] tmp = new int[n][2];
        for(int i = 1;i<=n;i++){
            if(i%3==0) tmp[i-1][0]=1;
            if(i%5==0) tmp[i-1][1]=1;
        }
        List<String> res= new ArrayList<String>(n);
        for(int i = 0;i<tmp.length;i++){
            String sub = "";
            if(tmp[i][0]==0&&tmp[i][1]==0){
                sub+=(i+1);
                res.add(sub);
                continue;
            }
            if(tmp[i][0]==1){
                sub+="fizz";
            }
            if(tmp[i][1]==1){
                sub+=" buzz";
            }
            res.add(sub);
        }
        return res;
    }
}
