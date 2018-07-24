package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueCharacters {
    public static void main(String[] args) {
        List<String> res = new ArrayList<String>(){{add("ABc");add("TBD");}}.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(res);
    }
    public boolean isUnique(String str) {
        // write your code here
        int[] tmp = new int[256];
        char[] arr = str.toCharArray();
        for(char ch:arr){
            if(++tmp[ch]>1) return false;
        }
        return true;
    }
}
