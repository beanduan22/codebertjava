// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given the lengths of the three sides of a triangle. Return the area of
    // the triangle rounded to 2 decimal points if the three sides form a valid triangle. 
    // Otherwise return -1
    // Three sides make a valid triangle when the sum of any two sides is greater 
    // than the third side.
    // Example:
    // >>> triangleArea((3l), (4l), (5l))
    // (6.0f)
    // >>> triangleArea((1l), (2l), (10l))
    // (float)-1l
    public static float triangleArea(long a, long b, long c) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given the lengths of the three sides of a triangle. Return the area of
    // the triangle rounded to 2 decimal points if the three sides form a valid triangle. 
    // Otherwise return -1
    // Three sides make a valid triangle when the sum of any two sides is greater 
    // than the third side.
    // Example:
    // >>> triangleArea((3l), (4l), (5l))
    // (6.0f)
    // >>> triangleArea((1l), (2l), (10l))
    // (float)-1l
    public static float triangleArea(long a, long b, long c) {
	if (a < b + c && b < a + c && c < a + b) {
	    double p = (a + b + c) / 2;
	    return (float)Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	return -1;
    }

    // Given an array of integers, return the sum of all those numbers that are
    // greater than their immediate neighbors.
    // Example:
    // >>> sumOfNeighbors((2l), (2l), (2l), (2l), (