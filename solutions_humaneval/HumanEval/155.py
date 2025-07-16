# Prompt:

def even_odd_count(num):
    """Given an integer. return a tuple that has the number of even and odd digits respectively.

     Example:
        even_odd_count(-12) ==> (1, 1)
        even_odd_count(123) ==> (1, 2)
    """

# Solution:

def even_odd_count(num):
    """Given an integer. return a tuple that has the number of even and odd digits respectively.

     Example:
        even_odd_count(-12) ==> (1, 1)
        even_odd_count(123) ==> (1, 2)
    """

def even_odd_count(num):
    even_counter = 0   # to hold the number of even digits 
    odd_counter = 0    # to hold the number of odd digits
    while abs(num) > 0:
        if num % 2 == 0:
            even_counter += 1
        else:
            odd_counter += 1
        num = num // 10
    return (even_counter, odd_counter)# Problem 1

def sum_list(L):
    """Given a list, return the sum of all the elements in the