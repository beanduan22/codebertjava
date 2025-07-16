# Prompt:

def f(n):
    """ Implement the function f that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 1.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    Example:
    f(5) == [1, 2, 6, 24, 15]
    """

# Solution:

def f(n):
    """ Implement the function f that takes n as a parameter,
    and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
    or the sum of numbers from 1 to i otherwise.
    i starts from 1.
    the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    Example:
    f(5) == [1, 2, 6, 24, 15]
    """

def g(n):
    """ Implement the function g that takes n as a parameter,
    and returns a list of strings, such that the value of the element at index i is the string representation of the
    element at index i of the list returned by f(n),
    but it is reversed if i is even,
    or the string representation of the element at index i of the list returned by f(n) otherwise.
    Example:
    g(5) == ["1", "2", "4", "6", "5"]
    """

def h(n):
    """ Implement the function h