# Prompt:


def strlen(string: str) -> int:
    """ Return length of given string
    >>> strlen('')
    0
    >>> strlen('abc')
    3
    """

# Solution:


def strlen(string: str) -> int:
    """ Return length of given string
    >>> strlen('')
    0
    >>> strlen('abc')
    3
    """

def substr(string: str, start: int, length: int = None) -> str:
    """ Return a substring of given string starting at start
    >>> substr('')
    ''
    >>> substr('abc')
    'abc'
    >>> substr('abcdef', 1)
    'bcdef'
    >>> substr('abcdef', 1, 2)
    'bc'
    """


def explode(delimiter: str, string: str) -> List[str]:
    """ Split string by given delimiter and return list
    >>> explode('', '')
    []
    >>> explode(' ', 'a b c')
    ['a