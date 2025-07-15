// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // In this problem, you will implement a function that takes two array lists of numbers,
    // and determines whether it is possible to perform an exchange of elements
    // between them to make lst1 an array array list of only even numbers.
    // There is no limit on the number of exchanged elements between lst1 and lst2.
    // If it is possible to exchange elements between the lst1 and lst2 to make
    // all the elements of lst1 to be even, return "YES".
    // Otherwise, return "NO".
    // For example:
    // >>> exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))))
    // ("YES")
    // >>> exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)3l, (long)4l))))
    // ("NO")
    // It is assumed that the input array lists will be non-empty.
    public static String exchange(ArrayList<Long> lst1, ArrayList<Long> lst2) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // In this problem, you will implement a function that takes two array lists of numbers,
    // and determines whether it is possible to perform an exchange of elements
    // between them to make lst1 an array array list of only even numbers.
    // There is no limit on the number of exchanged elements between lst1 and lst2.
    // If it is possible to exchange elements between the lst1 and lst2 to make
    // all the elements of lst1 to be even, return "YES".
    // Otherwise, return "NO".
    // For example:
    // >>> exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))))
    // ("YES")
    // >>> exchange((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l, (long)3l, (long)4l))))
    // ("NO")
    // It is assumed that the input array lists will be non-empty.
    public static String exchange(ArrayList<Long> lst1, ArrayList<Long> lst2) {
//        String input = lst1.toString();
//        String input2 = lst2.toString();
//        String[] arr = input.split("\\[");
//        String[] arr2 = input2.split("\\[");
//        int idx1 = Integer.parseInt(arr[1]);
//        int idx2 = Integer.parseInt(arr2[1]);
//        String idx1Str = String.valueOf(idx1);
//        String idx2Str = String.valueOf(idx2);
//        String[] arr3 = arr[0].split("\\,");
