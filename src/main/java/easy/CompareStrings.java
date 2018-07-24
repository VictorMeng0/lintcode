package easy;

public class CompareStrings {
    public boolean compareStrings(String A, String B) {
        // write your code here
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        int[] tmp = new int[26];
        for(char cha : a){
            tmp[cha-'A']++;
        }
        for(char cha: b){
            if(--tmp[cha-'A']<0) return false;
        }
        return true;
    }
}
