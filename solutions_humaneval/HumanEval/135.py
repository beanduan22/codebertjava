# Prompt:

def can_arrange(arr):
    """Create a function which returns the largest index of an element which
    is not greater than or equal to the element immediately preceding it. If
    no such element exists then return -1. The given array will not contain
    duplicate values.

    Examples:
    can_arrange([1,2,4,3,5]) = 3
    can_arrange([1,2,3]) = -1
    """

# Solution:

def can_arrange(arr):
    """Create a function which returns the largest index of an element which
    is not greater than or equal to the element immediately preceding it. If
    no such element exists then return -1. The given array will not contain
    duplicate values.

    Examples:
    can_arrange([1,2,4,3,5]) = 3
    can_arrange([1,2,3]) = -1
    """

# -----------------------------------------------------------------------------
# Test
# -----------------------------------------------------------------------------

if __name__ == '__main__':

    test_cases = [
        ([1, 2, 4, 3, 5], 3),
        ([1, 2, 3], -1),
        ([8, 8, 7, 6, 4, 2, 1], 2),
        ([3, 2, 1], 0),
        ([6, 5, 4, 3, 2, 1], 0),
        ([], -1)
    ]
    for test