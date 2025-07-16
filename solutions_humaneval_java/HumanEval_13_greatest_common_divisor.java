// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a greatest common divisor of two integers a and b
    // >>> greatestCommonDivisor((3l), (5l))
    // (1l)
    // >>> greatestCommonDivisor((25l), (15l))
    // (5l)
    public static long greatestCommonDivisor(long a, long b) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a greatest common divisor of two integers a and b
    // >>> greatestCommonDivisor((3l), (5l))
    // (1l)
    // >>> greatestCommonDivisor((25l), (15l))
    // (5l)
    public static long greatestCommonDivisor(long a, long b) {
	if (a == 0) {
	    return b;
	}
	if (b == 0) {
	    return a;
	}
	return greatestCommonDivisor(b, a % b);
    }
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	long a = in.nextLong();
	long b = in.nextLong();
	System.out.println(greatestCommonDivisor(a, b));
    }
    public static void assertEquals(Object expected, Object a) {
	if