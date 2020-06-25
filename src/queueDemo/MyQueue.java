package queueDemo;

import java.util.Stack;

//用栈实现队列
public class MyQueue {

    private Stack<Integer> stack;

    private Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack=new Stack<>();
        stack2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!stack.isEmpty()){
            int temp=stack.pop();
            stack2.push(temp);
        }
        int num=stack2.pop();
        while(!stack2.isEmpty()){
            int temp=stack2.pop();
            stack.push(temp);
        }
        return num;
    }

    /** Get the front element. */
    public int peek() {
        while(!stack.isEmpty()){
            int temp=stack.pop();
            stack2.push(temp);
        }
        int num=stack2.peek();
        while(!stack2.isEmpty()){
            int temp=stack2.pop();
            stack.push(temp);
        }
        return num;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
