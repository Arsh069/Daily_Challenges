"""
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
"""

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        i=0
        m=len(nums)
        ans=float('inf')
        while(i<m-2):
            j=i+1
            k=m-1
            while(j<k):
                x=nums[k]+nums[j]+nums[i]
                if(abs(x-target)<abs(ans-target)):
                    ans=x
                if(x<=target):
                    j+=1
                elif(x>target):
                    k-=1
            i+=1
        return ans
