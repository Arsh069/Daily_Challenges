/*
LEETCODE-1578

Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help.
Bob can remove some balloons from the rope to make it colorful.
You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
Return the minimum time Bob needs to make the rope colorful.
 */

import java.util.Arrays;

public class DailyChallenge2 {
    public int minCost(String colors, int[] time) {
        int n=colors.length();
        if(n==1){
            return 0;
        }
        int p1=0;
        int p2=1;
        int ans=0;
        while(p2<n){
            if(colors.charAt(p1)==colors.charAt(p2)){
                ans+=Math.min(time[p1],time[p2]);
                time[p2]=Math.max(time[p1],time[p2]);
            }
            p1++;
            p2++;
        }
        return ans;
    }
}
