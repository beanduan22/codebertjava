# Prompt:

def largest_smallest_integers(lst):
    '''
    Create a function that returns a tuple (a, b), where 'a' is
    the largest of negative integers, and 'b' is the smallest
    of positive integers in a list.
    If there is no negative or positive integers, return them as None.

    Examples:
    largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)
    largest_smallest_integers([]) == (None, None)
    largest_smallest_integers([0]) == (None, None)
    '''

# Solution:

def largest_smallest_integers(lst):
    '''
    Create a function that returns a tuple (a, b), where 'a' is
    the largest of negative integers, and 'b' is the smallest
    of positive integers in a list.
    If there is no negative or positive integers, return them as None.

    Examples:
    largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)
    largest_smallest_integers([]) == (None, None)
    largest_smallest_integers([0]) == (None, None)
    '''

# Your code here

print(largest_smallest_integers([2, 4, 1, 3, 5, 7])) # (None, 1)
print(largest_smallest_integers([])) # (None, None)
print(largest_smallest_integers([0])) # (None, None)

def check_numbers(lst1, lst2):
    '''
    Given two lists of integers, return True if the sum of any two numbers
    from the first list is equal to any number from the second list.
    Otherwise, return