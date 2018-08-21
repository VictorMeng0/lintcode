package easy;

/**
 * Created by menghan on 2018/8/21.
 */
public class StringPermutation {
    public boolean Permutation(String A, String B) {
        // write your code here
        int[] res = new int[256];
        if(A.length()!=B.length()) return false;
        for(int i=0;i<A.length();i++){
            res[A.charAt(i)]++;
            res[B.charAt(i)]--;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]!=0) return false;
        }
        return true;
    }
}
