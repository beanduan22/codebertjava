# Prompt:
You are given a 0-indexed integer array nums representing the score of students in an exam. The teacher would like to form one non-empty group of students with maximal strength, where the strength of a group of students of indices i_0, i_1, i_2, ... , i_k is defined as nums[i_0] * nums[i_1] * nums[i_2] * ... * nums[i_k​].
Return the maximum strength of a group the teacher can create.
 
Example 1:

Input: nums = [3,-1,-5,2,5,-9]
Output: 1350
Explanation: One way to form a group of maximal strength is to group the students at indices [0,2,3,4,5]. Their strength is 3 * (-5) * 2 * 5 * (-9) = 1350, which we can show is optimal.

Example 2:

Input: nums = [-4,-5,-4]
Output: 20
Explanation: Group the students at indices [0, 1] . Then, we’ll have a resulting strength of 20. We cannot achieve greater strength.

 
Constraints:

1 <= nums.length <= 13
-9 <= nums[i] <= 9
# Solution:
You are given a 0-indexed integer array nums representing the score of students in an exam. The teacher would like to form one non-empty group of students with maximal strength, where the strength of a group of students of indices i_0, i_1, i_2, ... , i_k is defined as nums[i_0] * nums[i_1] * nums[i_2] * ... * nums[i_k​].
Return the maximum strength of a group the teacher can create.
 
Example 1:

Input: nums = [3,-1,-5,2,5,-9]
Output: 1350
Explanation: One way to form a group of maximal strength is to group the students at indices [0,2,3,4,5]. Their strength is 3 * (-5) * 2 * 5 * (-9) = 1350, which we can show is optimal.

Example 2:

Input: nums = [-4,-5,-4]
Output: 20
Explanation: Group the students at indices [0, 1] . Then, we’ll have a resulting strength of 20. We cannot achieve greater strength.

 
Constraints:

1 <= nums.length <= 13
-9 <= nums[i] <= 9
The answer to the problem is an integer within the range [-231, 231 – 1].
 
*/

#include"head.h"
class Solution {
	public:
		long long maxStrength(vector<int>& nums) {
			long long res=0;
			int n=nums.size();
			vector<long long> pre(n,1),suf(n,1);
			for(int i=0;i<n;i++)
			{
				pre[i]=pre[i-1]*nums[