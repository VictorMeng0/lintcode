package naive;

public class HexConversion {
    public static void main(String[] args) {
        String tmp = "自有\\非自有";
        System.out.println(tmp);
    }
    public String hexConversion(int n, int k) {
        // write your code here
        String[] val = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        StringBuilder sb = new StringBuilder();
        if(n==0) return "0";
        while(n>0){
            sb.append(val[n%k]);
            n/=k;
        }
        return sb.reverse().toString();
    }
}
