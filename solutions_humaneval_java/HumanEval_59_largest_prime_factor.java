// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return the largest prime factor of n. Assume n > 1 and is not a prime.
    // >>> largestPrimeFactor((13195l))
    // (29l)
    // >>> largestPrimeFactor((2048l))
    // (2l)
    public static long largestPrimeFactor(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return the largest prime factor of n. Assume n > 1 and is not a prime.
    // >>> largestPrimeFactor((13195l))
    // (29l)
    // >>> largestPrimeFactor((2048l))
    // (2l)
    public static long largestPrimeFactor(long n) {
	long largest = 1;
	for (long f = 2; f <= n / f; f++) {
	    if (n % f == 0) {
		largest = f;
		while (n % f == 0) {
		    n /= f;
		}
	    }
	}
	if (n > largest) {
	    largest = n;
	}
	return largest;
    }

    public static void main(String[] args) {
	long n = 600851475143l;
	System.out