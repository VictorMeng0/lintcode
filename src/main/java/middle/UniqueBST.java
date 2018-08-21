package middle;

/**
 * Created by menghan on 2018/8/17.
 */
public class UniqueBST {
    public static void main(String[] args) {
        System.out.println(new UniqueBST().numTrees(1));
    }
    public int numTrees(int n) {
        // write your code here
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1;i <= n;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
