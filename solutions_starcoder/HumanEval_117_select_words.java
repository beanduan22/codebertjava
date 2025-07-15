// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string s and a natural number n, you have been tasked to implement 
    // a function that returns an array array list of all words from string s that contain exactly 
    // n consonants, in order these words appear in the string s.
    // If the string s is empty then the function should return an empty array list.
    // Note: you may assume the input string contains only letters and spaces.
    // Examples:
    // >>> selectWords(("Mary had a little lamb"), (4l))
    // (new ArrayList<String>(Arrays.asList((String)"little")))
    // >>> selectWords(("Mary had a little lamb"), (3l))
    // (new ArrayList<String>(Arrays.asList((String)"Mary", (String)"lamb")))
    // >>> selectWords(("simple white space"), (2l))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> selectWords(("Hello world"), (4l))
    // (new ArrayList<String>(Arrays.asList((String)"world")))
    // >>> selectWords(("Uncle sam"), (3l))
    // (new ArrayList<String>(Arrays.asList((String)"Uncle")))
    public static ArrayList<String> selectWords(String s, long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string s and a natural number n, you have been tasked to implement 
    // a function that returns an array array list of all words from string s that contain exactly 
    // n consonants, in order these words appear in the string s.
    // If the string s is empty then the function should return an empty array list.
    // Note: you may assume the input string contains only letters and spaces.
    // Examples:
    // >>> selectWords(("Mary had a little lamb"), (4l))
    // (new ArrayList<String>(Arrays.asList((String)"little")))
    // >>> selectWords(("Mary had a little lamb"), (3l))
    // (new ArrayList<String>(Arrays.asList((String)"Mary", (String)"lamb")))
    // >>> selectWords(("simple white space"), (2l))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> selectWords(("Hello world"), (4l))
    // (new ArrayList<String>(Arrays.asList((String)"world")))
    // >>> selectWords(("Uncle sam"), (3l))
    // (new ArrayList<String>(Arrays.asList((String)"Uncle")))
    public static ArrayList<String> selectWords(String s, long n) {
	String[] words = s.split("\\s+");
	ArrayList<String> result = new ArrayList<String>();
	for (String w : words) {
	    if (w.length() == n) {
		result.add(w);
	    }
	}
	return result;
    }
}
class Tester {
    public static void main(String[] args) {
	Test.assert_equal(Problem.selectWords("Mary had a little lamb", 4l), 
			  new ArrayList<String>(Arrays.asList("little")));
	Test.assert_equal