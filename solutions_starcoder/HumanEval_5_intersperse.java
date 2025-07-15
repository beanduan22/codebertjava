// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Insert a number 'delimeter' between every two consecutive elements of input array list `numbers'
    // >>> intersperse((new ArrayList<Long>(Arrays.asList())), (4l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> intersperse((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))), (4l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)4l, (long)3l)))
    public static ArrayList<Long> intersperse(ArrayList<Long> numbers, long delimeter) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Insert a number 'delimeter' between every two consecutive elements of input array list `numbers'
    // >>> intersperse((new ArrayList<Long>(Arrays.asList())), (4l))
    // (new ArrayList<Long>(Arrays.asList()))
    // >>> intersperse((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))), (4l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)4l, (long)3l)))
    public static ArrayList<Long> intersperse(ArrayList<Long> numbers, long delimeter) {
	if (numbers.isEmpty()) {
	    return (new ArrayList<Long>(Arrays.asList()));
	}
	long[] array = numbers.stream().mapToLong(Long::longValue).toArray();
	long[] copy = new long[array.length + 1];
	System.arraycopy(array, 0, copy, 0, array.length);
	copy[array.length] = delimeter;
	return (new ArrayList<Long>(Arrays.asList(Arrays.stream(copy).boxed().toArray())));
    }

    // Merge two sorted list of integers
    // >>> merge