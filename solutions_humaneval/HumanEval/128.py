# Prompt:

def prod_signs(arr):
    """
    You are given an array arr of integers and you need to return
    sum of magnitudes of integers multiplied by product of all signs
    of each number in the array, represented by 1, -1 or 0.
    Note: return None for empty arr.

    Example:
    >>> prod_signs([1, 2, 2, -4]) == -9
    >>> prod_signs([0, 1]) == 0
    >>> prod_signs([]) == None
    """

# Solution:

def prod_signs(arr):
    """
    You are given an array arr of integers and you need to return
    sum of magnitudes of integers multiplied by product of all signs
    of each number in the array, represented by 1, -1 or 0.
    Note: return None for empty arr.

    Example:
    >>> prod_signs([1, 2, 2, -4]) == -9
    >>> prod_signs([0, 1]) == 0
    >>> prod_signs([]) == None
    """
```
# Codewars 7kyu

## [Simple Fun #26: Rearrange Last N Digits](https://www.codewars.com/kata/simple-fun-number-26-rearrange-last-n-digits)

Given a positive integer `n`, find an integer `a` such that:

* the last `n` digits of `a` are the same as the last `n` digits of `n`,
* the sum of every digit of `a` is greater than the sum of every digit of `n`.
