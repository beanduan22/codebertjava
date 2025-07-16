# Prompt:

def is_multiply_prime(a):
    """Write a function that returns true if the given number is the multiplication of 3 prime numbers
    and false otherwise.
    Knowing that (a) is less then 100. 
    Example:
    is_multiply_prime(30) == True
    30 = 2 * 3 * 5
    """

# Solution:

def is_multiply_prime(a):
    """Write a function that returns true if the given number is the multiplication of 3 prime numbers
    and false otherwise.
    Knowing that (a) is less then 100. 
    Example:
    is_multiply_prime(30) == True
    30 = 2 * 3 * 5
    """

def is_palindrome(a):
    """Write a function that returns True if the given number is palindrome and False otherwise.
    Example:
    is_palindrome(123321) == True
    is_palindrome(123456) == False
    """
/05_11_2021/src/main.py
from src.classes.human import Human
from src.classes.student import Student


def main():
    h1 = Human("", 20)
    h1.say_hi()
    h1