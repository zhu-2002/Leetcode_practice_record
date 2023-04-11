package problem_104;

import static java.lang.Math.max;
 // 得到树的深度
public class Solution {
    public int maxDepth(TreeNode root) {
        if ( root == null ){
            return 0 ;
        }
        else {
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right)) ;
        }
    }
}