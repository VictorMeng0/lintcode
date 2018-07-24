package easy;

public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A.length == 0) return 0;
        int begin = 0;
        int end = A.length-1;
        while(begin <= end){
            int mid = (begin + end)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) end = mid - 1;
            else begin = mid + 1;
        }
        return begin;
    }
}
