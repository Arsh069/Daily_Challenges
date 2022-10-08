/* Container with most water

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

  */

  class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j= height.length -1;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(i<height.length -1){
            if(i == j)
                i++;
            else if(height[i]>height [j]){
                count = (j-i)*height[j];

max = Math.max(count,max);
                j--;
                }
            else if(height[i] <= height[j]){
        
count = (j-i)*height[i];
                max = Math.max(count,max);
                j= height.length -1;
                i++;
                }
        }
        return max;
    }
}