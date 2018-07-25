package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> list = new FizzBuzz().fizzBuzz(15);
        for(String str:list)
            System.out.println(str);
    }
    public List<String> fizzBuzz(int n) {
        // write your code here

        List<String> res= new ArrayList<String>(n);
        for(int i = 1;i<=n;i++){
            if(i%15==0) res.add("fizz buzz");
            else if(i%3==0) res.add("fizz");
            else if(i%5==0) res.add("buzz");
            else res.add(i+"");
        }
        return res;
    }
}
