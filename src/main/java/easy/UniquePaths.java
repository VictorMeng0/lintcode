package easy;

/**
 * Created by menghan on 2018/7/25.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        // write your code here
        int[] dp = new int[n];
        for(int i=0;i<n;i++)
            dp[i] = 1;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(j>0)
                    dp[j]+=dp[j-1];
            }
        }
        return dp[dp.length-1];
    }
}
