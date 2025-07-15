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
	long sum = 0;
	for (int i = 0; i < lst.size(); i++) {
	    if (i % 3 == 0) {
		long sq = lst.get(i) * lst.get(i);
		lst.set(i, sq);
	    }
	    else if (i % 4 == 0 && i % 3!= 0) {
		long cbr = lst.get(i) * lst.get(i) * lst.get(i);
		lst.set(i, cbr);
	    }