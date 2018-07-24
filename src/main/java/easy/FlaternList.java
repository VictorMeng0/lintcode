package easy;

import java.util.ArrayList;
import java.util.List;

public class FlaternList {
    public static void main(String[] args) {

    }




    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> res = new ArrayList<Integer>();
        getRes(res,nestedList);
        return res;
    }

    public void getRes(List<Integer> res,List<NestedInteger> nestedList){
        for(NestedInteger nest:nestedList){
            if(nest.isInteger()){
                res.add(nest.getInteger());
            }else{
                getRes(res,nest.getList());
            }
        }
    }


}
