// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // In this task, you will be given a string that represents a number of apples and oranges 
    // that are distributed in a basket of fruit this basket contains 
    // apples, oranges, and mango fruits. Given the string that represents the total number of 
    // the oranges and apples and an integer that represent the total number of the fruits 
    // in the basket return the number of the mango fruits in the basket.
    // for examble:
    // >>> fruitDistribution(("5 apples and 6 oranges"), (19l))
    // (8l)
    // >>> fruitDistribution(("0 apples and 1 oranges"), (3l))
    // (2l)
    // >>> fruitDistribution(("2 apples and 3 oranges"), (100l))
    // (95l)
    // >>> fruitDistribution(("100 apples and 1 oranges"), (120l))
    // (19l)
    public static long fruitDistribution(String s, long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // In this task, you will be given a string that represents a number of apples and oranges 
    // that are distributed in a basket of fruit this basket contains 
    // apples, oranges, and mango fruits. Given the string that represents the total number of 
    // the oranges and apples and an integer that represent the total number of the fruits 
    // in the basket return the number of the mango fruits in the basket.
    // for examble:
    // >>> fruitDistribution(("5 apples and 6 oranges"), (19l))
    // (8l)
    // >>> fruitDistribution(("0 apples and 1 oranges"), (3l))
    // (2l)
    // >>> fruitDistribution(("2 apples and 3 oranges"), (100l))
    // (95l)
    // >>> fruitDistribution(("100 apples and 1 oranges"), (120l))
    // (19l)
    public static long fruitDistribution(String s, long n) {
	Pattern p = Pattern.compile("\\d+");
	Matcher m = p.matcher(s);
	int i = 0;
	int j = 0;
	while (m.find()) {
	    i = Integer.valueOf(m.group());
	    j++;
	}
	if (j!= 2) {
	    return 0;
	}
	if (i == 0) {
	    return 0;
	}
	if (n <= i) {
	    return n % i;
	}
	if (n % i == 0