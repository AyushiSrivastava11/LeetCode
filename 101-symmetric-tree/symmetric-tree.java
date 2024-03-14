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
    public boolean isSymmetric(TreeNode root) 
    {
        return recursiveTree(root.left,root.right);
    }
    public boolean recursiveTree(TreeNode left_of_root,TreeNode right_of_root)
    {
        if(left_of_root == null && right_of_root == null)
        {
            return true;
        }
        if(left_of_root == null || right_of_root == null)
        {
            return false;
        }

        return (left_of_root.val == right_of_root.val) && recursiveTree(left_of_root.left,right_of_root.right)&& recursiveTree(left_of_root.right,right_of_root.left);
    }
   
}