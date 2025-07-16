// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Find how many times a given substring can be found in the original string. Count overlaping cases.
    // >>> howManyTimes((""), ("a"))
    // (0l)
    // >>> howManyTimes(("aaa"), ("a"))
    // (3l)
    // >>> howManyTimes(("aaaa"), ("aa"))
    // (3l)
    public static long howManyTimes(String string, String substring) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Find how many times a given substring can be found in the original string. Count overlaping cases.
    // >>> howManyTimes((""), ("a"))
    // (0l)
    // >>> howManyTimes(("aaa"), ("a"))
    // (3l)
    // >>> howManyTimes(("aaaa"), ("aa"))
    // (3l)
    public static long howManyTimes(String string, String substring) {
	// Write your code here
        long count = 0;
        for (int i = 0; i < string.length() - substring.length() + 1; i++){
            if (string.substring(i, i + substring.length()).equals(substring)) count++;
        }
        return count;
    }
}

/src/main/java/leetcode/easy/ContainsDuplicateII.java
package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate