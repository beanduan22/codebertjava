# Prompt:

def closest_integer(value):
    '''
    Create a function that takes a value (string) representing a number
    and returns the closest integer to it. If the number is equidistant
    from two integers, round it away from zero.

    Examples
    >>> closest_integer("10")
    10
    >>> closest_integer("15.3")
    15

    Note:
    Rounding away from zero means that if the given number is equidistant
    from two integers, the one you should return is the one that is the
    farthest from zero. For example closest_integer("14.5") should
    return 15 and closest_integer("-14.5") should return -15.
    '''

# Solution:

def closest_integer(value):
    '''
    Create a function that takes a value (string) representing a number
    and returns the closest integer to it. If the number is equidistant
    from two integers, round it away from zero.

    Examples
    >>> closest_integer("10")
    10
    >>> closest_integer("15.3")
    15

    Note:
    Rounding away from zero means that if the given number is equidistant
    from two integers, the one you should return is the one that is the
    farthest from zero. For example closest_integer("14.5") should
    return 15 and closest_integer("-14.5") should return -15.
    '''

def get_word_count(text):
    '''
    Create a function that takes in a string of text and returns a dictionary,
    where each key is a word in the text and each value is the number of times
    that word appears in the text.

    Examples
    >>> get_word_count("The dog went to the store")
    {'the': 2, 'dog': 1, 'went': 1, 'to': 1,'store': 1}
    >>> get_word_count("Go, dog. Went to store. Gone to store.")
    {'go