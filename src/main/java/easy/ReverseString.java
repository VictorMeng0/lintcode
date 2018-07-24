package easy;

public class ReverseString {
    public static void main(String[] args) {

    }
    public void rotateString(char[] str, int offset) {
        // write your code here
        if(str.length==0) return;
        if(offset>str.length) offset%=str.length;
        rotate(str, 0, str.length-offset-1);
        rotate(str, str.length-offset, str.length-1);
        rotate(str,0 , str.length-1);

    }
    public void rotate(char[] str, int begin, int end){
        while(begin<end){
            char tmp = str[begin];
            str[begin] = str[end];
            str[end] = tmp;
            begin++;
            end--;
        }
    }
}
