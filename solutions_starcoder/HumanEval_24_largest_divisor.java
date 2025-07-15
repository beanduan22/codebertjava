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
	long res = 1;
	for (long i = 2; i < n; i++) {
	    if (n % i == 0) {
		return i;
	    }
	}
	return res;
    }
    // For a given number n, find the smallest number that divides n evenly, larger than n
    // >>> smallestDivisor((15l))
    // (5l)
    public static long smallestDivisor(long n) {
	for (long i = n + 1; i < Math.pow(n, 2); i++)