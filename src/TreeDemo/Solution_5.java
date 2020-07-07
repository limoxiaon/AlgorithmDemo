package TreeDemo;
//求二叉树的最大深度
public class Solution_5 {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int left_depth=maxDepth(root.left);
        int right_depth=maxDepth(root.right);

        return max(left_depth,right_depth)+1;
    }

    public int max(int left,int right){
        if(left>right){
            return left;
        }else {
            return right;
        }
    }

}
