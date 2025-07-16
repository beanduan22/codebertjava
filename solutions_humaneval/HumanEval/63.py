# Prompt:


def fibfib(n: int):
    """The FibFib number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
    fibfib(0) == 0
    fibfib(1) == 0
    fibfib(2) == 1
    fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3).
    Please write a function to efficiently compute the n-th element of the fibfib number sequence.
    >>> fibfib(1)
    0
    >>> fibfib(5)
    4
    >>> fibfib(8)
    24
    """

# Solution:


def fibfib(n: int):
    """The FibFib number sequence is a sequence similar to the Fibbonacci sequnece that's defined as follows:
    fibfib(0) == 0
    fibfib(1) == 0
    fibfib(2) == 1
    fibfib(n) == fibfib(n-1) + fibfib(n-2) + fibfib(n-3).
    Please write a function to efficiently compute the n-th element of the fibfib number sequence.
    >>> fibfib(1)
    0
    >>> fibfib(5)
    4
    >>> fibfib(8)
    24
    """

def fibfib_memoized(n: int, memo: dict = None):
    # initialize the memo dict if it is None
    if memo is None:
        memo = {}
    if n in memo:
        return memo[n]
    if n < 3:
        return 0 if n < 2 else 1
    memo[n] = fibfib(n-1) + fibfib(n-2) + fibfib(n-3)
    return memo[n]

def fibfib_table(n: int):
    # initialize the table
    table = [0, 