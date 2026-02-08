class Solution 
{
    public boolean isBalanced(TreeNode root) 
    {
        if(root == null)
        {
            return true;
        }
        int leftCal=calculateHeight(root.left);
        int rightCal=calculateHeight(root.right);
        int ans= leftCal-rightCal;
        if(ans == 0 || ans == 1 || ans== -1)
        {
            return isBalanced(root.left)&&isBalanced(root.right);
            // return true;
        }
        return false;
    }

    public int calculateHeight(TreeNode node)
    {
        
        if(node == null)
        {
            return 0;
        }

        return Math.max(calculateHeight(node.left),calculateHeight(node.right))+1;
    }
}