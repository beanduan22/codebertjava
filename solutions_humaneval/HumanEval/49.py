# Prompt:


def modp(n: int, p: int):
    """Return 2^n modulo p (be aware of numerics).
    >>> modp(3, 5)
    3
    >>> modp(1101, 101)
    2
    >>> modp(0, 101)
    1
    >>> modp(3, 11)
    8
    >>> modp(100, 101)
    1
    """

# Solution:


def modp(n: int, p: int):
    """Return 2^n modulo p (be aware of numerics).
    >>> modp(3, 5)
    3
    >>> modp(1101, 101)
    2
    >>> modp(0, 101)
    1
    >>> modp(3, 11)
    8
    >>> modp(100, 101)
    1
    """

def prime(n: int, d: int=2) -> bool:
    """Test if n is prime (be aware of numerics).
    >>> prime(3)
    True
    >>> prime(4)
    False
    >>> prime(6)
    False
    >>> prime(13)
    True
    >>> prime(101)
    True
    >>> prime(102)
    False
    >>> prime(999983)
    True
    >>> prime(999987)
    False
    """
    if n < 2:
        return False
    for i in range(