package easy;

/**
 * Created by menghan on 2018/7/25.
 */
public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        int ob[][] = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(ob));
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid.length==0||obstacleGrid[0].length==0) return 0;
        int[] dp = new int[obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid[0].length&&obstacleGrid[0][i]!=1;i++)
            dp[i]=1;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for(int i = 1;i < m ;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[j]=0;
                    continue;
                }else{
                    if(j>0) dp[j]+=dp[j-1];
                }

            }
        }
        return dp[dp.length-1];
    }
}
