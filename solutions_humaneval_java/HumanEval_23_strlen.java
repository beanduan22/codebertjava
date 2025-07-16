// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return length of given string
    // >>> stringLength((""))
    // (0l)
    // >>> stringLength(("abc"))
    // (3l)
    public static long strlen(String string) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return length of given string
    // >>> stringLength((""))
    // (0l)
    // >>> stringLength(("abc"))
    // (3l)
    public static long strlen(String string) {
	// BEGIN
	return string.length();
	// END
    }

    // Return true if given string is a palindrome
    // >>> palindrome(("racecar"))
    // (true)
    // >>> palindrome(("hello"))
    // (false)
    public static boolean palindrome(String string) {
	// BEGIN
	return string.equals(new StringBuilder(string).reverse().toString());
	// END
    }

    // Return the factorial of the given number
    // >>> factorial((5))
    // (120l)
    // >>> factorial((10))
    //