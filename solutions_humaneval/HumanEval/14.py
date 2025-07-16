# Prompt:
from typing import List


def all_prefixes(string: str) -> List[str]:
    """ Return list of all prefixes from shortest to longest of the input string
    >>> all_prefixes('abc')
    ['a', 'ab', 'abc']
    """

# Solution:
from typing import List


def all_prefixes(string: str) -> List[str]:
    """ Return list of all prefixes from shortest to longest of the input string
    >>> all_prefixes('abc')
    ['a', 'ab', 'abc']
    """
/requirements.txt
black
flake8
ipython
jupyter
mypy
pylint
pytest
pytest-cov
/tests/test_unique_chars.py
from algorithms.unique_chars import unique_chars

def test_unique_chars():
    assert unique_chars('abc') == True
    assert unique_chars('abca') == False
/algorithms/reverse_string.py
from typing import List


def reverse_string(string: str) -> List[str]:
    """ Return reversed string
    >>> reverse_string('abc')
    'cba'
   