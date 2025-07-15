// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes a string and returns true if the string
    // length is a prime number or false otherwise
    // Examples
    // >>> primeLength(("Hello"))
    // (true)
    // >>> primeLength(("abcdcba"))
    // (true)
    // >>> primeLength(("kittens"))
    // (true)
    // >>> primeLength(("orange"))
    // (false)
    public static boolean primeLength(String string) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes a string and returns true if the string
    // length is a prime number or false otherwise
    // Examples
    // >>> primeLength(("Hello"))
    // (true)
    // >>> primeLength(("abcdcba"))
    // (true)
    // >>> primeLength(("kittens"))
    // (true)
    // >>> primeLength(("orange"))
    // (false)
    public static boolean primeLength(String string) {
	int length = string.length();
	// For every number from 2 to length - 1, check if it's a factor
	// of length. If so, return false.
	for(int i = 2; i < length; i++) {
	    if(length % i == 0) {
		return false;
	    }
	}
	return true;
    }
}
/algorithms/python/leetcode/88.py
import math
import os
import random
import re
import sys
from collections import defaultdict, Counter

class Solution: