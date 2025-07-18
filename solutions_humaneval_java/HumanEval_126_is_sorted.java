// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of numbers, return whether or not they are sorted
    // in ascending order. If array list has more than 1 duplicate of the same
    // number, return false. Assume no negative numbers and only integers.
    // Examples
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)5l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l))))
    // (false)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l, (long)7l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l, (long)6l, (long)7l))))
    // (false)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)3l, (long)3l, (long)4l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)2l, (long)3l, (long)4l))))
    // (false)
    public static boolean isSorted(ArrayList<Long> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of numbers, return whether or not they are sorted
    // in ascending order. If array list has more than 1 duplicate of the same
    // number, return false. Assume no negative numbers and only integers.
    // Examples
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)5l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l))))
    // (false)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)6l, (long)7l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)3l, (long)2l, (long)4l, (long)5l, (long)6l, (long)7l))))
    // (false)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)3l, (long)3l, (long)4l))))
    // (true)
    // >>> isSorted((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)2l, (long)2l, (long)3l, (long)4l))))
    // (false)
    public static boolean isSorted(ArrayList<Long> lst) {
	boolean sorted = true;
	for (int i = 0; i < lst.size()-1; i++) {
	    if (lst.get(i).compareTo(lst.get(i+1)) > 0) {
		sorted = false;
		break;
	    }
	}
	return sorted;
    }
}
/data-e in a linked list
structures/singly-linked-list-remove-node.py
# Remove node in a singly linked list
#
# Given a linked list, remove the k-th node