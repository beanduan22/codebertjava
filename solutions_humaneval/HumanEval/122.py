# Prompt:

def add_elements(arr, k):
    """
    Given a non-empty array of integers arr and an integer k, return
    the sum of the elements with at most two digits from the first k elements of arr.

    Example:

        Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
        Output: 24 # sum of 21 + 3

    Constraints:
        1. 1 <= len(arr) <= 100
        2. 1 <= k <= len(arr)
    """

# Solution:

def add_elements(arr, k):
    """
    Given a non-empty array of integers arr and an integer k, return
    the sum of the elements with at most two digits from the first k elements of arr.

    Example:

        Input: arr = [111,21,3,4000,5,6,7,8,9], k = 4
        Output: 24 # sum of 21 + 3

    Constraints:
        1. 1 <= len(arr) <= 100
        2. 1 <= k <= len(arr)
    """
/problems/hackerrank/count_triplets/solution.py
import math
import os
import random
import re
import sys

# Complete the countTriplets function below.
def countTriplets(arr, r):
    if r == 1:
        return findCountOfTriplets(arr)
    counter = dict()
    count = 0
    for element in arr:
        if counter.get(element) == None:
            counter[element] = 1
        else:
            counter[element] += 1
    for key in counter:
        if counter.get(key