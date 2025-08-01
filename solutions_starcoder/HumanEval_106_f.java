// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement the function f that takes n as a parameter,
    // and returns an array array list of size n, such that the value of the element at index i is the factorial of i if i is even
    // or the sum of numbers from 1 to i otherwise.
    // i starts from 1.
    // the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    // Example:
    // >>> f((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))
    public static ArrayList<Long> f(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Implement the function f that takes n as a parameter,
    // and returns an array array list of size n, such that the value of the element at index i is the factorial of i if i is even
    // or the sum of numbers from 1 to i otherwise.
    // i starts from 1.
    // the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
    // Example:
    // >>> f((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)6l, (long)24l, (long)15l)))
    public static ArrayList<Long> f(long n) {
	ArrayList<Long> l = new ArrayList<>();
	for(long i = 1; i <= n; i++){
	    if(i % 2 == 1){
		long sum = 0;
		for(long j = 1; j <= i; j++){
		    sum+=j;
		}
		l.add(sum);
	    }
	    else{
		long f = 1;
		for(long j = 1; j <= i; j++){
		    f*=j;
		}
		l.add(f);
	    }
	}
