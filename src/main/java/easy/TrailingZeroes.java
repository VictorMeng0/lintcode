package easy;

public class TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(new TrailingZeroes().trailingZeros(11));
    }
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long res = 0;
        while(n>0){
            res += n/5;
            n/=5;
        }
        return res;
    }
}
