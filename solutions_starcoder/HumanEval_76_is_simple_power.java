// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Your task is to write a function that returns true if a number x is a simple
    // power of n and false in other cases.
    // x is a simple power of n if n**int=x
    // For example:
    // >>> isSimplePower((1l), (4l))
    // (true)
    // >>> isSimplePower((2l), (2l))
    // (true)
    // >>> isSimplePower((8l), (2l))
    // (true)
    // >>> isSimplePower((3l), (2l))
    // (false)
    // >>> isSimplePower((3l), (1l))
    // (false)
    // >>> isSimplePower((5l), (3l))
    // (false)
    public static boolean isSimplePower(long x, long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Your task is to write a function that returns true if a number x is a simple
    // power of n and false in other cases.
    // x is a simple power of n if n**int=x
    // For example:
    // >>> isSimplePower((1l), (4l))
    // (true)
    // >>> isSimplePower((2l), (2l))
    // (true)
    // >>> isSimplePower((8l), (2l))
    // (true)
    // >>> isSimplePower((3l), (2l))
    // (false)
    // >>> isSimplePower((3l), (1l))
    // (false)
    // >>> isSimplePower((5l), (3l))
    // (false)
    public static boolean isSimplePower(long x, long n) {
	// Your code here
	if (n == 0) {
	    return false;
	}
	if (x < 0) {
	    return false;
	}
	if (x == 1) {
	    return true;
	}
	for (long i = 2; i * i <= x; i++) {
	    if (x % i == 0 && isSimplePower(x, i)) {
		return true;
	    }
	}
	return false;
    }
}
public class Solution {
    public int findComplement(int num