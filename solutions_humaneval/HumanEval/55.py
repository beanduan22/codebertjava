# Prompt:


def fib(n: int):
    """Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
    """

# Solution:


def fib(n: int):
    """Return n-th Fibonacci number.
    >>> fib(10)
    55
    >>> fib(1)
    1
    >>> fib(8)
    21
    """

def fib(n):
    if n == 1 or n == 0:
        return n
    else:
        return fib(n-1) + fib(n-2)

# print(fib(10))


def fib_iter(n):
    if n == 1 or n == 0:
        return n
    else:
        a = 0
        b = 1
        for i in range(n-1):
            c = a + b
            a = b
            b = c
        return c

# print(fib_iter(10))
/