# Prompt:


def correct_bracketing(brackets: str):
    """ brackets is a string of "<" and ">".
    return True if every opening bracket has a corresponding closing bracket.

    >>> correct_bracketing("<")
    False
    >>> correct_bracketing("<>")
    True
    >>> correct_bracketing("<<><>>")
    True
    >>> correct_bracketing("><<>")
    False
    """

# Solution:


def correct_bracketing(brackets: str):
    """ brackets is a string of "<" and ">".
    return True if every opening bracket has a corresponding closing bracket.

    >>> correct_bracketing("<")
    False
    >>> correct_bracketing("<>")
    True
    >>> correct_bracketing("<<><>>")
    True
    >>> correct_bracketing("><<>")
    False
    """

def bracket_pairs(brackets: str):
    """ brackets is a string of "<" and ">".
    return the number of pairs of brackets.

    >>> bracket_pairs("<<<>>>")
    4
    """

def bracket_pair_locations(brackets: str):
    """ brackets is a string of "<" and ">".
    return the locations of the pairs of brackets.

    >>> bracket_pair_locations("<<<>>>")
    [(0, 5), (1, 4), (2, 3)]
    """

def bracket_nesting_depth(brackets: str):