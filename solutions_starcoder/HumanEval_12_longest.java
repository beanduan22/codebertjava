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
	Optional<String> res = Optional.empty();
	if(strings.size() > 0) {
	    int max = 0;
	    for(String s : strings) {
		if(s.length() > max) {
		    res = Optional.of(s);
		    max = s.length();
		}
	    }
	}
	return res;
    }

    // Write a program that prints its command line arguments, one per line.
    // If no arguments are specified, it should print "No command line arguments".
    // >>> printArgs(new String[0])
   