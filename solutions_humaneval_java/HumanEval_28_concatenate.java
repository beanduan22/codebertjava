// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Concatenate array list of strings into a single string
    // >>> concatenate((new ArrayList<String>(Arrays.asList())))
    // ("")
    // >>> concatenate((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // ("abc")
    public static String concatenate(ArrayList<String> strings) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Concatenate array list of strings into a single string
    // >>> concatenate((new ArrayList<String>(Arrays.asList())))
    // ("")
    // >>> concatenate((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // ("abc")
    public static String concatenate(ArrayList<String> strings) {
	//return strings.stream().collect(Collectors.joining());	// one-liner

	String output = "";
	for (String s: strings) output += s;
	return output;
    }

    // Sort array list of strings into ascending order case-insensitively
    // >>> sort_strings((new ArrayList<String>(Arrays.asList())))
    // ["a", "b", "c"]
    // >>> sort_strings((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // ["a", "b", "c