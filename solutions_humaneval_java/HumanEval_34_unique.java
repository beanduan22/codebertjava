// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return sorted unique elements in an array array list
    // >>> unique((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)5l, (long)2l, (long)3l, (long)3l, (long)9l, (long)0l, (long)123l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)2l, (long)3l, (long)5l, (long)9l, (long)123l)))
    public static ArrayList<Long> unique(ArrayList<Long> l) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return sorted unique elements in an array array list
    // >>> unique((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)5l, (long)2l, (long)3l, (long)3l, (long)9l, (long)0l, (long)123l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)2l, (long)3l, (long)5l, (long)9l, (long)123l)))
    public static ArrayList<Long> unique(ArrayList<Long> l) {
	ArrayList<Long> result = new ArrayList<Long>();
	result.addAll(l);
	// Add your code here
	return result;
    }
    
    // Return a list of all the multiples of n between min and max inclusive
    // >>> multiples(3,1,10)
    // (new ArrayList<Long>(Arrays.asList((long)3l, (long)6l, (long)9l)))
    public static ArrayList<Long> multiples(long n, long min, long max) {
	ArrayList<Long> result = new ArrayList<Long>();
	