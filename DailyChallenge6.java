/*
LEETCODE-1578

Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help.
Bob can remove some balloons from the rope to make it colorful.
You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
Return the minimum time Bob needs to make the rope colorful.
 */

import java.util.*;

public class DailyChallenge6 {
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
