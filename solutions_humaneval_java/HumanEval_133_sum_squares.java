// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list of numbers.
    // You need to return the sum of squared numbers in the given array list,
    // round each element in the array list to the upper int(Ceiling) first.
    // Examples:
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f))))
    // (14l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)4.0f, (float)9.0f))))
    // (98l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)3.0f, (float)5.0f, (float)7.0f))))
    // (84l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.4f, (float)4.2f, (float)0.0f))))
    // (29l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)-2.4f, (float)1.0f, (float)1.0f))))
    // (6l)
    public static long sumSquares(ArrayList<Float> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given an array array list of numbers.
    // You need to return the sum of squared numbers in the given array list,
    // round each element in the array list to the upper int(Ceiling) first.
    // Examples:
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f))))
    // (14l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)4.0f, (float)9.0f))))
    // (98l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)3.0f, (float)5.0f, (float)7.0f))))
    // (84l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)1.4f, (float)4.2f, (float)0.0f))))
    // (29l)
    // >>> lst((new ArrayList<Float>(Arrays.asList((float)-2.4f, (float)1.0f, (float)1.0f))))
    // (6l)
    public static long sumSquares(ArrayList<Float> lst) {
//        lst.stream().map(n -> Math.round(n)).map(n -> n * n).reduce(Long::sum).get();
        lst.stream().map(n -> Math.ceil(n)).mapToInt(n -> (int)n).map(n -> n * n).reduce(Integer::sum).get();
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumSquares(new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float