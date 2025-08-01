// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return sorted unique common elements for two array lists.
    // >>> common((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)3l, (long)34l, (long)653l, (long)2l, (long)5l))), (new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)5l, (long)9l, (long)653l, (long)121l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)653l)))
    // >>> common((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))
    public static ArrayList<Long> common(ArrayList<Long> l1, ArrayList<Long> l2) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return sorted unique common elements for two array lists.
    // >>> common((new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)3l, (long)34l, (long)653l, (long)2l, (long)5l))), (new ArrayList<Long>(Arrays.asList((long)5l, (long)7l, (long)1l, (long)5l, (long)9l, (long)653l, (long)121l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)653l)))
    // >>> common((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)2l, (long)8l))), (new ArrayList<Long>(Arrays.asList((long)3l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l)))
    public static ArrayList<Long> common(ArrayList<Long> l1, ArrayList<Long> l2) {
	ArrayList<Long> a = merge(l1, l2);
	ArrayList<Long> b = new ArrayList<Long>();
	for (long x : a) {
	    boolean ok = true;
	    for (long y : b) {
		if (x == y) {
		    ok = false;
		    break;
		}
	    }
	    if (ok) {
		b.add(x);
	    }
	}
	return sort(b);
    }
    // Return sorted unique elements of an arraylist.
    public static ArrayList<Long> sort(ArrayList<Long> a