package MinStack;

import java.util.Stack;

public class Test {

    Stack<Integer> stackData;
    Stack<Integer> stackMin;

    public Test() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int val){
        if (stackMin.isEmpty() || stackMin.peek() > val) {
            stackMin.push(val);
        }
        stackData.push(val);
    }

    public void pop(){
        int popData = stackData.pop();
        if (popData == stackMin.peek()) {
            stackMin.pop();
        }
    }

    public int top(){
        return stackData.peek();
    }

    public int getMin(){
        return stackMin.peek();
    }

}
