class Solution {
public:
    void solve(TreeNode* root, int val, int depth) {
        if (!root) return;
        if (depth==2) {
            TreeNode *one, *two;
            one = new TreeNode(val);
            two = new TreeNode(val);
            one->left = root->left;
            two->right = root->right;
            root->left = one;
            root->right = two;
        } else {
            solve(root->left, val, depth-1);
            solve(root->right, val, depth-1);
        }
    }
  
    TreeNode* addOneRow(TreeNode* root, int val, int depth) {
        if (depth==1) {
            TreeNode* temp = new TreeNode(val);
            temp->left = root;
            return temp;
        }
        solve(root, val, depth);
        return root;
    }
};
