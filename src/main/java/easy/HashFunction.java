package easy;

/**
 * Created by menghan on 2018/8/21.
 */
public class HashFunction {
    public static void main(String[] args) {
        System.out.println(new HashFunction().hashCode("Wrong answer or accepted?".toCharArray(),1000000007));
    }
    public int hashCode(char[] key, int HASH_SIZE) {
        // write your code here
        int len = key.length;
        long hashcode = 0;
        long base = 1;
        for(int i=len-1;i>=0;i--){
            hashcode = hashcode  + Integer.valueOf(key[i])*base % HASH_SIZE;
            hashcode = hashcode%HASH_SIZE;
            base = base *33% HASH_SIZE;
        }
        return (int)hashcode;
    }
}
