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
	if(n < 1l) {
	    return 0;
	}
	else if(n == 1l) {
	    return 1l;
	}
	else {
	    return n + sumToN(n - 1l);
	}
    }

    // sum_to_n_recursive_tailrec is a function that sums numbers from 1 to n.
    public static long sumToNRecursiveTailrec(long n) {
	return sumToNRecursiveTailrec(0, 1l, n);
    }

    private static long sumToN