# Prompt:
from typing import List


def sort_numbers(numbers: str) -> str:
    """ Input is a space-delimited string of numberals from 'zero' to 'nine'.
    Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
    Return the string with numbers sorted from smallest to largest
    >>> sort_numbers('three one five')
    'one three five'
    """

# Solution:
from typing import List


def sort_numbers(numbers: str) -> str:
    """ Input is a space-delimited string of numberals from 'zero' to 'nine'.
    Valid choices are 'zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight' and 'nine'.
    Return the string with numbers sorted from smallest to largest
    >>> sort_numbers('three one five')
    'one three five'
    """

if __name__ == '__main__':
    import doctest
    doctest.testmod()
/python/README.md
# Python Challenges

## Run all Python challenges
```bash
python python/run_all.py
```
/python/challenges/test_count_by_x.py
import count_by_x


def test_count_by_x_1():
    assert count_by_x.count_by(1, 5) == [1, 2, 3, 4, 5]


def test_