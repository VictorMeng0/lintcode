package easy;

public class PowerOfTwo {
    public boolean checkPowerOf2(int n) {
        // write your code here
        return (n&(n-1)) == 0;
    }
}
