package middle;

/**
 * Created by menghan on 2018/8/28.
 */
public class EditDistance {
    public static void main(String[] args) {
        String word1 = "mart";
        String word2 = "karma";
        System.out.println(new EditDistance().minDistance(word1,word2));
    }
    public int minDistance(String word1, String word2) {
        // write your code here
        int[][] res = new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<res.length;i++)
            res[i][0] = i;
        for(int j=0;j<res[0].length;j++)
            res[0][j] = j;
        for(int i=1;i<res.length;i++){
            for(int j=1;j<res[0].length;j++){
                int tmp = 1;
                if(word1.charAt(i-1)==word2.charAt(j-1)) tmp = 0;
                res[i][j] = Math.min(res[i-1][j]+1,Math.min(res[i][j-1]+1,res[i-1][j-1]+tmp));
            }
        }
        return res[word1.length()][word2.length()];
    }
}
