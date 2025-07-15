// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement a function that takes an non-negative integer and returns an array array list of the first n
    // integers that are prime numbers and less than n.
    // for example:
    // >>> countUpTo((5l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))
    // >>> countUpTo((11l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l)))
    // >>> countUpTo((0l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> countUpTo((20l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l, (long)19l)))
    // >>> countUpTo((1l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> countUpTo((18l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l)))
    public static ArrayList<Long> countUpTo(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement a function that takes an non-negative integer and returns an array array list of the first n
    // integers that are prime numbers and less than n.
    // for example:
    // >>> countUpTo((5l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))
    // >>> countUpTo((11l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l)))
    // >>> countUpTo((0l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> countUpTo((20l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l, (long)19l)))
    // >>> countUpTo((1l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> countUpTo((18l))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)5l, (long)7l, (long)11l, (long)13l, (long)17l)))
    public static ArrayList<Long> countUpTo(long n) {
	ArrayList<Long> primeList = new ArrayList<>();
	if (n == 0) return primeList;
	for (long i = 1l; i <= n; i++) {
	    if (isPrime(i)) primeList.add(i);
	}
	return primeList;
    }

    public static boolean isPrime(long n) {
	if (n < 2) return false;
	for (long i = 2l; i <= Math.sqrt(n); i++) {
	    if (n % i == 0) return false;
	