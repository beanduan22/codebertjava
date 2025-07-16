// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter an input array list of strings only for ones that start with a given prefix.
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList())), ("a"))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList((String)"abc", (String)"bcd", (String)"cde", (String)"array"))), ("a"))
    // (new ArrayList<String>(Arrays.asList((String)"abc", (String)"array")))
    public static ArrayList<String> filterByPrefix(ArrayList<String> strings, String prefix) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter an input array list of strings only for ones that start with a given prefix.
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList())), ("a"))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList((String)"abc", (String)"bcd", (String)"cde", (String)"array"))), ("a"))
    // (new ArrayList<String>(Arrays.asList((String)"abc", (String)"array")))
    public static ArrayList<String> filterByPrefix(ArrayList<String> strings, String prefix) {
	return (new ArrayList<String>(
	           strings.stream()
		         .filter((string) -> { return string.startsWith(prefix); })
		         .collect(Collectors.toList())));
    }

    public static void main(String[] args) {
	System.out.println(filterByPrefix((new ArrayList<String>(Arrays.asList((String)"abc", (String)"bcd", (String)"cde", (String)"array"))), ("a")));
    }
}
/src/main/java/com/example/app/Problem.java
// Java program for the above approach
