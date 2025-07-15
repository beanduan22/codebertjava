// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    // >>> stringSequence((0l))
    // ("0")
    // >>> stringSequence((5l))
    // ("0 1 2 3 4 5")
    public static String stringSequence(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    // >>> stringSequence((0l))
    // ("0")
    // >>> stringSequence((5l))
    // ("0 1 2 3 4 5")
    public static String stringSequence(long n) {
	/* YOUR CODE HERE */
	String s = "";
	for(long i = 0; i < n; i++){
	  s += i + " ";
	}
	s = s.substring(0,s.length() - 1);
	return s;
	//return "0 1 2 3 4 5";
    }

    // Return a string containing space-delimited numbers starting from 0 upto n inclusive in reverse order.
    // >>> stringSequenceReverse((0l))
    // ("0")
    // >>> stringSequenceReverse((5l))