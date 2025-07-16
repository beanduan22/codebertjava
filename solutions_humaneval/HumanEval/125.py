# Prompt:

def split_words(txt):
    '''
    Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
    should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
    alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
    Examples
    split_words("Hello world!") ➞ ["Hello", "world!"]
    split_words("Hello,world!") ➞ ["Hello", "world!"]
    split_words("abcdef") == 3 
    '''

# Solution:

def split_words(txt):
    '''
    Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
    should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
    alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
    Examples
    split_words("Hello world!") ➞ ["Hello", "world!"]
    split_words("Hello,world!") ➞ ["Hello", "world!"]
    split_words("abcdef") == 3 
    '''
#     if'' in txt:
#         return txt.split(' ')
#     elif ',' in txt:
#         return txt.split(',')
#     elif'' not in txt and ',' not in txt:
#         count = 0
#         for i in txt:
#             if i.islower():
#                 count += 1
#         return count
    return [i for i in txt.split(' ') if i!=''] if'' in txt else [i for i in txt.split(',') if i!=''] if ',' in txt else len([i for