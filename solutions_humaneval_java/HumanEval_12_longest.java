// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Out of array list of strings, return the longest one. Return the first one in case of multiple
    // strings of the same length. Return null in case the input array list is empty.
    // >>> longest((new ArrayList<String>(Arrays.asList())))
    // Optional.empty()
    // >>> longest((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // Optional.of("a")
    // >>> longest((new ArrayList<String>(Arrays.asList((String)"a", (String)"bb", (String)"ccc"))))
    // Optional.of("ccc")
    public static Optional<String> longest(ArrayList<String> strings) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Out of array list of strings, return the longest one. Return the first one in case of multiple
    // strings of the same length. Return null in case the input array list is empty.
    // >>> longest((new ArrayList<String>(Arrays.asList())))
    // Optional.empty()
    // >>> longest((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // Optional.of("a")
    // >>> longest((new ArrayList<String>(Arrays.asList((String)"a", (String)"bb", (String)"ccc"))))
    // Optional.of("ccc")
    public static Optional<String> longest(ArrayList<String> strings) {
	// YOUR CODE HERE
	if (strings.size() == 0) {
	    return Optional.empty();
	}
	String longest = strings.get(0);
	for (String string : strings) {
	    if (string.length() > longest.length()) {
		longest = string;
	    }
	}
	return Optional.of(longest);
    }
    // Write a method that takes an ArrayList of Strings and returns a HashMap<Character, Integer> that
    // maps each unique character to its number of occurrences.
    // >>> charCounts((new ArrayList<String>(Arrays