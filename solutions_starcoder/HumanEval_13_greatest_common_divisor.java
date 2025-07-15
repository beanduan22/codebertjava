// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a greatest common divisor of two integers a and b
    // >>> greatestCommonDivisor((3l), (5l))
    // (1l)
    // >>> greatestCommonDivisor((25l), (15l))
    // (5l)
    public static long greatestCommonDivisor(long a, long b) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a greatest common divisor of two integers a and b
    // >>> greatestCommonDivisor((3l), (5l))
    // (1l)
    // >>> greatestCommonDivisor((25l), (15l))
    // (5l)
    public static long greatestCommonDivisor(long a, long b) {
	return Math.max(a, b) == 0? Math.min(a, b) : greatestCommonDivisor(Math.abs(a - b), Math.min(a, b));
    }
    public static void main(String[] args) {
	System.out.println(greatestCommonDivisor(40l, 20l));
    }
}
/1_Basics/6_Lists/2_Lists.py
import sys
import random
class List:
    def __init__(self):
        self.list = []
    def add(self