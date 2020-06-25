package stackDemo;

import java.util.LinkedList;
import java.util.Queue;
//用队列实现栈
public class MyStack {

    private Queue<Integer> queue;
    private Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size=queue.size();
        int num=0;
        for(int i=1;i<=size;i++){
            int temp=queue.poll();
            if(i!=size)
                queue2.offer(temp);
            else{
                num=temp;
            }
        }
        while(!queue2.isEmpty()){
            int temp=queue2.poll();
            queue.offer(temp);
        }
        return num;
    }

    /** Get the top element. */
    public int top() {
        int size=queue.size();
        int num=0;
        for(int i=1;i<=size;i++){
            int temp=queue.poll();
            queue2.offer(temp);
            if(i==size)
                num=temp;

        }
        while(!queue2.isEmpty()){
            int temp=queue2.poll();
            queue.offer(temp);
        }
        return num;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
