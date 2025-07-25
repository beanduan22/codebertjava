# Prompt:

def reverse_delete(s,c):
    """Task
    We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    then check if the result string is palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return a tuple containing the result string and True/False for the check.
    Example
    For s = "abcde", c = "ae", the result should be ('bcd',False)
    For s = "abcdef", c = "b"  the result should be ('acdef',False)
    For s = "abcdedcba", c = "ab", the result should be ('cdedc',True)
    """

# Solution:

def reverse_delete(s,c):
    """Task
    We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    then check if the result string is palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return a tuple containing the result string and True/False for the check.
    Example
    For s = "abcde", c = "ae", the result should be ('bcd',False)
    For s = "abcdef", c = "b"  the result should be ('acdef',False)
    For s = "abcdedcba", c = "ab", the result should be ('cdedc',True)
    """
#     s = input()
#     c = input()
    new_str = ""
    for el in s:
        if el not in c:
            new_str += el
    if new_str == new_str[::-1]:
        return (new_str, True)
    else:
        return (new_str, False)
    
print(reverse_delete('abcccba','b'))
print(reverse_delete('abcdedcba','b'))
print(reverse_delete('abcde','ae'))
print(reverse_delete('abcdef','b'))
print(reverse_delete