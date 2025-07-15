// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input are two strings a and b consisting only of 1s and 0s.
    // Perform binary XOR on these inputs and return result also as a string.
    // >>> stringXor(("010"), ("110"))
    // ("100")
    public static String stringXor(String a, String b) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input are two strings a and b consisting only of 1s and 0s.
    // Perform binary XOR on these inputs and return result also as a string.
    // >>> stringXor(("010"), ("110"))
    // ("100")
    public static String stringXor(String a, String b) {
	if (a.length()!= b.length()) {
	    System.out.println("Strings are not of same length");
	    return "0";
	}
	String result = "";
	for (int i = 0; i < a.length(); i++) {
	    if (a.charAt(i)!= b.charAt(i)) {
		result += "1";
	    } else {
		result += "0";
	    }
	}
	return result;
    }

    // 2. Find the missing number in an array with range [1.. n]
    //