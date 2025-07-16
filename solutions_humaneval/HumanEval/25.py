# Prompt:
from typing import List


def factorize(n: int) -> List[int]:
    """ Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
    """

# Solution:
from typing import List


def factorize(n: int) -> List[int]:
    """ Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
    """
/python/tasks/task4_tests.py
import unittest
from task4 import *

class TestFunctions(unittest.TestCase):
    def test_sum_of_digits(self):
        self.assertEqual(sum_of_digits(1234), 10)
        self.assertEqual(sum_of_digits(12345), 15)
        self.assertEqual(sum_of_digits(123456), 21)

    def test_is_prime(self):
        self.assertTrue(is_prime(2))
       