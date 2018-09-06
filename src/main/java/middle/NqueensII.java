package middle;

public class NqueensII {
    public static void main(String[] args) {
        System.out.println(new NqueensII().totalNQueens(4));
    }
    int[] res;
    int count = 0;
    public int totalNQueens(int n) {
        // write your code here
        res = new int[n];
        doCount(0,n);
        return count;
    }
    public void doCount(int cur,int n){
        if(cur==n) {
            count++;
        }else {
            for(int i=0;i<n;i++){
                res[cur] = i;
                if(isValid(cur)) doCount(cur+1,n);
            }
        }
    }
    boolean isValid(int cur){
        for(int i=0;i<cur;i++){
            if(res[i] == res[cur]||Math.abs(res[i]-res[cur])==cur-i) return false;
        }
        return true;
    }
}
