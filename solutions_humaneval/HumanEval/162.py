# Prompt:

def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """

# Solution:

def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'
    """

def get_md5_of_file(file_name):
    """
    Given a file name 'file_name', return its md5 hash equivalent string.
    Return None if the file does not exist.

    >>> get_md5_of_file('hw1.py') == '41e7441779170e70c187c07b1347e893'
    """

def generate_signature_for_file(file_name):
    """
    Given a file 'file_name', generate signature for the