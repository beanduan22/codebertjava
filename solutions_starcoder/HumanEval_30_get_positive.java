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
	ArrayList<Long> result = new ArrayList<Long>();
	for(Long x: l) {
	    if(x > 0) {
		result.add(x);
	    }
	}
	return result;
    }
    // Convert the array to dictionary with key as string and value as int.
    // >>> convertToDictionary((new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "e"))))
    // {a=(int)0, b=(int)1, c=(int)2, d=(int)3, e=(int)