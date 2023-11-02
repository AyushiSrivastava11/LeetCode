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
    private int count = 0;
    private int totalVal=0;
    private int result = 0;
    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return result;
    }
    private Pair<Integer, Integer> postOrder(TreeNode node){
        if (node == null)
            return new Pair(0,0);
        Pair<Integer, Integer> left =postOrder(node.left);
        Pair<Integer, Integer> right =postOrder(node.right);
        count=left.getValue()+right.getValue()+1;
        totalVal=left.getKey()+right.getKey()+node.val;
        if (node.val == totalVal/count)
            result++;
        return new Pair(totalVal, count);
        
    }
}