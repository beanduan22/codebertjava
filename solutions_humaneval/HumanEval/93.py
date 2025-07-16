# Prompt:

def encode(message):
    """
    Write a function that takes a message, and encodes in such a 
    way that it swaps case of all letters, replaces all vowels in 
    the message with the letter that appears 2 places ahead of that 
    vowel in the english alphabet. 
    Assume only letters. 
    
    Examples:
    >>> encode('test')
    'TGST'
    >>> encode('This is a message')
    'tHKS KS C MGSSCGG'
    """

# Solution:

def encode(message):
    """
    Write a function that takes a message, and encodes in such a 
    way that it swaps case of all letters, replaces all vowels in 
    the message with the letter that appears 2 places ahead of that 
    vowel in the english alphabet. 
    Assume only letters. 
    
    Examples:
    >>> encode('test')
    'TGST'
    >>> encode('This is a message')
    'tHKS KS C MGSSCGG'
    """

def main():
    """
    Run your functions here.
    """

if __name__ == '__main__':
    main()/2021/09/28/solutions/solutions_1.py
def is_palindrome(word):
    if word.lower() == word[::-1].lower():
        return True
    else:
        return False


def main():
    print(is_palindrome('racecar'))
    print(is_palindrome('racecar'))
    print(is_palindrome('race cars'))


if __name__ == '__main__':
   