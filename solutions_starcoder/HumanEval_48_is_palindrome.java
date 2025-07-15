// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Checks if given string is a palindrome
    // >>> isPalindrome((""))
    // (true)
    // >>> isPalindrome(("aba"))
    // (true)
    // >>> isPalindrome(("aaaaa"))
    // (true)
    // >>> isPalindrome(("zbcd"))
    // (false)
    public static boolean isPalindrome(String text) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Checks if given string is a palindrome
    // >>> isPalindrome((""))
    // (true)
    // >>> isPalindrome(("aba"))
    // (true)
    // >>> isPalindrome(("aaaaa"))
    // (true)
    // >>> isPalindrome(("zbcd"))
    // (false)
    public static boolean isPalindrome(String text) {
	return isPalindrome(text, 0, text.length() - 1);
    }

    public static boolean isPalindrome(String text, int low, int high) {
	if (low >= high)
	    return true;
	if (text.charAt(low)!= text.charAt(high))
	    return false;
	return isPalindrome(text, low + 1, high - 1);
    }

    public static void main(String[] args) throws Exception {
	System.out.println(isPalindrome(""));
	System.out.println(is