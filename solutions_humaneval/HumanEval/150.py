# Prompt:

def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """

# Solution:

def x_or_y(n, x, y):
    """A simple program which should return the value of x if n is 
    a prime number and should return the value of y otherwise.

    Examples:
    for x_or_y(7, 34, 12) == 34
    for x_or_y(15, 8, 5) == 5
    
    """

#    if is_prime(n):
#        return x
#    else:
#        return y

    return x if is_prime(n) else y


def is_divisible_by_any(n, *args):
    """A simple program which should return True if n is divisible by any number of the list args. 
    False otherwise.

    Examples:
    for is_divisible_by_any(15,(2,4,7)) == True
    for is_divisible_by_any(15,(2,3)) == True
    for is