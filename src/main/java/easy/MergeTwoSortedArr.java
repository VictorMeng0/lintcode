package easy;

public class MergeTwoSortedArr {
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int c[] = new int[A.length+B.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<A.length&&j<B.length){
            if(A[i]<=B[j]){
                c[k++] = A[i];
                i++;
            }else{
                c[k++] = B[j];
                j++;
            }
        }
        while(i<A.length) c[k++] = A[i++];
        while(j<B.length) c[k++] = B[j++];
        return c;
    }
}
