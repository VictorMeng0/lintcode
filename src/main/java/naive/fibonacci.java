package naive;

public class fibonacci {
    public int fibonacci(int n) {
        // write your code here
        int[] res = new int[n+1];
        res[1] = 0;
        if(n>1)
            res[2] = 1;
        for(int i=3;i<=n;i++)
            res[i] = res[i-1]+res[i-2];
        return res[n];
    }
}
