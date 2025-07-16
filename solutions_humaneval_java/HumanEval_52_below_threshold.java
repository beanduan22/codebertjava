// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return true if all numbers in the array list l are below threshold t.
    // >>> belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)10l))), (100l))
    // (true)
    // >>> belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))), (5l))
    // (false)
    public static boolean belowThreshold(ArrayList<Long> l, long t) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return true if all numbers in the array list l are below threshold t.
    // >>> belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)4l, (long)10l))), (100l))
    // (true)
    // >>> belowThreshold((new ArrayList<Long>(Arrays.asList((long)1l, (long)20l, (long)4l, (long)10l))), (5l))
    // (false)
    public static boolean belowThreshold(ArrayList<Long> l, long t) {
	// Fill in this function body
	return l.stream().allMatch(x -> x < t);
    }
}

public class Solution {
    public static String runTests(String s) throws Exception {
	StringReader sr = new StringReader(s);
	BufferedReader br = new BufferedReader(sr);
	boolean first = true;

	// Read the test cases into an array list of strings
	ArrayList<String> tests = new ArrayList<String>();
	String test;
	while ((test = br.readLine())!= null) {
	    tests.add(test);
