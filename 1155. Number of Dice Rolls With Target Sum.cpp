// Problem Link - https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/

#define ll int
#define MOD 1000000007

class Solution {
public:
    ll dp[31][10000];
    ll num(ll i, ll n, ll k, ll target)
    {
        if(i==n and target==0)
            return 1;
        if(i==n)
            return 0;
        if(dp[i][target]!=-1)
            return dp[i][target];
        ll ans = 0;
        for(ll j=1;j<=k;j++)
            if(target-j>=0)
                ans = (ans + num(i+1,n,k,target-j))%MOD;
        return dp[i][target] = ans;
    }
    
    int numRollsToTarget(int n, int k, int target) {
        memset(dp,-1,sizeof(dp));
        return num(0,n,k,target);
    }
};