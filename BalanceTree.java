/* Balanced Binary Tree
 
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 */


class Solution {
    boolean f = true;
    public boolean isBalanced(TreeNode root) {
         int k = check(root);
        
          return f;
    }
    public int  check(TreeNode root){
        if(root == null)
            return -1;
        int l =  1 + check(root.left);
        int r =  1 + check(root.right);
        if(Math.abs(l-r) >= 2){
            f = false;
        
        }
        return Math.max(l,r);
    }
}
