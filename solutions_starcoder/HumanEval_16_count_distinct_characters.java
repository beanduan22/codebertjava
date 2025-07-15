// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string, find out how many distinct characters (regardless of case) does it consist of
    // >>> countDistinctCharacters(("xyzXYZ"))
    // (3l)
    // >>> countDistinctCharacters(("Jerry"))
    // (4l)
    public static long countDistinctCharacters(String string) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string, find out how many distinct characters (regardless of case) does it consist of
    // >>> countDistinctCharacters(("xyzXYZ"))
    // (3l)
    // >>> countDistinctCharacters(("Jerry"))
    // (4l)
    public static long countDistinctCharacters(String string) {
	if (string == null) {
	    return 0;
	}
	Set<Character> set = new HashSet<>();
	for (int i = 0; i < string.length(); i++) {
	    set.add(string.toLowerCase().charAt(i));
	}
	return set.size();
    }
    // Find the first non-repeating character in a string
    // >>> firstNonrepeating("aaaabbbbcccc")
    // (c)
    // >>> firstNonrepeating("ab")
    // (a)
    // >>> firstNonrepeating("a")
   