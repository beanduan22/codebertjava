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
	long result = 1;
	for(long i = n; i > 1; i--) {
	    result *= i;
	}
	return result;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	for(int i = 0; i < N; i++) {
	    long T = sc.nextLong();
	    System.out.println(specialFactorial(T));
	}
    }
}
/C_Plus_Plus/20