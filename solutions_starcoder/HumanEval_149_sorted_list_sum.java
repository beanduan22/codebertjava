// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that accepts an array array list of strings as a parameter,
    // deletes the strings that have odd lengths from it,
    // and returns the resulted array list with a sorted order,
    // The array list is always an array array list of strings and never an array array list of numbers,
    // and it may contain duplicates.
    // The order of the array list should be ascending by length of each word, and you
    // should return the array list sorted by that rule.
    // If two words have the same length, sort the array list alphabetically.
    // The function should return an array array list of strings in sorted order.
    // You may assume that all words will have the same length.
    // For example:
    // >>> listSort((new ArrayList<String>(Arrays.asList((String)"aa", (String)"a", (String)"aaa"))))
    // (new ArrayList<String>(Arrays.asList((String)"aa")))
    // >>> listSort((new ArrayList<String>(Arrays.asList((String)"ab", (String)"a", (String)"aaa", (String)"cd"))))
    // (new ArrayList<String>(Arrays.asList((String)"ab", (String)"cd")))
    public static ArrayList<String> sortedListSum(ArrayList<String> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that accepts an array array list of strings as a parameter,
    // deletes the strings that have odd lengths from it,
    // and returns the resulted array list with a sorted order,
    // The array list is always an array array list of strings and never an array array list of numbers,
    // and it may contain duplicates.
    // The order of the array list should be ascending by length of each word, and you
    // should return the array list sorted by that rule.
    // If two words have the same length, sort the array list alphabetically.
    // The function should return an array array list of strings in sorted order.
    // You may assume that all words will have the same length.
    // For example:
    // >>> listSort((new ArrayList<String>(Arrays.asList((String)"aa", (String)"a", (String)"aaa"))))
    // (new ArrayList<String>(Arrays.asList((String)"aa")))
    // >>> listSort((new ArrayList<String>(Arrays.asList((String)"ab", (String)"a", (String)"aaa", (String)"cd"))))
    // (new ArrayList<String>(Arrays.asList((String)"ab", (String)"cd")))
    public static ArrayList<String> sortedListSum(ArrayList<String> lst) {
	ArrayList<String> result = new ArrayList<String>();
	for (int i = 0; i < lst.size(); i++) {
	    if (lst.get(i).length() % 2 == 1)
		lst.remove(i);
	    else
		result.add(lst.get(i));
	}
	result.sort((String s1, String s2) -> {
	    if (s1.length() == s2.length())
		return s1.compareTo(s2);
	    else
		return s1.length() - s2