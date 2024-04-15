class Solution 
{ 
    public int sumNumbers(TreeNode root) 
    {
     return recursiveAns(0,root);   
    }
    int recursiveAns(int num , TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            return num*10+root.val;
        }
        int sum=root.val+num*10;
        return recursiveAns(sum,root.left)+recursiveAns(sum,root.right);
    }
}