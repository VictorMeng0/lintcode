package easy;

public class Search2DMatrix {
    public static void main(String[] args) {
        System.out.println(new Search2DMatrix().searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 7));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length == 0) return false;
        int len = matrix.length * matrix[0].length;
        int begin = 0;
        int end = len-1;
        int m = matrix.length;
        int n = matrix[0].length;
        while(begin <= end){
            int mid = (begin + end)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] == target) return true;
            if(matrix[row][col] > target){
                end = mid - 1;
            }else{
                begin = mid + 1;
            }
        }
        return false;
    }
}
