package easy;

public class AAndBProblem {
    public static void main(String[] args) {
        System.out.println(new AAndBProblem().aplusb(3,5));
    }
    public int aplusb(int a, int b) {
        // write your code here
        while(b!=0){
            int carry = a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }

}
