package middle;

/**
 * Created by menghan on 2018/8/7.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs.length<1) return "";
        int min = 0;
        int minLen = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<minLen) {
                minLen = strs[i].length();
                min = i;
            }
        }
        String res = strs[min];
        for(String str:strs){
            int index = 0;
            while(index<res.length()&&str.charAt(index)==res.charAt(index)) index++;
            res = res.substring(0,index);
        }
        return res;
    }
}
