# Prompt:

def unique_digits(x):
    """Given a list of positive integers x. return a sorted list of all 
    elements that hasn't any even digit.

    Note: Returned list should be sorted in increasing order.
    
    For example:
    >>> unique_digits([15, 33, 1422, 1])
    [1, 15, 33]
    >>> unique_digits([152, 323, 1422, 10])
    []
    """

# Solution:

def unique_digits(x):
    """Given a list of positive integers x. return a sorted list of all 
    elements that hasn't any even digit.

    Note: Returned list should be sorted in increasing order.
    
    For example:
    >>> unique_digits([15, 33, 1422, 1])
    [1, 15, 33]
    >>> unique_digits([152, 323, 1422, 10])
    []
    """

# Q19
import string
def palindrome_anagram(x):
    """Return all palindrome anagram of string x.
    
    Anagram of a string is formed by rearranging the letters of the string.
    For example: "elvis" -> "lives", "silent" -> "tinsel".
    
    Palindrome string is one that reads the same backward as forward.
    For example: "bob", "able was i ere i saw elba".

    Note:
     - Returned list should be sorted in lexicographical order.
     - All characters in returned strings should be in lower