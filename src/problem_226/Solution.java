package problem_226;
// 226. 翻转二叉树
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if( root == null ){
            return null ;
        }
        TreeNode left = root.left ;
        TreeNode right = root.right ;
        if( left == null && right == null ){
            return root ;
        }
        root.left = right ;
        root.right = left ;
        invertTree(left)  ;
        invertTree(right) ;
        return root ;
    }
}