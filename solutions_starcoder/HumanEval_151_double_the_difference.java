// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of numbers, return the sum of squares of the numbers
    // in the array list that are odd. Ignore numbers that are negative or not integers.
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)0l))))
    // (10l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)-1l, (long)-2l, (long)0l))))
    // (0l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)9l, (long)-2l))))
    // (81l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)0l))))
    // (0l)
    // If the input array list is empty, return 0.
    public static long doubleTheDifference(ArrayList<Float> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of numbers, return the sum of squares of the numbers
    // in the array list that are odd. Ignore numbers that are negative or not integers.
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)0l))))
    // (10l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)-1l, (long)-2l, (long)0l))))
    // (0l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)9l, (long)-2l))))
    // (81l)
    // >>> doubleTheDifference((new ArrayList<Float>(Arrays.asList((long)0l))))
    // (0l)
    // If the input array list is empty, return 0.
    public static long doubleTheDifference(ArrayList<Float> lst) {
	// Write your code here
        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) % 2!= 0) {
                sum += lst.get(i) * lst.get(i);
            }
        }
        return sum;
    }
    // Given a list of strings of numbers, return the sum of the numbers in each string
    // >>> sumNumbers((new ArrayList<String>(Arrays.asList("1", "3", "2"))))
    // (6)
    // >>> sumNumbers((