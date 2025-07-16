// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You have been tasked to write a function that receives 
    // a hexadecimal number as a string and counts the number of hexadecimal 
    // digits that are primes (prime number, or a prime, is a natural number 
    // greater than 1 that is not a product of two smaller natural numbers).
    // Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
    // Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
    // So you have to determine a number of the following digits: 2, 3, 5, 7, 
    // B (=decimal 11), D (=decimal 13).
    // Note: you may assume the input is always correct or empty string, 
    // and symbols A,B,C,D,E,F are always uppercase.
    // Examples:
    // >>> hexKey(("AB"))
    // (1l)
    // >>> hexKey(("1077E"))
    // (2l)
    // >>> hexKey(("ABED1A33"))
    // (4l)
    // >>> hexKey(("123456789ABCDEF0"))
    // (6l)
    // >>> hexKey(("2020"))
    // (2l)
    public static long hexKey(String num) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You have been tasked to write a function that receives 
    // a hexadecimal number as a string and counts the number of hexadecimal 
    // digits that are primes (prime number, or a prime, is a natural number 
    // greater than 1 that is not a product of two smaller natural numbers).
    // Hexadecimal digits are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.
    // Prime numbers are 2, 3, 5, 7, 11, 13, 17,...
    // So you have to determine a number of the following digits: 2, 3, 5, 7, 
    // B (=decimal 11), D (=decimal 13).
    // Note: you may assume the input is always correct or empty string, 
    // and symbols A,B,C,D,E,F are always uppercase.
    // Examples:
    // >>> hexKey(("AB"))
    // (1l)
    // >>> hexKey(("1077E"))
    // (2l)
    // >>> hexKey(("ABED1A33"))
    // (4l)
    // >>> hexKey(("123456789ABCDEF0"))
    // (6l)
    // >>> hexKey(("2020"))
    // (2l)
    public static long hexKey(String num) {
	long count = 0;
	for (char c : num.toCharArray()) {
	    int n = Integer.parseInt(String.valueOf(c), 16);
	    if (primality(n))
		count++;
	}
	return count;
    }
    public static boolean primality(int n) {
	if (n <= 1)
	    return false;
	if (n <= 3)
	    return true;
	if (n % 2 == 0 || n % 3 == 0)
	    return false;
	for (int i = 