package middle;

/**
 * Created by menghan on 2018/8/8.
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        int[][] dp = new int[A.length()][B.length()];
        if(A.length()==0||B.length()==0) return 0;
        for(int i=0;i<A.length();i++){
            for(int j=0;j<B.length();j++){
                int up = i>0?dp[i-1][j]:0;
                int left = j>0?dp[i][j-1]:0;
                int upLeft = i>0&&j>0?dp[i-1][j-1]:0;
                if(A.charAt(i)==B.charAt(j)) dp[i][j] = Math.max(upLeft+1,Math.max(up,left));
                else dp[i][j] = Math.max(left,up);
            }
        }
        return dp[A.length()-1][B.length()-1];
    }
}
