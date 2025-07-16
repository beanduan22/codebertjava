// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return only positive numbers in the array list.
    // >>> getPositive((new ArrayList<Long>(Arrays.asList((long)-1l, (long)2l, (long)-4l, (long)5l, (long)6l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)6l)))
    // >>> getPositive((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)123l, (long)1l, (long)-10l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)3l, (long)9l, (long)123l, (long)1l)))
    public static ArrayList<Long> getPositive(ArrayList<Long> l) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return only positive numbers in the array list.
    // >>> getPositive((new ArrayList<Long>(Arrays.asList((long)-1l, (long)2l, (long)-4l, (long)5l, (long)6l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)5l, (long)6l)))
    // >>> getPositive((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)-5l, (long)2l, (long)-3l, (long)3l, (long)9l, (long)0l, (long)123l, (long)1l, (long)-10l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)3l, (long)9l, (long)123l, (long)1l)))
    public static ArrayList<Long> getPositive(ArrayList<Long> l) {
	ArrayList<Long> tmp = new ArrayList<Long>();
	for (Long i : l) {
	    if (i > 0) {
		tmp.add(i);
	    }
	}
	return tmp;
    }
    // Return the minimum value in the array list.
    // >>> getMin((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l, (long)7l, (long)8l, (long)9