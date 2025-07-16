# Prompt:

def any_int(x, y, z):
    '''
    Create a function that takes 3 numbers.
    Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    Returns false in any other cases.
    
    Examples
    any_int(5, 2, 7) ➞ True
    
    any_int(3, 2, 2) ➞ False

    any_int(3, -2, 1) ➞ True
    
    any_int(3.6, -2.2, 2) ➞ False
  

    
    '''

# Solution:

def any_int(x, y, z):
    '''
    Create a function that takes 3 numbers.
    Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    Returns false in any other cases.
    
    Examples
    any_int(5, 2, 7) ➞ True
    
    any_int(3, 2, 2) ➞ False

    any_int(3, -2, 1) ➞ True
    
    any_int(3.6, -2.2, 2) ➞ False
  

    
    '''
import math
def any_int(a,b,c):
    if math.ceil(a) == a and math.ceil(b) == b and math.ceil(c) == c:
        if a == b+c or b == a+c or c == a+b:
            return True
        else:
            return False
    else:
        return False
    
any_int(3, -2, 1)
any_int(3.6, -2.2, 2)### 6. Create a function that takes a list of two numbers and checks