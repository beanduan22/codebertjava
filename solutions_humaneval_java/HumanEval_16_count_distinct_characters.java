// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string, find out how many distinct characters (regardless of case) does it consist of
    // >>> countDistinctCharacters(("xyzXYZ"))
    // (3l)
    // >>> countDistinctCharacters(("Jerry"))
    // (4l)
    public static long countDistinctCharacters(String string) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string, find out how many distinct characters (regardless of case) does it consist of
    // >>> countDistinctCharacters(("xyzXYZ"))
    // (3l)
    // >>> countDistinctCharacters(("Jerry"))
    // (4l)
    public static long countDistinctCharacters(String string) {
	return string.toLowerCase().chars().distinct().count();
    }

    // Given a string, find out how many distinct characters (regardless of case) does it consist of
    // >>> printDistinctCharacters(("xyzXYZ"))
    // (3, x, y, z)
    // >>> printDistinctCharacters(("Jerry"))
    // (4, j, e, r, y)
    public static void printDistinctCharacters(String string) {
	System.out.println(string.toLowerCase().chars().distinct().count());
	System.out.println(string.toLowerCase().chars().distinct().map