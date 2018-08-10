package middle;

/**
 * Created by menghan on 2018/8/10.
 */
public class SearchInRotateArray {
    public static void main(String[] args) {
        int[] a = {0,1,2,-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
        System.out.println(new SearchInRotateArray().search(a,-9));
    }
    public int search(int[] A, int target) {
        // write your code here
        int begin = 0;
        int end = A.length-1;
        while(begin<=end){
            int mid = begin + (end - begin)/2;
            if(A[mid] == target) return mid;
            if(A[begin]<=A[mid]){
                if(target<A[mid]&&target>=A[begin]){
                    end = mid - 1;
                }
                else begin = mid + 1;
            }
            if(A[mid]<=A[end]){
                if(target>A[mid]&&target<=A[end]){
                    begin = mid + 1;
                }
                else end = mid - 1;
            }
        }
        return -1;
    }
}
