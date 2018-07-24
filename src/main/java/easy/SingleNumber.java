package easy;

public class SingleNumber {
    public int singleNumber(int[] A) {
        // write your code here
        int res = 0;
        for(int i=0;i<A.length;i++){
            res^=A[i];
        }
        return res;
    }
}
