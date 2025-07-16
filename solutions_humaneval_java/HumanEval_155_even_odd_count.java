// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an integer. return a pair that has the number of even and odd digits respectively.
    // Example:
    // >>> evenOddCount((-12l))
    // (Pair.with(1l, 1l))
    // >>> evenOddCount((123l))
    // (Pair.with(1l, 2l))
    public static Pair<Long, Long> evenOddCount(long num) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an integer. return a pair that has the number of even and odd digits respectively.
    // Example:
    // >>> evenOddCount((-12l))
    // (Pair.with(1l, 1l))
    // >>> evenOddCount((123l))
    // (Pair.with(1l, 2l))
    public static Pair<Long, Long> evenOddCount(long num) {
	long oddCount = 0L;
	long evenCount = 0L;
	boolean even = true;
	String s = Long.toString(Math.abs(num));
	for (int i = 0; i < s.length(); i++) {
	    if (even) {
		evenCount++;
	    } else {
		oddCount++;
	    }
	    even =!even;
	}
	return Pair.with(evenCount, oddCount);
    }
    

    // Given an integer. return a pair that has the number of even and odd digits respectively.
    //