package easy;

import java.util.Stack;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsInString().reverseWords(" the sky is blue"));
    }
    public String reverseWords(String s) {
        // write your code here
        char[] arr = s.trim().toCharArray();
        int i = 0;
        Stack<String> stack = new Stack<String>();
        while(i<arr.length){
            StringBuilder sb = new StringBuilder();
            while(i<arr.length&&arr[i]!=' ')
                sb.append(arr[i++]);
            while(i<arr.length&&arr[i]==' ')
                i++;
            stack.push(sb.toString());
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop()+" ");
        }
        return res.toString().trim();
    }
}
