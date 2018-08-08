package middle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by menghan on 2018/8/7.
 */
public class MinimumWindowSubString {
    public static void main(String[] args) {
        System.out.println(new MinimumWindowSubString().minWindow("adfqeradboaf23098724huhfda923hadf78adfhadfhadfaodiyfas8","dfje89affefy8f"));

    }
    public String minWindow(String source , String target) {
        // write your code here
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<target.length();i++){
            Integer val = map.getOrDefault(target.charAt(i),0);
            map.put(target.charAt(i),val+1);
        }
        int len = target.length();
        int begin = 0;
        int end = 0;
        int minLen = source.length();
        String res = source;
        while(end<source.length()){
            if(map.containsKey(source.charAt(end))) {
                char ch = source.charAt(end);
                if(map.get(ch)>0){
                    len--;
                }
                map.put(ch,map.get(ch)-1);
                if(len==0){
                    char chBegin = source.charAt(begin);
                    while((map.containsKey(chBegin)&&map.get(chBegin)<0)||!map.containsKey(chBegin)){
                        if(map.containsKey(chBegin)&&map.get(chBegin)<0){
                            Integer nums = map.get(chBegin);
                            map.put(chBegin,nums+1);
                        }
                        begin++;
                        chBegin = source.charAt(begin);
                    }
                }
            }
            if(len==0&&end-begin+1<minLen) {
                minLen = end-begin+1;
                res = source.substring(begin,end+1);
            }
            end++;
        }
        return len==0?res:"";
    }
}
