package problem_543;

// 543. 二叉树的直径
class Solution {
    int ans = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans - 1;
    }
    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L + R + 1);
        return Math.max(L, R) + 1;
    }
}