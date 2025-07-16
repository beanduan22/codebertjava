# Prompt:


def same_chars(s0: str, s1: str):
    """
    Check if two words have the same characters.
    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc')
    True
    >>> same_chars('abcd', 'dddddddabc')
    True
    >>> same_chars('dddddddabc', 'abcd')
    True
    >>> same_chars('eabcd', 'dddddddabc')
    False
    >>> same_chars('abcd', 'dddddddabce')
    False
    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddddabc')
    False
    """

# Solution:


def same_chars(s0: str, s1: str):
    """
    Check if two words have the same characters.
    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddeddabc')
    True
    >>> same_chars('abcd', 'dddddddabc')
    True
    >>> same_chars('dddddddabc', 'abcd')
    True
    >>> same_chars('eabcd', 'dddddddabc')
    False
    >>> same_chars('abcd', 'dddddddabce')
    False
    >>> same_chars('eabcdzzzz', 'dddzzzzzzzddddabc')
    False
    """

def same_chars_and_length(s0: str, s1: str):
    """
    Check if two words have the same characters and same length
    >>> same_chars_and_length('eabcdzzzz', 'dddzzzzzzzddeddabc')
    False
    >>> same_chars_and_length('abcd', 'dddddddabc')
    True
    >>> same_chars_and_length('dddddddabc', 'abcd')
    True
    >>> same_chars_and_length('eabcd', 'dddddddabc')
    False
    >>> same_chars_and_length('abcd