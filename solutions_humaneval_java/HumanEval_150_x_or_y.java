// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // A simple program which should return the value of x if n is 
    // a prime number and should return the value of y otherwise.
    // Examples:
    // >>> xOrY((7l), (34l), (12l))
    // (34l)
    // >>> xOrY((15l), (8l), (5l))
    // (5l)
    public static long xOrY(long n, long x, long y) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // A simple program which should return the value of x if n is 
    // a prime number and should return the value of y otherwise.
    // Examples:
    // >>> xOrY((7l), (34l), (12l))
    // (34l)
    // >>> xOrY((15l), (8l), (5l))
    // (5l)
    public static long xOrY(long n, long x, long y) {
//        if (isPrime(n)) {
//            return x;
//        }
//        return y;
        return n%2==0? y:x;
    }
    
    public static boolean isPrime(long n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n%2 == 0) {
            return false;
        }
        for (long i = 3; i < Math.sqrt(n); i+=2) {
            if (n%i == 