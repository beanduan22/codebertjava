// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the product of the odd digits.
    // Return 0 if all digits are even.
    // For example:
    // >>> digits((1l))
    // (1l)
    // >>> digits((4l))
    // (0l)
    // >>> digits((235l))
    // (15l)
    public static long digits(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the product of the odd digits.
    // Return 0 if all digits are even.
    // For example:
    // >>> digits((1l))
    // (1l)
    // >>> digits((4l))
    // (0l)
    // >>> digits((235l))
    // (15l)
    public static long digits(long n) {
	long product = 1;
	while (n!= 0) {
	    if (n % 2 == 1) {
		product *= (n % 10);
	    }
	    n /= 10;
	}
	return product;
    }

    // Return true if the given string is a palindrome
    // (reads the same forwards and backwards)
    public static boolean palindrome(String s) {
	return s.equals(new StringBuilder(s).reverse().toString());
    }

    // Given a list of integers and a target sum, return true if any two
   