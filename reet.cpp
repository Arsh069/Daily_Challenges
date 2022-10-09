/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:

        map<int,int> mp;
    bool res=false;
    void traverse(TreeNode* root, int k){
        if(root==nullptr){
            return ;
        }
        if(mp[k-(root->val)]){
            res = true;
        }
        mp[(root->val)]++;
        traverse(root->left,k);
        traverse(root->right,k);
    }
    bool findTarget(TreeNode* root, int k) {
        traverse(root,k);
        return res;
      
    }
};