// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Everyone knows Fibonacci sequence, it was studied deeply by mathematicians in 
    // the last couple centuries. However, what people don't know is Tribonacci sequence.
    // Tribonacci sequence is defined by the recurrence:
    // tri(1) = 3
    // tri(n) = 1 + n / 2, if n is even.
    // tri(n) =  tri(n - 1) + tri(n - 2) + tri(n + 1), if n is odd.
    // For example:
    // tri(2) = 1 + (2 / 2) = 2
    // tri(4) = 3
    // tri(3) = tri(2) + tri(1) + tri(4)
    // = 2 + 3 + 3 = 8 
    // You are given a non-negative integer number n, you have to a return an array array list of the 
    // first n + 1 numbers of the Tribonacci sequence.
    // Examples:
    // >>> tri((3l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l)))
    public static ArrayList<Long> tri(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Everyone knows Fibonacci sequence, it was studied deeply by mathematicians in 
    // the last couple centuries. However, what people don't know is Tribonacci sequence.
    // Tribonacci sequence is defined by the recurrence:
    // tri(1) = 3
    // tri(n) = 1 + n / 2, if n is even.
    // tri(n) =  tri(n - 1) + tri(n - 2) + tri(n + 1), if n is odd.
    // For example:
    // tri(2) = 1 + (2 / 2) = 2
    // tri(4) = 3
    // tri(3) = tri(2) + tri(1) + tri(4)
    // = 2 + 3 + 3 = 8 
    // You are given a non-negative integer number n, you have to a return an array array list of the 
    // first n + 1 numbers of the Tribonacci sequence.
    // Examples:
    // >>> tri((3l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)8l)))
    public static ArrayList<Long> tri(long n) {
	ArrayList<Long> ret = new ArrayList<Long>();
	ret.add((long)1);
	ret.add((long)3);
	ret.add((long)2);
	if (n < 3) {
	    if (n < 0) {
		return null;
	    }
	    return new ArrayList<Long>(ret.subList(0, (int)n + 1));
	}
	n -= 3;
	long a = 1, b = 3, c = 2;
	for (int i = 0;