// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Concatenate array list of strings into a single string
    // >>> concatenate((new ArrayList<String>(Arrays.asList())))
    // ("")
    // >>> concatenate((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // ("abc")
    public static String concatenate(ArrayList<String> strings) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Concatenate array list of strings into a single string
    // >>> concatenate((new ArrayList<String>(Arrays.asList())))
    // ("")
    // >>> concatenate((new ArrayList<String>(Arrays.asList((String)"a", (String)"b", (String)"c"))))
    // ("abc")
    public static String concatenate(ArrayList<String> strings) {
	return String.join("", strings);
    }

    // Return the sum of all integers in the array
    // >>> sum(new int[] {1, 2, 3})
    // (6)
    // >>> sum(new int[] {})
    // (0)
    public static int sum(int[] numbers) {
	return numbers.length == 0? 0 : numbers[0] + sum(Arrays.copyOfRange(numbers, 1, numbers.length));
    }

    // Return the number of times that the string "code" appears anywhere in the given string,
    // except we