# Prompt:


def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """

# Solution:


def how_many_times(string: str, substring: str) -> int:
    """ Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> how_many_times('', 'a')
    0
    >>> how_many_times('aaa', 'a')
    3
    >>> how_many_times('aaaa', 'aa')
    3
    """

if __name__ == "__main__":
    import doctest
    doctest.testmod()
s = 2

def test_how_many_times_1(self):
    self.assertEqual(how_many_times('aaaa', 'aa'), 3)

def test_how_many_times_2(self):
    self.assertEqual(how_many_times('aaa', 'aa'), 2)

if __name__ == "__main__":
    unittest.main()
import unittest

def how_many_times(string: str,