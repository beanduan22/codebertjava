// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From an array array list of integers, remove all elements that occur more than once.
    // Keep order of elements left the same as in the input.
    // >>> removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)4l)))
    public static ArrayList<Long> removeDuplicates(ArrayList<Long> numbers) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // From an array array list of integers, remove all elements that occur more than once.
    // Keep order of elements left the same as in the input.
    // >>> removeDuplicates((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)2l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)4l)))
    public static ArrayList<Long> removeDuplicates(ArrayList<Long> numbers) {
	ArrayList<Long> result = new ArrayList<Long>();
	for(int i = 0; i < numbers.size(); i++) {
	    Long current = numbers.get(i);
	    if (result.contains(current)) continue;
	    result.add(current);
	}
	return result;
    }
}

public class Solution {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int numbers_size = 0;
	numbers_size = in.nextInt();
	in.nextLine();
	