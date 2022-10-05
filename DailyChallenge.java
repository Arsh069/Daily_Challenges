/*
LEETCODE-1155

You have n dice and each die has k faces numbered from 1 to k.
Given three integers n, k, and target,
return the number of possible ways (out of the kn total ways) to roll the dice so the sum of the face-up numbers equals target.
Since the answer may be too large, return it modulo 109 + 7.
 */

import java.util.Arrays;

public class DailyChallenge {
    final int mod=1000000007;
    public int func(int n,int k,int t,int dp[][]){
        if(n==0 && t==0){
            return 1%mod;
        }
        if(n==0 || t<0){
            return 0%mod;
        }
        if(dp[n][t]!=-1){
            return dp[n][t]%mod;
        }
        int pick=0;
        for(int i=1;i<=k;i++){
            pick=pick%mod+func(n-1,k,t-i,dp)%mod;
        }
        return dp[n][t]=pick%mod;
    }

    public int numRollsToTarget(int n, int k, int target) {
        int dp[][]=new int[n+1][target+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return func(n,k,target,dp);
    }
}
