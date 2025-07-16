# Prompt:
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    >>> filter_by_substring([], 'a')
    []
    >>> filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a')
    ['abc', 'bacd', 'array']
    """

# Solution:
from typing import List


def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    """ Filter an input list of strings only for ones that contain given substring
    >>> filter_by_substring([], 'a')
    []
    >>> filter_by_substring(['abc', 'bacd', 'cde', 'array'], 'a')
    ['abc', 'bacd', 'array']
    """
"""
Task 04

Implement a function, that returns a list of tuples, containing 
a number and its square, up to the given positive number.

Examples:
>>> squares_by(5)
[(1, 1), (2, 4), (3, 9), (4, 16), (5, 25)]
>>> squares_by(3)
[(1, 1), (2, 4), (3, 9)]
"""


def squares_by(limit: int) -> list:
