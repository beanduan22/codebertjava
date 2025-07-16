# Prompt:
from typing import List


def separate_paren_groups(paren_string: str) -> List[str]:
    """ Input to this function is a string containing multiple groups of nested parentheses. Your goal is to
    separate those group into separate strings and return the list of those.
    Separate groups are balanced (each open brace is properly closed) and not nested within each other
    Ignore any spaces in the input string.
    >>> separate_paren_groups('( ) (( )) (( )( ))')
    ['()', '(())', '(()())']
    """

# Solution:
from typing import List


def separate_paren_groups(paren_string: str) -> List[str]:
    """ Input to this function is a string containing multiple groups of nested parentheses. Your goal is to
    separate those group into separate strings and return the list of those.
    Separate groups are balanced (each open brace is properly closed) and not nested within each other
    Ignore any spaces in the input string.
    >>> separate_paren_groups('( ) (( )) (( )( ))')
    ['()', '(())', '(()())']
    """
# Code Challenge 151

This week's code challenge is to implement a function that finds all the permutations of an input string.

## Details

Write a function that accepts a string as a parameter, and returns a list of strings representing all the permutations of the input string.

## Example

```python
permutations("abc") # returns ["abc", "acb", "bac", "bca", "cab", "cba"]
```
# Code Challenge 187

This week's code challenge is to implement a function that finds the minimum number of moves