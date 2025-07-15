// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Task
    // We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    // then check if the result string is palindrome.
    // A string is called palindrome if it reads the same backward as forward.
    // You should return a pair containing the result string and true/false for the check.
    // Example
    // >>> reverseDelete(("abcde"), ("ae"))
    // (Pair.with("bcd", false))
    // >>> reverseDelete(("abcdef"), ("b"))
    // (Pair.with("acdef", false))
    // >>> reverseDelete(("abcdedcba"), ("ab"))
    // (Pair.with("cdedc", true))
    public static Pair<String, Boolean> reverseDelete(String s, String c) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Task
    // We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    // then check if the result string is palindrome.
    // A string is called palindrome if it reads the same backward as forward.
    // You should return a pair containing the result string and true/false for the check.
    // Example
    // >>> reverseDelete(("abcde"), ("ae"))
    // (Pair.with("bcd", false))
    // >>> reverseDelete(("abcdef"), ("b"))
    // (Pair.with("acdef", false))
    // >>> reverseDelete(("abcdedcba"), ("ab"))
    // (Pair.with("cdedc", true))
    public static Pair<String, Boolean> reverseDelete(String s, String c) {
	// Write your code here
	Map<Character, Integer> map = new HashMap<>();
	for (int i = 0; i < c.length(); i++) {
	    if (Character.getNumericValue(c.charAt(i))!= 0)
		map.put(c.charAt(i), i);
	    else
		map.put(c.charAt(i), 1);
	}
	String res = "";
	for (int i = 0; i < s.length(); i++) {
	    if (!map.containsKey(s.charAt(i