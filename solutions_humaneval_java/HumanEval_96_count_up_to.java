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
	ArrayList<Long> result = new ArrayList<Long>();
	if (n > 1) {
	    result.add((long)2);
	}
	for (int i = 3; i < n; i+=2) {
	    boolean isPrime = true;
	    for (int divisor = 3; divisor < i; ++divisor) {
		if (i % divisor == 0) {
		    isPrime = false;
		}
	    }
	    if (isPrime) {
		result.add((long)i);
	    }
	}
	System.out