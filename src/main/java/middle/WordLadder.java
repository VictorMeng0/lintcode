package middle;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by menghan on 2018/9/3.
 */
public class WordLadder {
    public static void main(String[] args) {
        String start = "qa";
        String end = "sq";
        String[] dic = {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};
        Set<String> set = new HashSet<>();
        for(String str:dic) set.add(str);
        System.out.println(new WordLadder().ladderLength(start,end,set));
    }
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if(start.equals(end)) return 0;
        Queue<String> fromSet = new LinkedList<>();
        Queue<String> toSet = new LinkedList<>();
        fromSet.add(start);
        toSet.add(end);
        Set<String> cache = new HashSet<>();
        int len = 0;
        if(dict.contains(start)) dict.remove(start);
        if(dict.contains(end)) dict.remove(end);
        while(!fromSet.isEmpty()){
            int size = fromSet.size();
            for(int i=0;i<size;i++){
                String str = fromSet.poll();
                for(int j=0;j<26;j++){
                    for(int k=0;k<str.length();k++){
                        String trans = str.substring(0,k)+(char)('a'+j)+str.substring(k+1);
                        if(toSet.contains(trans)) return len+2;
                        if(!cache.contains(trans)&&dict.contains(trans)){
                            fromSet.add(trans);
                            cache.add(trans);
                        }
                    }
                }
            }
            Queue<String> tmp = fromSet;
            fromSet = toSet;
            toSet = tmp;
            len++;
        }
        return 0;
    }
}
