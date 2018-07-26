package middle;

/**
 * Created by menghan on 2018/7/26.
 */
public class UglyNumberII {
    public int nthUglyNumber(int n) {
        // write your code here
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int[] res = new int[n];
        if(n<=1) return n;
        res[0] = 1;
        for(int i = 1;i<n;i++){
            int num = Math.min(res[index2]*2,Math.min(res[index3]*3,res[index5]*5));
            res[i] = num;
            while(res[index2]*2<=num) index2++;
            while(res[index3]*3<=num) index3++;
            while(res[index5]*5<=num) index5++;
        }
        return res[n-1];
    }
}
