// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, you have to make a pile of n levels of stones.
    // The first level has n stones.
    // The number of stones in the next level is:
    // - the next odd number if n is odd.
    // - the next even number if n is even.
    // Return the number of stones in each level in an array array list, where element at index
    // i represents the number of stones in the level (i+1).
    // Examples:
    // >>> makeAPile((3l))
    // (new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)7l)))
    public static ArrayList<Long> makeAPile(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, you have to make a pile of n levels of stones.
    // The first level has n stones.
    // The number of stones in the next level is:
    // - the next odd number if n is odd.
    // - the next even number if n is even.
    // Return the number of stones in each level in an array array list, where element at index
    // i represents the number of stones in the level (i+1).
    // Examples:
    // >>> makeAPile((3l))
    // (new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)7l)))
    public static ArrayList<Long> makeAPile(long n) {
	ArrayList<Long> ans = new ArrayList<>();
	for (long i = 1; i <= n; i++) {
	    long nextCount = i % 2 == 1? i + 1 : i + 2;
	    ans.add(nextCount);
	}
	return ans;
    }

    public static void main(String[] args) {
	long n = 1000000000l;
	ArrayList<Long> answer = makeAPile(n);
	System.out.println(answer);
	System.out.println