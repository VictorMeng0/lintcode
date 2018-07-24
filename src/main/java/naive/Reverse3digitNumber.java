package naive;

public class Reverse3digitNumber {
    public static void main(String[] args) {
        System.out.println(new Reverse3digitNumber().reverseInteger(900));
    }
    public int reverseInteger(int number) {
        // write your code here
        int res = 0;
        while(number>0){
            res = res*10+number%10;
            number/=10;
        }
        return res;
    }
}
