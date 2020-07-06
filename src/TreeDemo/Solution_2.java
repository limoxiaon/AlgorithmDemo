package TreeDemo;

import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
//中序遍历
public class Solution_2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack();
        List<Integer> list=new LinkedList<>();

        while(!stack.isEmpty()||root!=null) {
            while(root!=null){
                    stack.push(root);
                    root=root.left;
            }
            if(!stack.isEmpty()){
                TreeNode temp=stack.pop();
                list.add(temp.val);
                root=temp.right;
            }
        }
        return list;
    }
}
