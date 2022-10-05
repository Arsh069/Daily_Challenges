/**
 * This is the daily challenge for October 5th 2022 
 * https://leetcode.com/problems/add-one-row-to-tree/
 *  
 * Given the root of a binary tree and two integers val & depth, add a row of nodes with value val at depth
 * Example: 
 * Input: root = [4,2,6,3,1,5], val = 1, depth = 2
 * Output: [4,1,1,2,null,null,6,3,1,5]
 *
 *Definition for a binary tree node.
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        // Case if diferent if depth == 1, since we are just adding a root node.
        if(depth==1)
        {
        TreeNode node  = new TreeNode(val);
        node.left = root;
        return node;
        }
        helper(root , val , depth ,1);
        return root;
    }
    public void helper(TreeNode root , int val , int target_depth , int current_depth)
    {
        if(root==null)
         return ;
        if(current_depth==target_depth-1)
        {
            TreeNode temp1 = root.left;
            TreeNode temp2 = root.right;
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left = temp1;
            root.right.right = temp2;
        }
        helper(root.left , val , target_depth ,current_depth+1);
        helper(root.right , val , target_depth ,current_depth+1);


    }
}