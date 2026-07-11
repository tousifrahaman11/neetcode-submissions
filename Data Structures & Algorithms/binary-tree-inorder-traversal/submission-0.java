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
     List<Integer> li;
    public List<Integer> inorderTraversal(TreeNode root) {
       li = new ArrayList<>();
        inorder(root);
        return li;
    }
    void inorder(TreeNode node){
        if(node == null) return;

        inorder(node.left);
        li.add(node.val);
        inorder(node.right);
    }
}