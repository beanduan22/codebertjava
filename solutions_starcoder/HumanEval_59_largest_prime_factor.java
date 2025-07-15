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
	Set<Long> factors = new HashSet<Long>();
	long i = 2;
	while (i <= n) {
	    if (n % i == 0) {
		n /= i;
		factors.add(i);
	    } else {
		i += 1;
	    }
	}
	return factors.stream().max(Long::compare).get();
    }
}
/02/02/02-1.py
# Return the sum of the first n (positive) odd numbers.
# >>> sumOddNumbers(0)