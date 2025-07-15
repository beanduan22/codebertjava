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
	ArrayList<String> result = new ArrayList<String>();
	for(String str : strings) {
	    if(str.contains(substring)) {
		result.add(str);
	    }
	}
	return result;
    }
    
    // Convert an input string to a list of words
    // >>> convertToList("The quick brown fox jumps over the lazy dog")
    // (new ArrayList<String>(Arrays.asList((String)"The", (String)"quick", (String)"brown", (String)"fox", (String)"jumps", (String)"over", (String)"the", (