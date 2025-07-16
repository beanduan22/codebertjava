# Prompt:

def count_nums(arr):
    """
    Write a function count_nums which takes an array of integers and returns
    the number of elements which has a sum of digits > 0.
    If a number is negative, then its first signed digit will be negative:
    e.g. -123 has signed digits -1, 2, and 3.
    >>> count_nums([]) == 0
    >>> count_nums([-1, 11, -11]) == 1
    >>> count_nums([1, 1, 2]) == 3
    """

# Solution:

def count_nums(arr):
    """
    Write a function count_nums which takes an array of integers and returns
    the number of elements which has a sum of digits > 0.
    If a number is negative, then its first signed digit will be negative:
    e.g. -123 has signed digits -1, 2, and 3.
    >>> count_nums([]) == 0
    >>> count_nums([-1, 11, -11]) == 1
    >>> count_nums([1, 1, 2]) == 3
    """

### END OF EXERCISE 3 ###
# Exercise 3: List Recursion

## Introduction

List recursion is the process of using recursion to process a list. A recursive function for a list will be given a list as an argument and return either a list or a scalar value. The main idea is that a recursive function must "do something" to the first item in the list, then call itself with the rest of the list as an argument.

## Instructions

For this exercise, you will implement three functions that use list recursion to operate on lists. Each function is described below