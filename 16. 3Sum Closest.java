// Problem Link - https://leetcode.com/problems/3sum-closest/

class Solution {
    int ans = 10000001;
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
            twoSumSorted(i+1,nums.length-1,nums,target-nums[i]);
        return ans;
    }
    
    public void twoSumSorted(Integer start, int end, int[] nums, int target)
    {
        int val = nums[start-1];
        while(start<end)
        {
            if(Math.abs(val+target-(val+nums[start]+nums[end]))<Math.abs(val+target-ans))
                ans = (val+nums[start]+nums[end]);
            if(nums[start]+nums[end]>target)
                end--;
            else if(nums[start]+nums[end]<target)
                start++;
            else
            {
                ans = val + target;
                start++;
                end--;
            }
            
        }
    }
}