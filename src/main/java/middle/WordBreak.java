package middle;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by menghan on 2018/9/4.
 */
public class WordBreak {
    public static void main(String[] args) {
        Set<String> dict = new HashSet<>();
        dict.add("lint");
        dict.add("code");
        System.out.println(new WordBreak().wordBreak("lint2code",dict));
    }
    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here
        if(s == null || s.length() == 0) return true;

        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;

        for(int i = 0; i < s.length(); i++) {
            if(!res[i])
                continue;
            else {
                for(String str : dict) {
                    int end = i + str.length();
                    if(end > s.length()) continue;
                    if(s.substring(i, end).equals(str))
                        res[end] = true;
                }
            }
        }
        return res[s.length()];
    }

}
