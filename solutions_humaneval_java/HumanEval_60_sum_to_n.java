// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // sum_to_n is a function that sums numbers from 1 to n.
    // >>> sumToN((30l))
    // (465l)
    // >>> sumToN((100l))
    // (5050l)
    // >>> sumToN((5l))
    // (15l)
    // >>> sumToN((10l))
    // (55l)
    // >>> sumToN((1l))
    // (1l)
    public static long sumToN(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // sum_to_n is a function that sums numbers from 1 to n.
    // >>> sumToN((30l))
    // (465l)
    // >>> sumToN((100l))
    // (5050l)
    // >>> sumToN((5l))
    // (15l)
    // >>> sumToN((10l))
    // (55l)
    // >>> sumToN((1l))
    // (1l)
    public static long sumToN(long n) {
	if (n==1) {
	    return 1;
	}
	return (n * (n+1))/2;
    }
    // sum_of_squares is a function that returns the sum of squares from 1 to n.
    // >>> sumOfSquares((30l))
    // (2640l)
    // >>> sumOfSquares((10l))
    // (385l)
    // >>> sumOfSquares((1l))
    // (1l)
    // >>> sumOfSquares((100l))
    // (3