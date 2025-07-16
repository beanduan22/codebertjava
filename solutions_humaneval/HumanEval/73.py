# Prompt:

def smallest_change(arr):
    """
    Given an array arr of integers, find the minimum number of elements that
    need to be changed to make the array palindromic. A palindromic array is an array that
    is read the same backwards and forwards. In one change, you can change one element to any other element.

    For example:
    smallest_change([1,2,3,5,4,7,9,6]) == 4
    smallest_change([1, 2, 3, 4, 3, 2, 2]) == 1
    smallest_change([1, 2, 3, 2, 1]) == 0
    """

# Solution:

def smallest_change(arr):
    """
    Given an array arr of integers, find the minimum number of elements that
    need to be changed to make the array palindromic. A palindromic array is an array that
    is read the same backwards and forwards. In one change, you can change one element to any other element.

    For example:
    smallest_change([1,2,3,5,4,7,9,6]) == 4
    smallest_change([1, 2, 3, 4, 3, 2, 2]) == 1
    smallest_change([1, 2, 3, 2, 1]) == 0
    """

def min_jumps(arr):
    """
    You are given a list of non-negative integers and a starting position
    representing a valid index in the array. Each element in the array
    represents the maximum number of steps you can take forward.

    Write a function that returns the minimum number of jumps needed to reach
    the end of the array starting from the given index.

    For example, given the list [2, 3, 1, 1, 2, 0, 1] and the starting position
    is index 0, your program should return 4 as it is the minimum number