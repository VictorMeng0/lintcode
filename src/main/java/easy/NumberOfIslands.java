package easy;

/**
 * Created by menghan on 2018/7/25.
 */
public class NumberOfIslands {
    public int numIslands(boolean[][] grid) {
        // write your code here
        int number = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]){
                    number++;
                    dfs(grid,i,j);
                }
            }
        }
        return number;
    }
    public void dfs(boolean[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length) return;
        if(grid[i][j]){
            grid[i][j] = false;
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
        }
    }
}
