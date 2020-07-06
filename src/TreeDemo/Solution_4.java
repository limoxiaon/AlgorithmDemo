package TreeDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//层序遍历
public class Solution_4 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null) {
            queue.offer(root);
        }
        List<Integer> list=new LinkedList<>();
        if(root!=null) {
            list.add(root.val);
        }
        if(!list.isEmpty()) {
            lists.add(list);
        }
        while(!queue.isEmpty()){
            List<Integer> list1=new LinkedList<>();
            int size =queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.peek();
                if(node.left!=null){
                    queue.offer(node.left);
                    list1.add(node.left.val);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                    list1.add(node.right.val);
                }
                queue.poll();
            }
            if(!list1.isEmpty()) {
                lists.add(list1);
            }
        }
        return lists;
    }
}
