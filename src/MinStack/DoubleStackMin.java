package MinStack;

import java.util.Stack;

public class DoubleStackMin {
    private Stack<Integer> stackData;//数据栈
    private Stack<Integer> stackMin;//保存当前最小数的栈（称最小栈）

    public DoubleStackMin(){
        stackData=new Stack<>();
        stackMin=new Stack<>();
    }

    public void push(Integer num){
        //压入时判断最小栈是否为空或者要压入的数是否比最小栈栈顶数还小，是则压入数据站的同时压入最小栈
        if(stackMin.isEmpty()||getMin()>num){
            stackMin.push(num);
        }
        stackData.push(num);
    }

    public Integer pop(){
        Integer num=stackData.pop();
        if(stackMin.peek() == num){
            stackMin.pop();
        }
        return num;
    }

    public Integer getMin(){
        return stackMin.peek();
    }
}
