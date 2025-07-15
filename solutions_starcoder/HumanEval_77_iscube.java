// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes an integer a and returns true 
    // if this ingeger is a cube of some integer number.
    // Note: you may assume the input is always valid.
    // Examples:
    // >>> iscube((1l))
    // (true)
    // >>> iscube((2l))
    // (false)
    // >>> iscube((-1l))
    // (true)
    // >>> iscube((64l))
    // (true)
    // >>> iscube((0l))
    // (true)
    // >>> iscube((180l))
    // (false)
    public static boolean iscube(long a) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that takes an integer a and returns true 
    // if this ingeger is a cube of some integer number.
    // Note: you may assume the input is always valid.
    // Examples:
    // >>> iscube((1l))
    // (true)
    // >>> iscube((2l))
    // (false)
    // >>> iscube((-1l))
    // (true)
    // >>> iscube((64l))
    // (true)
    // >>> iscube((0l))
    // (true)
    // >>> iscube((180l))
    // (false)
    public static boolean iscube(long a) {
	boolean cube = true;

	long b = (long)Math.sqrt(a);
	long c = (long)Math.sqrt(a);

	if (a!= (b * b * c))
	    cube = false;
	return cube;
    }

    public static void main(String[] args) {
	// Test the function.
	System.out.println("*** Testing iscube ***");
	System.out.println(iscube(1l));
	System.out.println(iscube(2l));
	System.out.println(isc