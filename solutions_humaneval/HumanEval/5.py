# Prompt:
from typing import List


def intersperse(numbers: List[int], delimeter: int) -> List[int]:
    """ Insert a number 'delimeter' between every two consecutive elements of input list `numbers'
    >>> intersperse([], 4)
    []
    >>> intersperse([1, 2, 3], 4)
    [1, 4, 2, 4, 3]
    """

# Solution:
from typing import List


def intersperse(numbers: List[int], delimeter: int) -> List[int]:
    """ Insert a number 'delimeter' between every two consecutive elements of input list `numbers'
    >>> intersperse([], 4)
    []
    >>> intersperse([1, 2, 3], 4)
    [1, 4, 2, 4, 3]
    """

if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)
/python3/exercises/00_warm_up/01_hello_world/hello_world.py
def hello_world() -> str:
    """ Print "Hello World!" to the console
    >>> hello_world()
    Hello World!
    """


if __name__ == "__main__":
    import doctest
    doctest.testmod(verbose=True)
/python3/exercises/02_strings/03_count_vowels