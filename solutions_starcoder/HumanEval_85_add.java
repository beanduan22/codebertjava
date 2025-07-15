// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a non-empty array list of integers lst. add the even elements that are at odd indices..
    // Examples:
    // >>> add((new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)6l, (long)7l))))
    // (2l)
    public static long add(ArrayList<Long> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a non-empty array list of integers lst. add the even elements that are at odd indices..
    // Examples:
    // >>> add((new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)6l, (long)7l))))
    // (2l)
    public static long add(ArrayList<Long> lst) {
	return lst.stream().filter((x) -> x%2l == 1l).filter((x) -> x%2l!= 0l).mapToLong(Long::longValue).sum();
    }
    // Given a non-empty array list of integers lst. return the number of times the number 21 appears...
    // Examples:
    // >>> count_21((new ArrayList<Long>(Arrays.asList((long)21l, (long)21l, (long)21l, (long)21l))))
    // 4l
    public static long