// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes an array array list of numbers as input and returns 
    // the number of elements in the array array list that are greater than 10 and both 
    // first and last digits of a number are odd (1, 3, 5, 7, 9).
    // For example:
    // >>> specialFilter((new ArrayList<Long>(Arrays.asList((long)15l, (long)-73l, (long)14l, (long)-15l))))
    // (1l)
    // >>> specialFilter((new ArrayList<Long>(Arrays.asList((long)33l, (long)-2l, (long)-3l, (long)45l, (long)21l, (long)109l))))
    // (2l)
    public static long specialFilter(ArrayList<Long> nums) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes an array array list of numbers as input and returns 
    // the number of elements in the array array list that are greater than 10 and both 
    // first and last digits of a number are odd (1, 3, 5, 7, 9).
    // For example:
    // >>> specialFilter((new ArrayList<Long>(Arrays.asList((long)15l, (long)-73l, (long)14l, (long)-15l))))
    // (1l)
    // >>> specialFilter((new ArrayList<Long>(Arrays.asList((long)33l, (long)-2l, (long)-3l, (long)45l, (long)21l, (long)109l))))
    // (2l)
    public static long specialFilter(ArrayList<Long> nums) {
	long num = 0;
	for(Long num1 : nums) {
	    if((num1 > 10 && (num1/10)%10%2!= 0 && num1%10%2!= 0) || (num1 < 0 && (num1/10)%10%2!= 0 && num1%10%2!= 0)){
		num++;
	    }
	}
	return num;
    }

    // Write a function that takes a number n as input, and returns an array of length n filled with the 
   