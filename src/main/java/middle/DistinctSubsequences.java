package middle;

public class DistinctSubsequences {
    public static void main(String[] args) {
        System.out.println(new DistinctSubsequences().numDistinct("rabbbit","rabit"));
    }
    public int numDistinct(String S, String T) {
        // write your code here
        if(S.length()<T.length()) return 0;
        int[][] dp = new int[T.length()+1][S.length()+1];
        for(int i=0;i<=S.length();i++) dp[0][i] = 1;
        for(int i=1;i<=T.length();i++){
            for(int j=1;j<=S.length();j++){
                dp[i][j] = dp[i][j-1]+(T.charAt(i-1)==S.charAt(j-1)?dp[i-1][j-1]:0);
            }
        }
        return dp[T.length()][S.length()];
    }
}
