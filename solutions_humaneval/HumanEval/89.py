# Prompt:

def encrypt(s):
    """Create a function encrypt that takes a string as an argument and
    returns a string encrypted with the alphabet being rotated. 
    The alphabet should be rotated in a manner such that the letters 
    shift down by two multiplied to two places.
    For example:
    encrypt('hi') returns 'lm'
    encrypt('asdfghjkl') returns 'ewhjklnop'
    encrypt('gf') returns 'kj'
    encrypt('et') returns 'ix'
    """

# Solution:

def encrypt(s):
    """Create a function encrypt that takes a string as an argument and
    returns a string encrypted with the alphabet being rotated. 
    The alphabet should be rotated in a manner such that the letters 
    shift down by two multiplied to two places.
    For example:
    encrypt('hi') returns 'lm'
    encrypt('asdfghjkl') returns 'ewhjklnop'
    encrypt('gf') returns 'kj'
    encrypt('et') returns 'ix'
    """
/class_examples/ch2/2_11_1.py
#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu May 10 09:17:00 2018

@author: jessicamiles
"""
import sys
print(sys.argv)
print(type(sys.argv))

if len(sys.argv) < 2:
    print("You need to include a filename")
else:
    filename = sys.argv[1]
    print("