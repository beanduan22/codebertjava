// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list arr of integers and a positive integer k, return a sorted array list 
    // of length k with the maximum k numbers in arr.
    // Example 1:
    // >>> maximum((new ArrayList<Long>(Arrays.asList((long)-3l, (long)-4l, (long)5l))), (3l))
    // (new ArrayList<Long>(Arrays.asList((long)-4l, (long)-3l, (long)5l)))
    // Example 2:
    // >>> maximum((new ArrayList<Long>(Arrays.asList((long)4l, (long)-4l, (long)4l))), (2l))
    // (new ArrayList<Long>(Arrays.asList((long)4l, (long)4l)))
    // Example 3:
    // >>> maximum((new ArrayList<Long>(Arrays.asList((long)-3l, (long)2l, (long)1l, (long)2l, (long)-1l, (long)-2l, (long)1l))), (1l))
    // (new ArrayList<Long>(Arrays.asList((long)2l)))
    // Note:
    // 1. The length of the array array list will be in the range of [1, 1000].
    // 2. The elements in the array array list will be in the range of [-1000, 1000].
    // 3. 0 <= k <= len(arr)
    public static ArrayList<Long> maximum(ArrayList<Long> arr, long k) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list arr of integers and a positive integer k, return a sorted array list 
    // of length k with the maximum k numbers in arr.
    // Example 1:
    // >>> maximum((new ArrayList<Long>(Arrays.asList((long)-3l, (long)-4l, (long)5l))), (3l))
    // (new ArrayList<Long>(Arrays.asList((long)-4l, (long)-3l, (long)5l)))
    // Example 2:
    // >>> maximum((new ArrayList<Long>(Arrays.asList((long)4l, (long)-4l, (long)4l))), (2l))
    // (new ArrayList<Long>(Arrays.asList((long)4l, (long)4l)))
    // Example 3:
    // >>> maximum((new ArrayList<Long>(Arrays.asList((long)-3l, (long)2l, (long)1l, (long)2l, (long)-1l, (long)-2l, (long)1l))), (1l))
    // (new ArrayList<Long>(Arrays.asList((long)2l)))
    // Note:
    // 1. The length of the array array list will be in the range of [1, 1000].
    // 2. The elements in the array array list will be in the range of [-1000, 1000].
    // 3. 0 <= k <= len(arr)
    public static ArrayList<Long> maximum(ArrayList<Long> arr, long k) {
	int len = arr.size();
	ArrayList<Long> arr_copy = new ArrayList<Long>(arr);
	ArrayList<Long> result = new ArrayList<Long>();
	Collections.sort(arr_copy, Collections.reverseOrder());
	for (int i = 0; i < k; i++) {
	    result.add(arr_copy.get(i));
	}
	return result;
    }
}
def is_palindrome(x):
    '''
    Given an integer x, return true if x is palindrome integer.

    An integer is a pal