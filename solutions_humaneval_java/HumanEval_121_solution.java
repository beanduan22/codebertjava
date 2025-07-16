// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a non-empty array list of integers, return the sum of all of the odd elements that are in even positions.
    // Examples
    // >>> solution((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)7l, (long)1l))))
    // (12l)
    // >>> solution((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)3l, (long)3l, (long)3l))))
    // (9l)
    // >>> solution((new ArrayList<Long>(Arrays.asList((long)30l, (long)13l, (long)24l, (long)321l))))
    // (0l)
    public static long solution(ArrayList<Long> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a non-empty array list of integers, return the sum of all of the odd elements that are in even positions.
    // Examples
    // >>> solution((new ArrayList<Long>(Arrays.asList((long)5l, (long)8l, (long)7l, (long)1l))))
    // (12l)
    // >>> solution((new ArrayList<Long>(Arrays.asList((long)3l, (long)3l, (long)3l, (long)3l, (long)3l))))
    // (9l)
    // >>> solution((new ArrayList<Long>(Arrays.asList((long)30l, (long)13l, (long)24l, (long)321l))))
    // (0l)
    public static long solution(ArrayList<Long> lst) {
	return lst.stream().map(x->x%2==0?x:0l).mapToLong(x->x).sum();
    }
};
class Test {
    static boolean dotest(ArrayList<Long> lst, long expected) {
	return (expected == Problem.solution(lst));
    }
    public static void main(String[] args) {
	long[] cases = {
	    (long) 0,
	    (long) 0,
	    (long) 0,
	    (long) 0,
	    (long) 0,
	    (long) 0