// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Your task is to write a function that returns true if a number x is a simple
    // power of n and false in other cases.
    // x is a simple power of n if n**int=x
    // For example:
    // >>> isSimplePower((1l), (4l))
    // (true)
    // >>> isSimplePower((2l), (2l))
    // (true)
    // >>> isSimplePower((8l), (2l))
    // (true)
    // >>> isSimplePower((3l), (2l))
    // (false)
    // >>> isSimplePower((3l), (1l))
    // (false)
    // >>> isSimplePower((5l), (3l))
    // (false)
    public static boolean isSimplePower(long x, long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Your task is to write a function that returns true if a number x is a simple
    // power of n and false in other cases.
    // x is a simple power of n if n**int=x
    // For example:
    // >>> isSimplePower((1l), (4l))
    // (true)
    // >>> isSimplePower((2l), (2l))
    // (true)
    // >>> isSimplePower((8l), (2l))
    // (true)
    // >>> isSimplePower((3l), (2l))
    // (false)
    // >>> isSimplePower((3l), (1l))
    // (false)
    // >>> isSimplePower((5l), (3l))
    // (false)
    public static boolean isSimplePower(long x, long n) {
//        double log = Math.log(x);
//        double log1 = Math.log(n);
//        double num = log/log1;
//        if(num % 1 == 0)
//            return true;
//        else
//            return false;

        // Solution 2
        if (x == n) return true;
        while ((x % n) == 0) x /= n;
        return x == 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long x