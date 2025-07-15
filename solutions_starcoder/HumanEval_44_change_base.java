// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Change numerical base of input number x to base.
    // return string representation after the conversion.
    // base numbers are less than 10.
    // >>> changeBase((8l), (3l))
    // ("22")
    // >>> changeBase((8l), (2l))
    // ("1000")
    // >>> changeBase((7l), (2l))
    // ("111")
    public static String changeBase(long x, long base) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Change numerical base of input number x to base.
    // return string representation after the conversion.
    // base numbers are less than 10.
    // >>> changeBase((8l), (3l))
    // ("22")
    // >>> changeBase((8l), (2l))
    // ("1000")
    // >>> changeBase((7l), (2l))
    // ("111")
    public static String changeBase(long x, long base) {
	return Long.toString(x, base);
    }

    // >>> isPalindrome(30203)
    // True
    // >>> isPalindrome(21221)
    // True
    // >>> isPalindrome(21223)
    // False
    public static boolean isPalindrome(long x) {
	String s = Long.toString(x);
	int i = 0;
	int j = s.length() - 1;
	while (i < j) {
	    if (s.charAt(i)!= s.charAt(j