// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given two intervals,
    // where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
    // The given intervals are closed which means that the interval (start, end)
    // includes both start and end.
    // For each given interval, it is assumed that its start is less or equal its end.
    // Your task is to determine whether the length of intersection of these two 
    // intervals is a prime number.
    // Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
    // which its length is 1, which not a prime number.
    // If the length of the intersection is a prime number, return "YES",
    // otherwise, return "NO".
    // If the two intervals don't intersect, return "NO".
    // [input/output] samples:
    // >>> intersection((Pair.with(1l, 2l)), (Pair.with(2l, 3l)))
    // ("NO")
    // >>> intersection((Pair.with(-1l, 1l)), (Pair.with(0l, 4l)))
    // ("NO")
    // >>> intersection((Pair.with(-3l, -1l)), (Pair.with(-5l, 5l)))
    // ("YES")
    public static String intersection(Pair<Long, Long> interval1, Pair<Long, Long> interval2) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given two intervals,
    // where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
    // The given intervals are closed which means that the interval (start, end)
    // includes both start and end.
    // For each given interval, it is assumed that its start is less or equal its end.
    // Your task is to determine whether the length of intersection of these two 
    // intervals is a prime number.
    // Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
    // which its length is 1, which not a prime number.
    // If the length of the intersection is a prime number, return "YES",
    // otherwise, return "NO".
    // If the two intervals don't intersect, return "NO".
    // [input/output] samples:
    // >>> intersection((Pair.with(1l, 2l)), (Pair.with(2l, 3l)))
    // ("NO")
    // >>> intersection((Pair.with(-1l, 1l)), (Pair.with(0l, 4l)))
    // ("NO")
    // >>> intersection((Pair.with(-3l, -1l)), (Pair.with(-5l, 5l)))
    // ("YES")
    public static String intersection(Pair<Long, Long> interval1, Pair<Long, Long> interval2) {
	if (interval1.getSecond() < interval2.getFirst() || interval2.getSecond() < interval1.getFirst())
	    return "NO";
	Long left = Math.max(interval1.getFirst(), interval2.getFirst());
	Long right = Math.min(interval1.getSecond(), interval2.getSecond());
	Long length = right - left + 1l;
	for (Long num = 2l; num < length; num++) {
	    if (length % num == 0) {
		return "NO";
	    }
	}
	