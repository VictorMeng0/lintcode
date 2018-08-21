package middle;

/**
 * Created by menghan on 2018/8/17.
 */
public class InterleavingString {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println(new InterleavingString().isInterleave(s1,s2,s3));
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s1.length()+s2.length()!=s3.length()) return false;
        int m = s1.length();
        int n = s2.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        int i = 1;
        while(i<=m&&s1.charAt(i-1)==s3.charAt(i-1)){
            dp[i][0] = true;
            i++;
        }
        i = 1;
        while(i<=n&&s2.charAt(i-1)==s3.charAt(i-1)){
            dp[0][i] = true;
            i++;
        }
        for( i =1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int k = i + j - 1;
                if(s3.charAt(k) == s1.charAt(i-1) && dp[i-1][j]) dp[i][j] = true;
                if(s3.charAt(k) == s2.charAt(j-1) && dp[i][j-1]) dp[i][j] = true;
            }
        }
        return dp[m][n];
    }
}
