/*
LEETCODE-1578

Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help.
Bob can remove some balloons from the rope to make it colorful.
You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
Return the minimum time Bob needs to make the rope colorful.
 */

import java.util.*;

public class DailyChallenge5 {
    public boolean func(TreeNode root,int t){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null && t-root.val==0){
            return true;
        }
        boolean left=func(root.left,t-root.val);
        boolean right=func(root.right,t-root.val);

        return left || right;
    }

    public boolean hasPathSum(TreeNode root, int t) {
        return func(root,t);
    }
}
