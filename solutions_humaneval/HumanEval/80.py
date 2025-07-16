# Prompt:

def is_happy(s):
    """You are given a string s.
    Your task is to check if the string is happy or not.
    A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
    For example:
    is_happy(a) => False
    is_happy(aa) => False
    is_happy(abcd) => True
    is_happy(aabb) => False
    is_happy(adb) => True
    is_happy(xyy) => False
    """

# Solution:

def is_happy(s):
    """You are given a string s.
    Your task is to check if the string is happy or not.
    A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
    For example:
    is_happy(a) => False
    is_happy(aa) => False
    is_happy(abcd) => True
    is_happy(aabb) => False
    is_happy(adb) => True
    is_happy(xyy) => False
    """
/Week 3/Day 4/exercise_1.py
# -*- coding: utf-8 -*-


def split_pairs(s):
    """
    Write a function called split_pairs that takes in a string,
    and returns a list of pairs of characters.
    For example:
    split_pairs('abc') ====> ['ab', 'c_']
    split_pairs('abcdf') ====> ['ab', 'cd', 'f_']
    split_pairs('abcdfg') ====> ['ab', 'cd', 'ef', 'g_']
    split_pairs('')