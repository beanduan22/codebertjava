// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an integer. return a pair that has the number of even and odd digits respectively.
    // Example:
    // >>> evenOddCount((-12l))
    // (Pair.with(1l, 1l))
    // >>> evenOddCount((123l))
    // (Pair.with(1l, 2l))
    public static Pair<Long, Long> evenOddCount(long num) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an integer. return a pair that has the number of even and odd digits respectively.
    // Example:
    // >>> evenOddCount((-12l))
    // (Pair.with(1l, 1l))
    // >>> evenOddCount((123l))
    // (Pair.with(1l, 2l))
    public static Pair<Long, Long> evenOddCount(long num) {
	long even = 0;
	long odd = 0;
	while(num > 0) {
	    if(num % 10 % 2 == 0)
		even++;
	    else
		odd++;
	    num /= 10;
	}
	return Pair.with(even, odd);
    }
    public static void main(String[] args) {
	System.out.println(evenOddCount(123l));
	System.out.println(evenOddCount(1212l));
	System.out.println(even