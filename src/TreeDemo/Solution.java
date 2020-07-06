package TreeDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
//前序遍历
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack();
        List<Integer> list=new LinkedList<>();

        while(!stack.isEmpty()||root!=null){
            while(root!=null){
                stack.push(root);
                list.add(root.val);
                root=root.left;
            }
            if(!stack.isEmpty()){
                root=stack.pop().right;
            }
        }
        return list;
    }
}
