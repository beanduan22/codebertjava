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
	// Write your code here
        String res = "";
        for(long i=0; i<=n; i++) {
            res += i + " ";
        }
        return res.substring(0, res.length()-1);
    }
}

/Java/src/Arrays/SubarraySum.java
package Arrays;

import java.util.Scanner;

public class SubarraySum {
	public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int