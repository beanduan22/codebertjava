// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list arr of integers and you need to return
    // sum of magnitudes of integers multiplied by product of all signs
    // of each number in the array array list, represented by 1, -1 or 0.
    // Note: return null for empty arr.
    // Example:
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)-4l))))
    // Optional.of(9l)
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l))))
    // Optional.of(0l)
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList())))
    // Optional.empty()
    public static Optional<Long> prodSigns(ArrayList<Long> arr) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list arr of integers and you need to return
    // sum of magnitudes of integers multiplied by product of all signs
    // of each number in the array array list, represented by 1, -1 or 0.
    // Note: return null for empty arr.
    // Example:
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)-4l))))
    // Optional.of(9l)
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList((long)0l, (long)1l))))
    // Optional.of(0l)
    // >>> prodSigns((new ArrayList<Long>(Arrays.asList())))
    // Optional.empty()
    public static Optional<Long> prodSigns(ArrayList<Long> arr) {
	// YOUR CODE HERE
	// return null;
	long prod = 1l;
	long mag = 0l;
	for (long num: arr) {
	    long sign = 0l;
	    if (num > 0) {
		sign = 1l;
		mag += num*num;
	    } else if (num < 0) {
		sign = -1l;
		mag += num*num;
	    }
	    prod *= sign;
	}
		
	if (mag == 0l) return Optional.empty();
	return Optional