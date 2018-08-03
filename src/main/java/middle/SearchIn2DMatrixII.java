package middle;

/**
 * Created by menghan on 2018/8/3.
 */
public class SearchIn2DMatrixII {
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        int cnt = 0;
        if(matrix.length == 0||matrix[0].length == 0) return cnt;
        int m = 0, n = matrix[0].length - 1;
        while(m<matrix.length&&n>=0){
            if(matrix[m][n]<target) m++;
            else if(matrix[m][n]>target) n--;
            else {
                cnt++;
                n--;
            }
        }
        return cnt;
    }
}
