package middle;

import java.util.Stack;

/**
 * Created by menghan on 2018/7/27.
 */
public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        // do intialization if necessary
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        stack.push(number);
        if(minStack.isEmpty()||minStack.peek()>=number){
            minStack.push(number);
        }
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        int num = stack.pop();
        if(num == minStack.peek())
            minStack.pop();
        return num;
    }

    /*
     * @return: An integer
     */
    public int min() {
        // write your code here
        return minStack.peek();
    }
}
