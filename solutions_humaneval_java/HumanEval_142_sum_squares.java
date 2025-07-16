// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // "
    // This function will take an array array list of integers. For all entries in the array list, the function shall square the integer entry if its index is a 
    // multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not 
    // change the entries in the array list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries. 
    // Examples:
    // >>> lst
    // (long)new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))
    // >>> lst
    // (long)new ArrayList<Long>(Arrays.asList())
    // >>> lst
    // (long)new ArrayList<Long>(Arrays.asList((long)-1l, (long)-5l, (long)2l, (long)-1l, (long)-5l))
    public static long sumSquares(ArrayList<Long> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // "
    // This function will take an array array list of integers. For all entries in the array list, the function shall square the integer entry if its index is a 
    // multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not 
    // change the entries in the array list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries. 
    // Examples:
    // >>> lst
    // (long)new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))
    // >>> lst
    // (long)new ArrayList<Long>(Arrays.asList())
    // >>> lst
    // (long)new ArrayList<Long>(Arrays.asList((long)-1l, (long)-5l, (long)2l, (long)-1l, (long)-5l))
    public static long sumSquares(ArrayList<Long> lst) {
	return lst.stream().map(l -> {
	    if (l % 3 == 0) {
		return Math.pow(l, 2);
	    } else if (l % 4 == 0) {
		return Math.pow(l, 3);
	    } else {
		return l;
	    }
	}).reduce(Long.valueOf(0), (a, b) -> Long.valueOf(a + b));
    }
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int lstCount =