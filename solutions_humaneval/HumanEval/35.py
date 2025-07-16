# Prompt:


def max_element(l: list):
    """Return maximum element in the list.
    >>> max_element([1, 2, 3])
    3
    >>> max_element([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
    123
    """

# Solution:


def max_element(l: list):
    """Return maximum element in the list.
    >>> max_element([1, 2, 3])
    3
    >>> max_element([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
    123
    """

if __name__ == '__main__':
    import doctest
    doctest.testmod()
"""
Write a function which receives a list of lists and returns a list of lists with sorted (ascending) elements.
"""
"""
Write a function which receives a list and returns a tuple with the minimum and maximum element of the list.
"""
from typing import List


def replace(s: str, old: str, new: str) -> str:
    """
    >>> replace('aabaac', 'aa', 'c', 2)
    'ccbac'
    >>> replace