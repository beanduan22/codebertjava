# Prompt:
from typing import List, Optional


def longest(strings: List[str]) -> Optional[str]:
    """ Out of list of strings, return the longest one. Return the first one in case of multiple
    strings of the same length. Return None in case the input list is empty.
    >>> longest([])

    >>> longest(['a', 'b', 'c'])
    'a'
    >>> longest(['a', 'bb', 'ccc'])
    'ccc'
    """

# Solution:
from typing import List, Optional


def longest(strings: List[str]) -> Optional[str]:
    """ Out of list of strings, return the longest one. Return the first one in case of multiple
    strings of the same length. Return None in case the input list is empty.
    >>> longest([])

    >>> longest(['a', 'b', 'c'])
    'a'
    >>> longest(['a', 'bb', 'ccc'])
    'ccc'
    """
/basics/operators/divmod.py
""" Division and modulus
divmod(3, 2)
divmod(4, 2)
divmod(9, 2)
"""
/basics/data_structures/list/list_comprehensions.py
""" List comprehensions
https://realpython.com/list-comprehension-python/


>>> [x * 2 for x in [1, 2, 3, 4]]
[2, 4, 6, 8]

>>> [x for x