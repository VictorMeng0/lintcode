package middle;

/**
 * Created by menghan on 2018/9/4.
 */
public class WordSearch {
    public static void main(String[] args) {

    }
    public boolean exist(char[][] board, String word) {
        // write your code here
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean res = doSearch(board,new boolean[board.length][board[0].length],i,j,0,word);
                    if(res) return true;
                }
            }
        }
        return false;
    }
    public boolean doSearch(char[][] board,boolean[][] cache,int i,int j,int index,String word){
        if(index == word.length()) return true;
        if(i<0||i>=board.length||j<0||j>=board[0].length) return false;
        if(cache[i][j]) return false;
        if(board[i][j]!=word.charAt(index)) return false;
        cache[i][j] = true;
        boolean res = doSearch(board,cache,i+1,j,index+1,word)||doSearch(board,cache,i-1,j,index+1,word)||
                doSearch(board,cache,i,j+1,index+1,word)||doSearch(board,cache,i,j-1,index+1,word);
        cache[i][j] = false;
        return res;
    }
}
