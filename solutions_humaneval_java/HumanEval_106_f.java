// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement the function f that takes n as a parameter,
    // and returns an array array list of size n, such that the value of the element at index i is the factorial of i if i is even
    // or the sum of numbers from 1 to i otherwise.
    // i starts from 1.
    // the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    // Example:
    // >>> f((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))
    public static ArrayList<Long> f(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement the function f that takes n as a parameter,
    // and returns an array array list of size n, such that the value of the element at index i is the factorial of i if i is even
    // or the sum of numbers from 1 to i otherwise.
    // i starts from 1.
    // the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    // Example:
    // >>> f((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))
    public static ArrayList<Long> f(long n) {
	long[] result = new long[(int) n];
	for (int i = 1; i <= n; i++) {
	    if (i % 2 == 0) {
		result[i - 1] = factorial(i);
	    } else {
		result[i - 1] = sum(i);
	    }
	}
	return new ArrayList<Long>(Arrays.asList(result));
    }
    private static long factorial(long n) {
	long result = 1;
	while (n > 0) {
	    result *= n