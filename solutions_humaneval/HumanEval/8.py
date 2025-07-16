# Prompt:
from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:
    """ For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
    Empty sum should be equal to 0 and empty product should be equal to 1.
    >>> sum_product([])
    (0, 1)
    >>> sum_product([1, 2, 3, 4])
    (10, 24)
    """

# Solution:
from typing import List, Tuple


def sum_product(numbers: List[int]) -> Tuple[int, int]:
    """ For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
    Empty sum should be equal to 0 and empty product should be equal to 1.
    >>> sum_product([])
    (0, 1)
    >>> sum_product([1, 2, 3, 4])
    (10, 24)
    """
# pylint: disable=unused-argument
"""
Write a function that returns a list of integers from 0 to n.

Example:
    >>> range_func(5)
    [0, 1, 2, 3, 4]
"""

from typing import List


def range_func(n: int) -> List[int]:
    """
    >>> range_func(5)
    [0, 1, 2, 3, 4]
    >>> range_func(0)
    []
    """
"""
Write a function that returns a string