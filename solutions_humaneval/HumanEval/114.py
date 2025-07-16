# Prompt:

def minSubArraySum(nums):
    """
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
    """

# Solution:

def minSubArraySum(nums):
    """
    Given an array of integers nums, find the minimum sum of any non-empty sub-array
    of nums.
    Example
    minSubArraySum([2, 3, 4, 1, 2, 4]) == 1
    minSubArraySum([-1, -2, -3]) == -6
    """
# coding: utf-8

def reverse(nums):
    """
    Reverse an array in place.
    Example
    reverse([1, 2, 3, 4]) == [4, 3, 2, 1]
    """
    for i in range(len(nums) // 2):
        # swap
        nums[i], nums[-(i + 1)] = nums[-(i + 1)], nums[i]
    return nums

def shuffle(nums):
    """
    Given an array nums consisting of 2n elements in the form [x1, x