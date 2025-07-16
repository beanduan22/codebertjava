# Prompt:

def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    For example:
    >>> is_bored("Hello world")
    0
    >>> is_bored("The sky is blue. The sun is shining. I love this weather")
    1
    """

# Solution:

def is_bored(S):
    """
    You'll be given a string of words, and your task is to count the number
    of boredoms. A boredom is a sentence that starts with the word "I".
    Sentences are delimited by '.', '?' or '!'.
   
    For example:
    >>> is_bored("Hello world")
    0
    >>> is_bored("The sky is blue. The sun is shining. I love this weather")
    1
    """

if __name__ == '__main__':
    import doctest
    doctest.testmod()
/python/solutions/exercise-4.py
def count_words(S):
    """
    Count the number of words in a given string. Words are splitted by
    whitespace characters.
    
    For example:
    >>> count_words("Hello world")
    2
    >>> count_words("The sky is blue. The sky is blue. The sky is blue.")
    3
    """
    return len(S.split())

if __name__ == '__main__':
    import doctest
    doctest