package middle;

/**
 * Created by menghan on 2018/8/10.
 */
public class FindPeakElement {
    public int findPeak(int[] A) {
        // write your code here
        for(int min = 0, max = A.length -1, mid = max / 2 ; min < max ; mid = (min + max) / 2){
            if(min == mid) return A[min] < A[max] ? max : min;
            min = A[mid] < A[mid+1] ? mid : min;
            max = A[mid] > A[mid+1] ? mid : max;
        }
        return 0;

    }
}
