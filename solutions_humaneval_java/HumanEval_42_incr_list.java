// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list with elements incremented by 1.
    // >>> incrList((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l)))
    // >>> incrList((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)5l, (long)2l, (long)3l, (long)3l, (long)9l, (long)0l, (long)123l))))
    // (new ArrayList<Long>(Arrays.asList((long)6l, (long)4l, (long)6l, (long)3l, (long)4l, (long)4l, (long)10l, (long)1l, (long)124l)))
    public static ArrayList<Long> incrList(ArrayList<Long> l) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return array list with elements incremented by 1.
    // >>> incrList((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)4l)))
    // >>> incrList((new ArrayList<Long>(Arrays.asList((long)5l, (long)3l, (long)5l, (long)2l, (long)3l, (long)3l, (long)9l, (long)0l, (long)123l))))
    // (new ArrayList<Long>(Arrays.asList((long)6l, (long)4l, (long)6l, (long)3l, (long)4l, (long)4l, (long)10l, (long)1l, (long)124l)))
    public static ArrayList<Long> incrList(ArrayList<Long> l) {
	ArrayList<Long> incrList = new ArrayList<>();
	for (int i = 0; i < l.size(); i++) {
	    incrList.add(l.get(i) + 1l);
	}
	return incrList;
    }

    public static void main(String[] args) {
	// Write your test cases here.
	ArrayList<Long> l = new ArrayList<>(Arrays.asList(1l, 2l, 3l));
	System.out.println(incrList(l));
    }
}
/2018