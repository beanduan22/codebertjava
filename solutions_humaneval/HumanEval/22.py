# Prompt:
from typing import List, Any


def filter_integers(values: List[Any]) -> List[int]:
    """ Filter given list of any python values only for integers
    >>> filter_integers(['a', 3.14, 5])
    [5]
    >>> filter_integers([1, 2, 3, 'abc', {}, []])
    [1, 2, 3]
    """

# Solution:
from typing import List, Any


def filter_integers(values: List[Any]) -> List[int]:
    """ Filter given list of any python values only for integers
    >>> filter_integers(['a', 3.14, 5])
    [5]
    >>> filter_integers([1, 2, 3, 'abc', {}, []])
    [1, 2, 3]
    """
/02-python-basics/08-functions/tasks/task_07.py
from typing import List


def sum_of_digits(numbers: List[int]) -> int:
    """ Sum of digits in given list of integers
    >>> sum_of_digits([5, 23, 40])
    12
    >>> sum_of_digits([3, 500, 100])
    18
    >>> sum_of_digits([1, 0])
    1
    """
/02-python-basics/07