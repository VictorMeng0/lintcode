package middle;

/**
 * Created by menghan on 2018/8/15.
 */
public class SearchInRotateArrayII {
    public static void main(String[] args) {
        int[] arr = {9,5,6,7,8,9,9,9,9,9,9};
        System.out.println(new SearchInRotateArrayII().search(arr,8));
    }
    public boolean search(int[] A, int target) {
        // write your code here
        int begin = 0;
        int end = A.length-1;
        while(begin<=end){
            int mid = begin + (end - begin)/2;
            if(A[mid] == target) return true;
            if(A[begin]<A[mid]){
                if(target<A[mid]&&target>=A[begin]){
                    end = mid - 1;
                }
                else begin = mid + 1;
            }
            else if(A[mid]<A[end]){
                if(target>A[mid]&&target<=A[end]){
                    begin = mid + 1;
                }
                else end = mid - 1;
            }
            else begin++;
        }
        return false;
    }
}
