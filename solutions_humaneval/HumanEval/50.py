# Prompt:


def encode_shift(s: str):
    """
    returns encoded string by shifting every character by 5 in the alphabet.
    """
    return "".join([chr(((ord(ch) + 5 - ord("a")) % 26) + ord("a")) for ch in s])


def decode_shift(s: str):
    """
    takes as input string encoded with encode_shift function. Returns decoded string.
    """

# Solution:


def encode_shift(s: str):
    """
    returns encoded string by shifting every character by 5 in the alphabet.
    """
    return "".join([chr(((ord(ch) + 5 - ord("a")) % 26) + ord("a")) for ch in s])


def decode_shift(s: str):
    """
    takes as input string encoded with encode_shift function. Returns decoded string.
    """
#     return "".join([chr(((ord(ch) - 5 - ord("a")) % 26) + ord("a")) for ch in s])
    return "".join([chr(((ord(x) - 5) % 26) + ord("a")) for x in s])
#     return "".join(chr((ord(x) - 5 - ord("a")) % 26 + ord("a")) for x in s)

# Testing:

print(encode_shift('abc'))
print(decode_shift(encode_shift('abc')))