package MinStack;

import java.util.Stack;

public class MinStack {

    /**
     * 这里的思路是：stack中存放的是当前需要push进来的值与当前min值得差值
     * 所以在push和pop的时候都需要更新当前的min（重点理解)
     */
    long min;
    Stack<Long> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0L);
            min = x;
        } else {
            stack.push(x - min);
            min = x < min ? x : min;
        }
    }

    public int getMin() {
        return (int)min;
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        long val = stack.pop();
        if (val < 0) {
            min = min - val;
        }
    }

    public int top() {
        long top = stack.peek();
        if (top > 0) {
            return (int)(top+min);
        }else{
            return (int)min;
        }
    }
}