// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // This function takes two positive numbers x and y and returns the
    // biggest even integer number that is in the range [x, y] inclusive. If 
    // there's no such number, then the function should return -1.
    // For example:
    // >>> chooseNum((12l), (15l))
    // (14l)
    // >>> chooseNum((13l), (12l))
    // (-1l)
    public static long chooseNum(long x, long y) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // This function takes two positive numbers x and y and returns the
    // biggest even integer number that is in the range [x, y] inclusive. If 
    // there's no such number, then the function should return -1.
    // For example:
    // >>> chooseNum((12l), (15l))
    // (14l)
    // >>> chooseNum((13l), (12l))
    // (-1l)
    public static long chooseNum(long x, long y) {
	if (x > y) {
	    return -1;
	}
	if (x%2 == 0) {
	    return x;
	}
	return chooseNum(x+1, y);
    }
    // This function takes an array of integers and returns the minimum and
    // maximum of all the numbers in the array in one pass (without using
    // any other variables).
    // For example:
    // >>> findMinMax(new int[]{1, 2, 3, 4, 5});
    // [1, 5]
    public static int[] findMinMax