// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter given array list of any javathon values only for integers
    // >>> filterIntegers((new ArrayList<Object>(Arrays.asList((String)"a", (String)3.14f, (String)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l)))
    // >>> filterIntegers((new ArrayList<Object>(Arrays.asList(1l, 2l, 3l, "abc", new HashMap<Long,Long>(Map.of()), new ArrayList<Long>(Arrays.asList())))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
    public static ArrayList<Long> filterIntegers(ArrayList<Object> values) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter given array list of any javathon values only for integers
    // >>> filterIntegers((new ArrayList<Object>(Arrays.asList((String)"a", (String)3.14f, (String)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l)))
    // >>> filterIntegers((new ArrayList<Object>(Arrays.asList(1l, 2l, 3l, "abc", new HashMap<Long,Long>(Map.of()), new ArrayList<Long>(Arrays.asList())))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l)))
    public static ArrayList<Long> filterIntegers(ArrayList<Object> values) {
	ArrayList<Long> result = new ArrayList<Long>();
	for (Object value : values) {
	    if (value instanceof Long) {
		result.add((Long)value);
	    }
	}
	return result;
    }
}
// https://challenges.javathon.org/61
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Find the first index of a given value in a given array
    //