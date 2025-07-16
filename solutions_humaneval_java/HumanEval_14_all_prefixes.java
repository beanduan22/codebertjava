// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of all prefixes from shortest to longest of the input string
    // >>> allPrefixes(("abc"))
    // (new ArrayList<String>(Arrays.asList((String)"a", (String)"ab", (String)"abc")))
    public static ArrayList<String> allPrefixes(String string) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list of all prefixes from shortest to longest of the input string
    // >>> allPrefixes(("abc"))
    // (new ArrayList<String>(Arrays.asList((String)"a", (String)"ab", (String)"abc")))
    public static ArrayList<String> allPrefixes(String string) {
	return null;
    }
    public static void main(String[] args) {
	ArrayList<String> expected = new ArrayList<String>(Arrays.asList((String)"a", (String)"ab", (String)"abc"));
	ArrayList<String> actual = allPrefixes("abc");
	if (!expected.equals(actual)) {
	    System.out.println(String.format("Expected allPrefixes(%s) = %s, but got %s", "abc", expected, actual));
	} else {
	    System.out.println("Passed");
	}
    }
}
