package middle;

import datastructure.ListBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by menghan on 2018/8/21.
 */
public class PalindromePartitioning {
    public static void main(String[] args) {

    }
    public List<List<String>> partition(String s) {
        // write your code here
        List<List<String>> res = new ArrayList<>();
        doSeparate(res,new ArrayList<>(),0,s);
        return res;
    }
    public void doSeparate(List<List<String>> res,List<String> list,int begin, String s){
        if(begin == s.length()){
            List<String> tmp = new ArrayList<>(list);
            res.add(tmp);
            return;
        }
        for(int i = begin;i<s.length();i++){
            if(isPalindrome(s.substring(begin,i+1).toCharArray())){
                list.add(s.substring(begin,i+1));
                doSeparate(res,list,i+1,s);
                list.remove(list.size()-1);
            }
        }

    }
    public boolean isPalindrome(char[] s){
        int begin = 0;
        int end = s.length-1;
        int left = (begin+end)/2;
        int right = (begin+end+1)/2;
        while(left>=0&&right<s.length){
            if(s[left]!=s[right]) return false;
            left--;
            right++;
        }
        return true;
    }
}
