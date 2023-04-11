package problem_94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 二叉树的中序遍历
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>() ;
        Stack<TreeNode> stack = new Stack<>() ;
        while( root != null || !stack.isEmpty() ){
            while ( root != null ){
                stack.push(root) ;
                root = root.left ;
            }
            root = stack.pop() ;
            list.add(root.val) ;
            root = root.right ;
        }
        return list ;
    }
}