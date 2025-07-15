// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {
	long count = 0;
	for (long i = 1; i <= n; i++) {
	    if (i % 10 == 1) count++;
	    if (i / 10 % 10 == 1) count++;
	    if (i / 100 % 10 == 1) count++;
	    if (i / 1000 % 10 == 1) count++;
	    if (i / 10000 % 10 == 1) count++;
	}
	return count;
    }
    public