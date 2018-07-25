package easy;

/**
 * Created by menghan on 2018/7/25.
 */
public class Triangle {
    public static void main(String[] args) {
        int[][] test = {{2},{3,4},{6,5,7},{4,1,8,3}};
        System.out.println(new Triangle().minimumTotal(test));
    }

    public int minimumTotal(int[][] triangle) {
        // write your code here
        for(int i=1;i<triangle.length;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(j==0){
                    triangle[i][j] = triangle[i][j] + triangle[i-1][0];
                }else if(j == triangle[i].length-1){
                    triangle[i][j] = triangle[i][j] + triangle[i-1][triangle[i-1].length-1];
                }else{
                    triangle[i][j] = triangle[i][j] + Math.min(triangle[i-1][j-1],triangle[i-1][j]);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int num:triangle[triangle.length-1])
            min = Math.min(min,num);
        return min;
    }
}
