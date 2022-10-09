class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int n=nums.size(), ans,mn=INT_MAX;
sort(nums.begin(),nums.end());
for(int i=0;i<n-2;i++)
{
int k=i+1, j=n-1;
while(k<j)
{
int sum=nums[i]+nums[j]+nums[k];
if(sum==target)
return sum;
else if(sum>target)
j--;
else
k++;
if(abs(sum-target)<mn)
{
mn=abs(sum-target);
ans=sum;
}
}
}
return ans;
    }
};