# Prompt:
You are given a 0-indexed integer array nums. You have to find the maximum sum of a pair of numbers from nums such that the maximum digit in both numbers are equal.
Return the maximum sum or -1 if no such pair exists.
 
Example 1:

Input: nums = [51,71,17,24,42]
Output: 88
Explanation: 
For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88. 
For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
It can be shown that there are no other pairs with equal maximum digits, so the answer is 88.
Example 2:

Input: nums = [1,2,3,4]
Output: -1
Explanation: No pair exists in nums with equal maximum digits.

 
Constraints:

2 <= nums.length <= 100
1 <= nums[i] <= 10^4
# Solution:
You are given a 0-indexed integer array nums. You have to find the maximum sum of a pair of numbers from nums such that the maximum digit in both numbers are equal.
Return the maximum sum or -1 if no such pair exists.
 
Example 1:

Input: nums = [51,71,17,24,42]
Output: 88
Explanation: 
For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88. 
For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
It can be shown that there are no other pairs with equal maximum digits, so the answer is 88.
Example 2:

Input: nums = [1,2,3,4]
Output: -1
Explanation: No pair exists in nums with equal maximum digits.

 
Constraints:

2 <= nums.length <= 100
1 <= nums[i] <= 10^4

*/

#include"head.h"

class Solution {
    public:
        int maximumSum(vector<int>& A) {
        unordered_map<int,int> h;
        int res=-1;
        for(int i=0;i<A.size();i++)
        {
            int mx=0;
            int x=A[i];
            while(x>0)
            {
                mx=max(mx,x%10);
                x/=10;
            }
            if(h.count(mx))
                res=max(res,A[