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
private:
    void getMode(TreeNode* root, unordered_map<int, int>& hash) {
        if(root == NULL) {
            return;
        }
        hash[root->val] += 1;

        getMode(root->left, hash);
        getMode(root->right, hash);
    }
    // bool static mySort(const pair<int, int> p1, const pair<int, int> p2) {
    //     return p1.first > p2.first;
    // }
public:
    vector<int> findMode(TreeNode* root) {
        unordered_map<int, int> hash;
        getMode(root, hash);

        int n = hash.size();
        vector<pair<int, int>> freq(n);
        int i=0;
        for(const auto it: hash) {
            // cout<<it.first<<" - "<<it.second<<endl;
            freq[i++] = make_pair( it.second, it.first );
        }
        // for(auto it: freq) {
        //     cout<<it.first<<" - "<<it.second<<endl;
        // }
        sort(freq.rbegin(), freq.rend());
        for(auto it: freq) {
            cout<<it.first<<" - "<<it.second<<endl;
        }

        vector<int> res;
        i=0;
        while(i<n && freq[i].first == freq[0].first) {
            res.emplace_back( freq[i++].second );
        }
        return res;
    }
};