package middle;

/**
 * Created by menghan on 2018/8/13.
 */
public class SortLettersByCase {
    public static void main(String[] args) {
        char[] ch = {'a','b','A','c','D'};
        new SortLettersByCase().sortLetters(ch);
        for(char c:ch) System.out.println(c);
    }
    public void sortLetters(char[] chars) {
        // write your code here
        int begin = 0;
        int end = chars.length-1;
        if(chars.length<1) return;
        while(begin<chars.length&&Character.isLowerCase(chars[begin])) begin++;
        while(end>=0&&Character.isUpperCase(chars[end])) end--;
        while(begin<end){
            if(Character.isUpperCase(chars[begin])){
                swap(chars,begin,end--);
            }
            else begin++;
        }
    }
    public void swap(char[] arr,int i,int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
