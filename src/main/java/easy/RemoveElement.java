package easy;

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        // write your code here
        int index = 0;
        int end = A.length-1;
        while(index<end){
            if(A[index] == elem){
                swap(A, index, end--);
            }else {
                index++;
            }
        }
        if(A[index] == elem) return index;
        else return index+1;
    }
    public void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
