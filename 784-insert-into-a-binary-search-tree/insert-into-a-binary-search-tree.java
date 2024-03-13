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
    public TreeNode insertIntoBST(TreeNode root, int val) 
    {
        if (root == null)
        {
            return new TreeNode(val);
        }
        TreeNode dummy=root;
        TreeNode back=root;
        while(dummy!=null)
        {
            if(dummy.val > val)
            {
                back=dummy;
                dummy=dummy.left;
            }
            else if(dummy.val < val)
            {
                back=dummy;
                dummy=dummy.right;
            }
        }
        if(back.val > val)
        {
            back.left=new TreeNode(val);
        }
        else
        {
            back.right=new TreeNode(val);
        }
       return root;
    }
}