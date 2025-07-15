// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // The Brazilian factorial is defined as:
    // brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
    // where n > 0
    // For example:
    // >>> specialFactorial((4l))
    // (288l)
    // The function will receive an integer as input and should return the special
    // factorial of this integer.
    public static long specialFactorial(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // The Brazilian factorial is defined as:
    // brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
    // where n > 0
    // For example:
    // >>> specialFactorial((4l))
    // (288l)
    // The function will receive an integer as input and should return the special
    // factorial of this integer.
    public static long specialFactorial(long n) {
	// Write your code here

        long[] arr = new long[(int)(n+1)];
        arr[1] = 1;
        for(long i = 2; i <= n; i++){
            arr[i] = arr[i-1]*i;
        }
        return arr[(int)n];
    }

    // You are given a number of integers as input. The function
    // should return the count of how many of these integers are
    // palindromes.
    //
    // A palindrome is a number that is the same forwards and
    // backwards. For example:
    //