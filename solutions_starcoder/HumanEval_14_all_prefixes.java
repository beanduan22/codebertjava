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
	ArrayList<String> allPrefixes = new ArrayList<>();
	for(int i = 0; i < string.length(); i++) {
	    allPrefixes.add(string.substring(0, i+1));
	}
	return allPrefixes;
    }
    // Return array list of all suffixes from shortest to longest of the input string
    // >>> allSuffixes(("abc"))
    // (new ArrayList<String>(Arrays.asList((String)"abc", (String)"bc", (String)"c")))
    public static ArrayList<String> allSuffixes(String string) {
	ArrayList<