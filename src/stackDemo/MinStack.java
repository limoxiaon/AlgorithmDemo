package stackDemo;

import java.util.Stack;

public class MinStack {

    private Stack<Integer>  min;
    private Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        min=new Stack<>();
        stack=new Stack<>();
    }

    public void push(int x) {
        if(min.isEmpty()){
            min.push(x);
        }else if(min.peek()>=x){
            min.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        int top=stack.pop();
        if(top==min.peek()){
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
