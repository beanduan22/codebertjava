// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of non-negative integers, return a cojava of the given array array list after sorting,
    // you will sort the given array array list in ascending order if the sum( first index value, last index value) is odd,
    // or sort it in descending order if the sum( first index value, last index value) is even.
    // Note:
    // * don't change the given array array list.
    // Examples:
    // >>> sortArray((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l, (long)6l))))
    // (new ArrayList<Long>(Arrays.asList((long)6l, (long)5l, (long)4l, (long)3l, (long)2l, (long)1l, (long)0l)))
    public static ArrayList<Long> sortArray(ArrayList<Long> array) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of non-negative integers, return a cojava of the given array array list after sorting,
    // you will sort the given array array list in ascending order if the sum( first index value, last index value) is odd,
    // or sort it in descending order if the sum( first index value, last index value) is even.
    // Note:
    // * don't change the given array array list.
    // Examples:
    // >>> sortArray((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)1l, (long)2l, (long)3l, (long)4l, (long)5l)))
    // >>> sortArray((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)3l, (long)0l, (long)1l, (long)5l, (long)6l))))
    // (new ArrayList<Long>(Arrays.asList((long)6l, (long)5l, (long)4l, (long)3l, (long)2l, (long)1l, (long)0l)))
    public static ArrayList<Long> sortArray(ArrayList<Long> array) {
	if(array.size() <= 1) return array;
	int first = 0, last = array.size() - 1;
	if((array.get(first) + array.get(last)) % 2 == 0) {
	    Collections.sort(array, Collections.reverseOrder());
	}
	else {
	    Collections.sort(array);
	}
	return array;
    }

    // Given an array array list of integers and a non-negative integer k,
    // return a cojava of the given array array list after sorting it in ascending order