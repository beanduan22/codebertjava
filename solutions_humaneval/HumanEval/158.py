# Prompt:

def find_max(words):
    """Write a function that accepts a list of strings.
    The list contains different words. Return the word with maximum number
    of unique characters. If multiple strings have maximum number of unique
    characters, return the one which comes first in lexicographical order.

    find_max(["name", "of", "string"]) == "string"
    find_max(["name", "enam", "game"]) == "enam"
    find_max(["aaaaaaa", "bb" ,"cc"]) == ""aaaaaaa"
    """

# Solution:

def find_max(words):
    """Write a function that accepts a list of strings.
    The list contains different words. Return the word with maximum number
    of unique characters. If multiple strings have maximum number of unique
    characters, return the one which comes first in lexicographical order.

    find_max(["name", "of", "string"]) == "string"
    find_max(["name", "enam", "game"]) == "enam"
    find_max(["aaaaaaa", "bb" ,"cc"]) == ""aaaaaaa"
    """
/0x04-python-more_data_structures/100-weight_average.py
#!/usr/bin/python3
def weight_average(my_list=[]):
    if my_list is None or len(my_list) is 0:
        return 0
    else:
        sum1 = 0
        sum2 = 0

        for i in my_list:
            sum2 += i[0]
            sum1 += i[0] * i[1]

        return sum1 / sum2
/README.md
# holbertons