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
class Solution 
{
    // static int count=0;
    public int sumOfLeftLeaves(TreeNode root) 
    {
        if(root.left == null && root.right == null) return 0;
        return CalSum(root,false);
    }
    public int CalSum(TreeNode root,boolean isLeft)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            return isLeft?root.val:0;
        }

        return CalSum(root.left,true) + CalSum(root.right,false);

    }
}