package easy;

public class Sqrtx {
    public static void main(String[] args) {
        System.out.println(new Sqrtx().sqrt(999999999));
    }
    public int sqrt(int x) {
        // write your code here
        if (x <= 1) return x;
        int left = 0, right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x / mid >= mid) left = mid + 1;
            else right = mid;
        }
        return right - 1;
    }
}
