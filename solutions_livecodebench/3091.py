# Prompt:
You are given a 0-indexed array nums of non-negative integers, and two integers l and r.
Return the count of sub-multisets within nums where the sum of elements in each subset falls within the inclusive range of [l, r].
Since the answer may be large, return it modulo 10^9 + 7.
A sub-multiset is an unordered collection of elements of the array in which a given value x can occur 0, 1, ..., occ[x] times, where occ[x] is the number of occurrences of x in the array.
Note that:

Two sub-multisets are the same if sorting both sub-multisets results in identical multisets.
The sum of an empty multiset is 0.

 
Example 1:

Input: nums = [1,2,2,3], l = 6, r = 6
Output: 1
Explanation: The only subset of nums that has a sum of 6 is {1, 2, 3}.

Example 2:

Input: nums = [2,1,4,2,7], l = 1, r = 5
Output: 7
Explanation: The subsets of nums that have a sum within the range [1, 5] are {1}, {2}, {4}, {2, 2}, {1, 2}, {1, 4}, and {1, 2, 2}.

Example 3:

Input: nums = [1,2,1,3,5,2], l = 3, r = 5
Output: 9
Explanation: The subsets of nums that have a sum within the range [3, 5] are {3}, {5}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {1, 1, 2}, {1, 1, 3}, and {1, 2, 2}.
 
Constraints:

1 <= nums.length <= 2 * 10^4
0 <= nums[i] <= 2 * 10^4
Sum of nums does not exceed 2 * 10^4.
0 <= l <= r <= 2 * 10^4
# Solution:
You are given a 0-indexed array nums of non-negative integers, and two integers l and r.
Return the count of sub-multisets within nums where the sum of elements in each subset falls within the inclusive range of [l, r].
Since the answer may be large, return it modulo 10^9 + 7.
A sub-multiset is an unordered collection of elements of the array in which a given value x can occur 0, 1, ..., occ[x] times, where occ[x] is the number of occurrences of x in the array.
Note that:

Two sub-multisets are the same if sorting both sub-multisets results in identical multisets.
The sum of an empty multiset is 0.

 
Example 1:

Input: nums = [1,2,2,3], l = 6, r = 6
Output: 1
Explanation: The only subset of nums that has a sum of 6 is {1, 2, 3}.

Example 2:

Input: nums = [2,1,4,2,7], l = 1, r = 5
Output: 7
Explanation: The subsets of nums that have a sum within the range [1, 5] are {1}, {2}, {4}, {2, 2}, {1, 2}, {1, 4}, and {1, 2, 2}.

Example 3:

Input: nums = [1,2,1,3,5,2], l = 3, r = 5
Output: 9
Explanation: The subsets of nums that have a sum within the range [3, 5] are {3}, {5}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {1, 1, 2}, {1, 1, 3}, and {1, 2, 2}.
 
Constraints:

1 <= nums.length <= 2 * 10^4
0 <= nums[i] <= 2 * 10^4
Sum of nums does not exceed 2 * 10^4.
0 <= l <= r <= 2 * 10^4
"""

class Solution:
    def countSubsets(self, nums: List[int], l: int, r: int) -> int:
        """
        We can solve this problem using bitmask and prefix sum.
        We use a prefix sum array to store the sum of all subsets with mask.
        If the sum of the subset is in the range [l, r], then we can add the count of elements to the result.
        """
        mod = 10 ** 9 + 7
        n = len(nums)
        mask_len = 1 << n
        sums = [0