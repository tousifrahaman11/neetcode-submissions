/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int lft = dfs(root.left);
        int rg = dfs(root.right);

        if(Math.abs(lft - rg) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int dfs(TreeNode root){
        if(root == null) return 0;

        int lf = dfs(root.left);
        int rg = dfs(root.right);
        return 1+Math.max(lf, rg);
    }
}
