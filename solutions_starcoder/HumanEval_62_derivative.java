// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // xs represent coefficients of a polynomial.
    // xs[0] + xs[1] * x + xs[2] * x^2 + ....
    // Return derivative of this polynomial in the same form.
    // >>> derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)12l, (long)20l)))
    // >>> derivative((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)6l)))
    public static ArrayList<Long> derivative(ArrayList<Long> xs) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // xs represent coefficients of a polynomial.
    // xs[0] + xs[1] * x + xs[2] * x^2 + ....
    // Return derivative of this polynomial in the same form.
    // >>> derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l))))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)12l, (long)20l)))
    // >>> derivative((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)6l)))
    public static ArrayList<Long> derivative(ArrayList<Long> xs) {
	return null;
    }
    public static void main(String[] args) {
	System.out.println(derivative((new ArrayList<Long>(Arrays.asList((long)3l, (long)1l, (long)2l, (long)4l, (long)5l)))) == (new ArrayList<Long>(Arrays.asList((long)1l, (long)4l, (long)12l, (long)20l))));
	System.out.println(derivative((new ArrayList<Long>(Arrays.asList((long)1l, (