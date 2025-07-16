// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of integers nums, find the minimum sum of any non-empty sub-array array list
    // of nums.
    // Example
    // >>> minSubArraySum((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)1l, (long)2l, (long)4l))))
    // (1l)
    // >>> minSubArraySum((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-2l, (long)-3l))))
    // (-6l)
    public static long minSubArraySum(ArrayList<Long> nums) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of integers nums, find the minimum sum of any non-empty sub-array array list
    // of nums.
    // Example
    // >>> minSubArraySum((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l, (long)1l, (long)2l, (long)4l))))
    // (1l)
    // >>> minSubArraySum((new ArrayList<Long>(Arrays.asList((long)-1l, (long)-2l, (long)-3l))))
    // (-6l)
    public static long minSubArraySum(ArrayList<Long> nums) {
	long[] minSumArray = new long[nums.size()];
	long[] maxSumArray = new long[nums.size()];
	minSumArray[0] = nums.get(0);
	maxSumArray[0] = nums.get(0);
	long minSum = Long.MAX_VALUE;
	for (int i = 1; i < nums.size(); i++) {
	    minSumArray[i] = Math.min(nums.get(i), nums.get(i) + minSumArray[i-1]);
	    maxSumArray[