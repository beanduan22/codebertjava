# Prompt:
from typing import List


def rescale_to_unit(numbers: List[float]) -> List[float]:
    """ Given list of numbers (of at least two elements), apply a linear transform to that list,
    such that the smallest number will become 0 and the largest will become 1
    >>> rescale_to_unit([1.0, 2.0, 3.0, 4.0, 5.0])
    [0.0, 0.25, 0.5, 0.75, 1.0]
    """

# Solution:
from typing import List


def rescale_to_unit(numbers: List[float]) -> List[float]:
    """ Given list of numbers (of at least two elements), apply a linear transform to that list,
    such that the smallest number will become 0 and the largest will become 1
    >>> rescale_to_unit([1.0, 2.0, 3.0, 4.0, 5.0])
    [0.0, 0.25, 0.5, 0.75, 1.0]
    """
/lecture2/exercises/exercise_2_3.py
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  4 17:52:43 2018

@author: micha
"""
from typing import List, Tuple
import random

def make_random_list(n: int) -> List[int]:
    """Create a list of random numbers from range (0, n-1)
    >>> make_random_list(4)
    [0, 0, 3, 1]
    """
    random