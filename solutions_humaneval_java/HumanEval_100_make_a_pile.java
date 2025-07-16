// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, you have to make a pile of n levels of stones.
    // The first level has n stones.
    // The number of stones in the next level is:
    // - the next odd number if n is odd.
    // - the next even number if n is even.
    // Return the number of stones in each level in an array array list, where element at index
    // i represents the number of stones in the level (i+1).
    // Examples:
    // >>> makeAPile((3l))
    // (new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)7l)))
    public static ArrayList<Long> makeAPile(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, you have to make a pile of n levels of stones.
    // The first level has n stones.
    // The number of stones in the next level is:
    // - the next odd number if n is odd.
    // - the next even number if n is even.
    // Return the number of stones in each level in an array array list, where element at index
    // i represents the number of stones in the level (i+1).
    // Examples:
    // >>> makeAPile((3l))
    // (new ArrayList<Long>(Arrays.asList((long)3l, (long)5l, (long)7l)))
    public static ArrayList<Long> makeAPile(long n) {
	ArrayList<Long> l = new ArrayList<Long>();
	while(n!=1) {
	    l.add(n);
	    if(n%2 == 0)
		n = n+1;
	    else
		n = n-1;
	}
	l.add(1l);
	Collections.reverse(l);
	return l;
    }
}
package com.company;

// You are given a string s consisting of lowercase letters.
// Your task is to find the letters that appear exactly once in the string and return them in lexico