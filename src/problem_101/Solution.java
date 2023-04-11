package problem_101;
// 101. 对称二叉树
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if( root == null ){
            return true ;
        }else{
            return compare(root.left,root.right) ;
        }
    }
    public boolean compare( TreeNode t1 ,TreeNode t2 ){
        if ( t1 == null && t2 == null ){
            return true ;
        }else if( !(t1 != null && t2 != null) ){
            return false ;
        } else if ( t1.val != t2.val ) {
            return false ;
        } else{
            return compare(t1.left,t2.right)&&compare(t1.right,t2.left) ;
        }
    }
}
