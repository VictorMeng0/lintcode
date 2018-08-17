package middle;

/**
 * Created by menghan on 2018/8/16.
 */
public class LongestCommonSubstring {
    public int longestCommonSubstring(String A, String B) {
        // write your code here
        int m = A.length();
        int n = B.length();
        int maxlen = 0;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A.charAt(i)==B.charAt(j)){
                    dp[i][j] = i>0&&j>0?dp[i-1][j-1]+1:1;
                    maxlen = Math.max(dp[i][j], maxlen);
                }
                else dp[i][j] = 0;
            }
        }
        return maxlen;
    }
}
