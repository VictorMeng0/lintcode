package easy;

/**
 * Created by menghan on 2018/7/25.
 */
public class MinPathSum {
    public static void main(String[] args) {
        int[][] a = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new MinPathSum().minPathSum(a));
    }
    public int minPathSum(int[][] grid) {
        // write your code here
        if(grid.length==0||grid[0].length==0) return 0;
        int[] tmp = new int[grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0&&j==0) {
                    tmp[j] = grid[i][j];
                    continue;
                }
                int minLeft = j==0?Integer.MAX_VALUE:tmp[j-1];
                int minBottom = i==0?Integer.MAX_VALUE:tmp[j];
                tmp[j] = Math.min(minLeft,minBottom)+grid[i][j];
            }

        }
        return tmp[tmp.length-1];

    }

}
