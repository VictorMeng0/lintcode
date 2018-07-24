package easy;

public class ValidAnagram {
    public boolean anagram(String s, String t) {
        // write your code here
        int[] arr = new int[256];
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int j = 0;j<t.length();j++){
            if(--arr[t.charAt(j)]<0) return false;
        }
        for(int num : arr) {
            if(num!=0) return false;
        }
        return true;
    }
}
