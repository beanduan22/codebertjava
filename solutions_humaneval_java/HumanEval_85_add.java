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
	long sum = 0l;
	for (int i = 1; i < lst.size(); i += 2) {
	    if (lst.get(i) % 2 == 0) {
		sum += lst.get(i);
	    }
	}
	return sum;
    }
}
/solutions/java/src/main/java/com/codewars/katas/TheOfficeIII.java
package com.codewars.katas;

import java.util.*;
import java.lang.reflect.*;
import java.