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
	// TODO: implement this function
	// - this function should return true if a string is a palindrome
	// - palindrome is a read the same from left to right and right to left
	// - empty string is also considered a palindrome
	// - return false if text is empty
	// - return false if text is not a palindrome
	if (text.isEmpty()) {
	    return true;
	}
	else {
	    switch (text.length()) {
	    case 1:
		return true;
	    case 2:
		return text.charAt(0