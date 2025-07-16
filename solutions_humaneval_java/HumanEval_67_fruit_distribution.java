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
//         long result = 0;
//         String[] numbers = s.split(" ");
//         long apples = Long.parseLong(numbers[0]);
//         long oranges = Long.parseLong(numbers[3]);
//         long mango = n - (apples + oranges);
//         return mango;
        return n -  StringStream.of(s).mapToLong(val -> Long.parseLong(val)).sum();
    }
}

class StringStream {
    private String s;

    private StringStream(String s) {
        this