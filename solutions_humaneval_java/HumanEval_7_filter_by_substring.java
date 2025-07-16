// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter an input array list of strings only for ones that contain given substring
    // >>> filterBySubstring((new ArrayList<String>(Arrays.asList())), ("a"))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> filterBySubstring((new ArrayList<String>(Arrays.asList((String)"abc", (String)"bacd", (String)"cde", (String)"array"))), ("a"))
    // (new ArrayList<String>(Arrays.asList((String)"abc", (String)"bacd", (String)"array")))
    public static ArrayList<String> filterBySubstring(ArrayList<String> strings, String substring) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter an input array list of strings only for ones that contain given substring
    // >>> filterBySubstring((new ArrayList<String>(Arrays.asList())), ("a"))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> filterBySubstring((new ArrayList<String>(Arrays.asList((String)"abc", (String)"bacd", (String)"cde", (String)"array"))), ("a"))
    // (new ArrayList<String>(Arrays.asList((String)"abc", (String)"bacd", (String)"array")))
    public static ArrayList<String> filterBySubstring(ArrayList<String> strings, String substring) {
	// BEGIN
        return strings.stream()
           .filter(s -> s.contains(substring))
           .collect(Collectors.toCollection(ArrayList::new));
	// END
    }
    // Test whether a given string is a palindrome
    // >>> isPalindrome("abccba")
    // true
    // >>> isPalindrome("abccbe")
    // false
    public static boolean isPalindrome(String string) {
	// BEGIN
	return new StringBuilder(string).reverse().toString().equals(string);
	// END
    }
    // Remove duplicate values from array list of strings
   