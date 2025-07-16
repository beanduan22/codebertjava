// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Complete the function that takes two integers and returns 
    // the product of their unit digits.
    // Assume the input is always valid.
    // Examples:
    // >>> multiply((148l), (412l))
    // (16l)
    // >>> multiply((19l), (28l))
    // (72l)
    // >>> multiply((2020l), (1851l))
    // (0l)
    // >>> multiply((14l), (-15l))
    // (20l)
    public static long multiply(long a, long b) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Complete the function that takes two integers and returns 
    // the product of their unit digits.
    // Assume the input is always valid.
    // Examples:
    // >>> multiply((148l), (412l))
    // (16l)
    // >>> multiply((19l), (28l))
    // (72l)
    // >>> multiply((2020l), (1851l))
    // (0l)
    // >>> multiply((14l), (-15l))
    // (20l)
    public static long multiply(long a, long b) {
	// Write your code here
	if(a<0) a*=-1;
	if(b<0)b*=-1;
	int a1=(int)a;
	int b1=(int)b;
	return (a1%10)*(b1%10);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println(Problem.multiply