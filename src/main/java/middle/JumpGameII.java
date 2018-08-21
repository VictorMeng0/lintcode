package middle;

/**
 * Created by menghan on 2018/8/17.
 */
public class JumpGameII {
    public static void main(String[] args) {

    }
    public int jump(int[] A) {
        // write your code here
        int curRich = 0;
        int maxRich = 0;
        int minStep = 0;
        for(int i=0;i<A.length-1;i++){
            maxRich = Math.max(maxRich, i+A[i]);
            if(curRich<=i){
                curRich = maxRich;
                minStep++;
            }
        }
        return minStep;
    }
}
