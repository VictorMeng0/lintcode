package middle;

import java.util.Arrays;
import java.util.List;

/**
 * Created by menghan on 2018/8/3.
 */
public class SingleNumberIII {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,4,5,3};
        System.out.println(new SingleNumberIII().singleNumberIII(a));
    }
    public List<Integer> singleNumberIII(int[] A) {
        // write your code here
        int num = 0;
        for(int i=0;i<A.length;i++){
            num^=A[i];
        }
        num=num&(~num+1);
        int a=0;
        int b=0;
        for(int i=0;i<A.length;i++){
            if((A[i]&num)!=0) a^=A[i];
            else b^=A[i];
        }
        return Arrays.asList(a,b);
    }
}
