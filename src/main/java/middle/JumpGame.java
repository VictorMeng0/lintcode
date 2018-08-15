package middle;

/**
 * Created by menghan on 2018/8/13.
 */
public class JumpGame {
    public boolean canJump(int[] A) {
        // write your code here
        int maxReach = 0;
        int i = 0;
        for(;i<A.length&&i<=maxReach;i++){
            maxReach = Math.max(maxReach,i+A[i]);
        }
        return i==A.length;
    }
}
