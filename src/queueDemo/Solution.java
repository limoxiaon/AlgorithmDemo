package queueDemo;

import java.util.LinkedList;
import java.util.Queue;

//解决完全平方数
public class Solution {

    public int numSquares(int n){
        Queue<Integer> queue=new LinkedList<>();
        int step=0;     //深度
        queue.offer(n); //添加根节点

        while(!queue.isEmpty()){
            step+=1;
            int size=queue.size();

            for(int i=1;i<=size;i++){
                int cur=queue.peek();
                int sqrt=(int)Math.sqrt(cur);

                for(int j=1;j<=sqrt;j++){
                    if (cur==j*j){
                        return step;
                    }else {
                        queue.offer(cur - j * j);
                    }
                }
                queue.poll();
            }
        }
        return step-1;
    }
}
