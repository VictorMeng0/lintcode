package middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nqueens {
    public static void main(String[] args) {
        System.out.println(new Nqueens().solveNQueens(4));
    }
    public List<List<String>> solveNQueens(int n) {
        // write your code here
        List<List<String>> list = new ArrayList<>();
        doBuild(0,new boolean[n],new boolean[2*n],new boolean[2*n],new String[n],n,list);
        return list;
    }
    public void doBuild(int row,boolean[] cols,boolean[] id1,boolean[] id2,String[] tmp,int n,List<List<String>> list){
        if(row==n){
            List<String> subList = new ArrayList<String>(Arrays.asList(tmp));
            list.add(subList);
            return;
        }
        for(int i=0;i<n;i++){
            int var1 = row-i+n;
            int var2 = 2*n-row-i-1;
            if(!cols[i]&&!id1[var1]&&!id2[var2]){
                char[] arr = new char[n];
                Arrays.fill(arr,'.');
                arr[i] = 'Q';
                tmp[row] = new String(arr);
                cols[i] = true;id1[var1] = true;id2[var2] = true;
                doBuild(row+1,cols,id1,id2,tmp,n,list);
                cols[i] = false;id1[var1] = false;id2[var2] = false;

            }
        }

    }
}
