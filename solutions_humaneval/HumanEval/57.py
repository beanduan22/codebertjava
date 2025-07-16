# Prompt:


def monotonic(l: list):
    """Return True is list elements are monotonically increasing or decreasing.
    >>> monotonic([1, 2, 4, 20])
    True
    >>> monotonic([1, 20, 4, 10])
    False
    >>> monotonic([4, 1, 0, -10])
    True
    """

# Solution:


def monotonic(l: list):
    """Return True is list elements are monotonically increasing or decreasing.
    >>> monotonic([1, 2, 4, 20])
    True
    >>> monotonic([1, 20, 4, 10])
    False
    >>> monotonic([4, 1, 0, -10])
    True
    """

def find_peaks(l: list):
    """Return list of peaks in a list.
    >>> find_peaks([1, 2, 3, 4, 5])
    [5]
    >>> find_peaks([5, 4, 3, 2, 1])
    [5]
    >>> find_peaks([5, 10, 30, 20, 4, 2])
    [10, 30, 20]
    >>> find_peaks([1, 2, 3, 