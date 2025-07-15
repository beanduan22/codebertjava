// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return length of given string
    // >>> stringLength((""))
    // (0l)
    // >>> stringLength(("abc"))
    // (3l)
    public static long strlen(String string) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return length of given string
    // >>> stringLength((""))
    // (0l)
    // >>> stringLength(("abc"))
    // (3l)
    public static long strlen(String string) {
	return string.length();
    }
    // Return true if given string contains vowels, false otherwise
    // >>> stringContainsVowels((""))
    // (false)
    // >>> stringContainsVowels(("abc"))
    // (false)
    // >>> stringContainsVowels(("a"))
    // (true)
    // >>> stringContainsVowels(("abcde"))
    // (true)
    public static boolean stringContainsVowels(String string) {
	return Stream.of(string).anyMatch(c -> "aeiouAEIOU".contains(c));
    }
   