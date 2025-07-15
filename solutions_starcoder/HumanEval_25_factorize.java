// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of prime factors of given integer in the order from smallest to largest.
    // Each of the factors should be array listed number of times corresponding to how many times it appeares in factorization.
    // Input number should be equal to the product of all factors
    // >>> factorize((8l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))
    // >>> factorize((25l))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)5l)))
    // >>> factorize((70l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)7l)))
    public static ArrayList<Long> factorize(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of prime factors of given integer in the order from smallest to largest.
    // Each of the factors should be array listed number of times corresponding to how many times it appeares in factorization.
    // Input number should be equal to the product of all factors
    // >>> factorize((8l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)2l)))
    // >>> factorize((25l))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)5l)))
    // >>> factorize((70l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)7l)))
    public static ArrayList<Long> factorize(long n) {
	ArrayList<Long> result = new ArrayList<>();
	if (n == 1) {
	    result.add((long)1l);
	    return result;
	}
	while (n % 2 == 0) {
	    result.add((long)2l);
	    n = n / 2;
	}
	for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
	    while (n % i == 0) {
		result.add((long)i);
		n = n / i;
	    }