# Prompt:


def correct_bracketing(brackets: str):
    """ brackets is a string of "(" and ")".
    return True if every opening bracket has a corresponding closing bracket.

    >>> correct_bracketing("(")
    False
    >>> correct_bracketing("()")
    True
    >>> correct_bracketing("(()())")
    True
    >>> correct_bracketing(")(()")
    False
    """

# Solution:


def correct_bracketing(brackets: str):
    """ brackets is a string of "(" and ")".
    return True if every opening bracket has a corresponding closing bracket.

    >>> correct_bracketing("(")
    False
    >>> correct_bracketing("()")
    True
    >>> correct_bracketing("(()())")
    True
    >>> correct_bracketing(")(()")
    False
    """

def correct_bracketing2(brackets: str):
    """
    brackets is a string of "(" and ")".
    return True if every opening bracket has a corresponding closing bracket.
    but it's better than correct_bracketing()
    """


def has_valid_brackets(s: str):
    """
    return True if s is a string of valid brackets.
    >>> has_valid_brackets("((())()")
    False
    >>> has_valid_brackets("(((())))")
    True
    """


def has_valid_brackets2(s: str):
    """