package TreeDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

public class Solution_3 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<Integer>();
        Stack<TreeNode>stack=new Stack<TreeNode>();
        TreeNode q=null;
        while(root!=null||!stack.isEmpty()) {
            while(root!=null) {
                stack.push(root);
                root=root.left;
            }
            if(!stack.empty()) {
                root=stack.peek();//取得结点但不让它出栈
                if((root.right==null)||(root.right==q)){//判断该节点的右结点是否访问过
                    stack.pop();
                    list.add(root.val);
                    q=root;
                    root=null;
                }
                else{
                    root=root.right;
                }
            }
        }
        return list;
    }
}
