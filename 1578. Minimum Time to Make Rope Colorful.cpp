// Problem Link - https://leetcode.com/problems/minimum-time-to-make-rope-colorful/

#define ll int

class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        ll pre = 0;
        ll n = colors.size();
        ll ans = 0;
        for(ll i=1;i<n;i++)
        {
            if(colors[i]==colors[pre])
            {
                if(neededTime[i]<neededTime[pre])
                    ans += neededTime[i];
                else
                    ans += neededTime[pre], pre = i;
            }
            else
                pre = i;
        }
        return ans;
    }
};