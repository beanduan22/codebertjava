# Prompt:

def make_a_pile(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    Examples:
    >>> make_a_pile(3)
    [3, 5, 7]
    """

# Solution:

def make_a_pile(n):
    """
    Given a positive integer n, you have to make a pile of n levels of stones.
    The first level has n stones.
    The number of stones in the next level is:
        - the next odd number if n is odd.
        - the next even number if n is even.
    Return the number of stones in each level in a list, where element at index
    i represents the number of stones in the level (i+1).

    Examples:
    >>> make_a_pile(3)
    [3, 5, 7]
    """

def is_anagram(s1, s2):
    """
    Given two strings s1 and s2, determine if they are anagrams of each other.
    Two strings are anagrams if they contain the same characters, but in
    different order.

    Examples:
    >>> is_anagram('foo', 'bar')
    False
    >>> is_anagram('foo', 'oof')
    True
    """

def is_palindrome(s):
    """
    Given a string s, determine if it is a palindrome.

    Examples:
    >>> is_palindrome('foo')
    False
   