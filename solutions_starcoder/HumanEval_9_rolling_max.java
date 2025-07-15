// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From a given array list of integers, generate an array array list of rolling maximum element found until given moment
    // in the sequence.
    // >>> rollingMax((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)3l, (long)4l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)3l, (long)3l, (long)4l, (long)4l)))
    public static ArrayList<Long> rollingMax(ArrayList<Long> numbers) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From a given array list of integers, generate an array array list of rolling maximum element found until given moment
    // in the sequence.
    // >>> rollingMax((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)3l, (long)4l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)3l, (long)3l, (long)4l, (long)4l)))
    public static ArrayList<Long> rollingMax(ArrayList<Long> numbers) {
	ArrayList<Long> answer = new ArrayList<>();
	for (Long number : numbers)
	    answer.add(number);
	Long max = answer.get(0);
	for (int i = 1; i < answer.size(); i++) {
	    if (answer.get(i) > max)
		max = answer.get(i);
	    answer.set(i, max);
	}
	return answer;
    }
    // Reverse a string
    // >>> reverse("Hello")
    // olleH
    public static String reverse(String s) {
	char[]