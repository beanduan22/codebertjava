# Prompt:
from typing import List


def mean_absolute_deviation(numbers: List[float]) -> float:
    """ For a given list of input numbers, calculate Mean Absolute Deviation
    around the mean of this dataset.
    Mean Absolute Deviation is the average absolute difference between each
    element and a centerpoint (mean in this case):
    MAD = average | x - x_mean |
    >>> mean_absolute_deviation([1.0, 2.0, 3.0, 4.0])
    1.0
    """

# Solution:
from typing import List


def mean_absolute_deviation(numbers: List[float]) -> float:
    """ For a given list of input numbers, calculate Mean Absolute Deviation
    around the mean of this dataset.
    Mean Absolute Deviation is the average absolute difference between each
    element and a centerpoint (mean in this case):
    MAD = average | x - x_mean |
    >>> mean_absolute_deviation([1.0, 2.0, 3.0, 4.0])
    1.0
    """
/src/string_to_list.py
from typing import List


def string_to_list(string: str) -> List:
    """ Change a string to a list.
    >>> string_to_list("123,456,789")
    ['123', '456', '789']
    """
    return []
/src/median.py
from typing import List


def median(numbers: List[float]) -> float:
    """ Return Median, the middle number in a given list of numbers.
    For a