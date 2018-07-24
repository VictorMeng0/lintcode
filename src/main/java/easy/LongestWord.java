package easy;

import java.util.ArrayList;
import java.util.List;

public class LongestWord {
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        List<String> res = new ArrayList<String>();
        int maxlen = 0;
        for(String str:dictionary){
            if(str.length()>maxlen){
                res = new ArrayList<String>();
                res.add(str);
                maxlen = str.length();
            }else if(str.length()==maxlen){
                res.add(str);
            }
        }
        return res;
    }
}
