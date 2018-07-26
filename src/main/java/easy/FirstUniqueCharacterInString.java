package easy;

/**
 * Created by menghan on 2018/7/26.
 */
public class FirstUniqueCharacterInString {
    public char firstUniqChar(String str) {
        // Write your code here
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++)
            arr[str.charAt(i)-'a']++;
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']==1)
                return str.charAt(i);
        }
        return 'a';
    }
}
