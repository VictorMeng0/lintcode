package easy;

public class MergeSortedArray {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int ia = m-1;
        int ib = n-1;
        int iall = m+n-1;
        while(ia>=0&&ib>=0){
            if(A[ia]>B[ib]){
                A[iall--] = A[ia--];
            }else{
                A[iall--] = B[ib--];
            }
        }
        while(ia>=0) A[iall--] = A[ia--];
        while(ib>=0) A[iall--] = B[ib--];

    }
}
