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
	long oddProduct = 1;
	while (n > 0) {
	    long last = n % 10;
	    if (last % 2!= 0) {
		oddProduct *= last;
	    }
	    n /= 10;
	}
	return oddProduct;
    }
}
eger and returns the sum of the digits of that integer.
// >>> sum_digits(10)
// 1
// >>> sum_digits(55123)
// 16
// >>> sum_digits(123