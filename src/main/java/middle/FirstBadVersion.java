package middle;

/**
 * Created by menghan on 2018/8/10.
 */
public class FirstBadVersion {
    public static boolean isBadVersion(int k){
        return true;
    };
    public int findFirstBadVersion(int n) {
        // write your code here
        int begin = 1;
        int end = n;
        while(begin<=end){
            int mid = begin + (end - begin)/2;
            if(isBadVersion(mid)){
                if(mid == 1) return mid;
                if(!isBadVersion(mid - 1)) return mid;
                else end = mid - 1;
            }
            else begin = mid + 1;
        }
        return begin;
    }
}
