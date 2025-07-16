// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string representing a space separated lowercase letters, return a hash map
    // of the letter with the most repetition and containing the corresponding count.
    // If several letters have the same occurrence, return all of them.
    // Example:
    // >>> histogram(("a b c"))
    // (new HashMap<String,Long>(Map.of("a", 1l, "b", 1l, "c", 1l)))
    // >>> histogram(("a b b a"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("a b c a b"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("b b b b a"))
    // (new HashMap<String,Long>(Map.of("b", 4l)))
    // >>> histogram((""))
    // (new HashMap<String,Long>())
    public static HashMap<String,Long> histogram(String test) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string representing a space separated lowercase letters, return a hash map
    // of the letter with the most repetition and containing the corresponding count.
    // If several letters have the same occurrence, return all of them.
    // Example:
    // >>> histogram(("a b c"))
    // (new HashMap<String,Long>(Map.of("a", 1l, "b", 1l, "c", 1l)))
    // >>> histogram(("a b b a"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("a b c a b"))
    // (new HashMap<String,Long>(Map.of("a", 2l, "b", 2l)))
    // >>> histogram(("b b b b a"))
    // (new HashMap<String,Long>(Map.of("b", 4l)))
    // >>> histogram((""))
    // (new HashMap<String,Long>())
    public static HashMap<String,Long> histogram(String test) {
	HashMap<String, Long> x = new HashMap<String, Long>();
	String[] data = test.split(" ");
	long max = 0;
	for(int i=0; i<data.length; i++){
	    if(x.containsKey(data[i])){
		x.put(data[i], x.get(data[i]) + 1);
		if(x.get(data[i]) > max)
		    max = x.get(data[i]);
	    }
	    else{
		x.put(data[i], (