// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given array list of integers, return array list in strange order.
    // Strange sorting, is when you start with the minimum value,
    // then maximum of the remaining integers, then minimum and so on.
    // Examples:
    // >>> strangeSortList((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)3l)))
    // >>> strangeSortList((new ArrayList<Long>(Arrays.asList((long)5l, (long)5l, (long)5l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)5l, (long)5l, (long)5l)))
    // >>> strangeSortList((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    public static ArrayList<Long> strangeSortList(ArrayList<Long> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given array list of integers, return array list in strange order.
    // Strange sorting, is when you start with the minimum value,
    // then maximum of the remaining integers, then minimum and so on.
    // Examples:
    // >>> strangeSortList((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)2l, (long)3l)))
    // >>> strangeSortList((new ArrayList<Long>(Arrays.asList((long)5l, (long)5l, (long)5l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)5l, (long)5l, (long)5l, (long)5l)))
    // >>> strangeSortList((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    public static ArrayList<Long> strangeSortList(ArrayList<Long> lst) {
	ArrayList<Long> newList = new ArrayList<>();
	if(lst.isEmpty()) {
	    return newList;
	}
	long min = lst.get(0);
	long max = lst.get(lst.size() - 1);
	while(lst.size() > 0) {
	    newList.add(min);
	    newList.add(max);
	    lst.remove(new Long(min));
	    lst.remove(new Long(max));
	    if(lst.size() > 0) {
		max = lst.get(lst.size