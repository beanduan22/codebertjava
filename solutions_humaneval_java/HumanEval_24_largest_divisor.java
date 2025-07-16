// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given number n, find the largest number that divides n evenly, smaller than n
    // >>> largestDivisor((15l))
    // (5l)
    public static long largestDivisor(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given number n, find the largest number that divides n evenly, smaller than n
    // >>> largestDivisor((15l))
    // (5l)
    public static long largestDivisor(long n) {
	long max = (long) Math.sqrt(n);
	for (long i = max; i >= 1; i--) {
	    if (n % i == 0) {
		return i;
	    }
	}
	return 1;
    }
    // For a given number n, find the smallest number that divides n evenly, larger than n
    // >>> smallestDivisor(15l)
    // (16l)
    public static long smallestDivisor(long n) {
	long min = (long) Math.sqrt(n);
	for