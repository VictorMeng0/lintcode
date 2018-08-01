package middle;

/**
 * Created by menghan on 2018/7/27.
 */
public class SearchForRange {
    public static void main(String[] args) {
        int[] a = {3,3,3,3,5};
        int[] res = new SearchForRange().searchRange(a,3);
        System.out.println(res[0]);
    }
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(A.length<1) return res;
        int begin = 0;
        int end = A.length-1;
        while(begin+1<end){
            int mid = begin+(end-begin)/2;
            if(A[mid]>target) end = mid - 1;
            else if(A[mid]<target) begin = mid+1;
            else {
                end = mid;
            }
        }
        if(A[end]==target) res[0] = end;
        if(A[begin] == target) res[0] = begin;
        begin = 0;
        end = A.length-1;
        while(begin+1<end){
            int mid = begin+(end-begin)/2;
            if(A[mid]>target) end = mid - 1;
            else if(A[mid]<target) begin = mid+1;
            else {
                begin = mid;
            }
        }
        if(A[begin] == target) res[1] = begin;
        if(A[end] == target) res[1] = end;
        return res;
    }
}
