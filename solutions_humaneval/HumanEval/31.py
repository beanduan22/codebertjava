# Prompt:


def is_prime(n):
    """Return true if a given number is prime, and false otherwise.
    >>> is_prime(6)
    False
    >>> is_prime(101)
    True
    >>> is_prime(11)
    True
    >>> is_prime(13441)
    True
    >>> is_prime(61)
    True
    >>> is_prime(4)
    False
    >>> is_prime(1)
    False
    """

# Solution:


def is_prime(n):
    """Return true if a given number is prime, and false otherwise.
    >>> is_prime(6)
    False
    >>> is_prime(101)
    True
    >>> is_prime(11)
    True
    >>> is_prime(13441)
    True
    >>> is_prime(61)
    True
    >>> is_prime(4)
    False
    >>> is_prime(1)
    False
    """
#    a = 1
#    while a <= n:
#        if n % a == 0:
#            return False
#        a += 1
#    return True

    if n == 1:
        return False
    else:
        divisor = 2
        while divisor < n:
            if n % divisor == 0:
                return False
            divisor += 1
    return True

def is_odd(n):
    """Return whether n is odd."""
    return n % 2 == 1

def count_digits(n):
    """Return the number of digits