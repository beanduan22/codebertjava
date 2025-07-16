# Prompt:
from typing import List


def concatenate(strings: List[str]) -> str:
    """ Concatenate list of strings into a single string
    >>> concatenate([])
    ''
    >>> concatenate(['a', 'b', 'c'])
    'abc'
    """

# Solution:
from typing import List


def concatenate(strings: List[str]) -> str:
    """ Concatenate list of strings into a single string
    >>> concatenate([])
    ''
    >>> concatenate(['a', 'b', 'c'])
    'abc'
    """
/exercises/practice/anagram/.meta/example.py
from collections import Counter
from typing import Iterable, TypeVar

T = TypeVar("T")


def same_chars(seq1: Iterable[T], seq2: Iterable[T]) -> bool:
    return Counter(seq1) == Counter(seq2)


def find_anagrams(word: str, potential_matches: Iterable[str]) -> list[str]:
    """
    Takes a word and a list of potential anagrams, returning a list of
    matching anagrams.
    """
    lowered_word