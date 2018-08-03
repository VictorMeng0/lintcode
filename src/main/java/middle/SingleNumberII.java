package middle;

/**
 * Created by menghan on 2018/8/3.
 */
public class SingleNumberII {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,3,3,2,2,4,1};
        System.out.println(new SingleNumberII().singleNumberII(a));
    }
    public int singleNumberII(int[] A) {
        // write your code here
        int res = 0;
        for(int i = 0;i<32;i++){
            int count = 0;
            for(int j=0;j<A.length;j++){
                if(((1<<i)&A[j])!=0) count++;
            }
            if(count%3!=0) res|=1<<i;
        }
        return res;
    }
}
