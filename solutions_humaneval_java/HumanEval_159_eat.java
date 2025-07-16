// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You're a hungry rabbit, and you already have eaten a certain number of carrots,
    // but now you need to eat more carrots to complete the day's meals.
    // you should return an array array list of [ total number of eaten carrots after your meals,
    // the number of carrots left after your meals ]
    // if there are not enough remaining carrots, you will eat all remaining carrots, but will still be hungry.
    // Example:
    // >>> eat((5l), (6l), (10l))
    // (new ArrayList<Long>(Arrays.asList((long)11l, (long)4l)))
    // >>> eat((4l), (8l), (9l))
    // (new ArrayList<Long>(Arrays.asList((long)12l, (long)1l)))
    // >>> eat((1l), (10l), (10l))
    // (new ArrayList<Long>(Arrays.asList((long)11l, (long)0l)))
    // >>> eat((2l), (11l), (5l))
    // (new ArrayList<Long>(Arrays.asList((long)7l, (long)0l)))
    // Variables:
    // @number : integer
    // the number of carrots that you have eaten.
    // @need : integer
    // the number of carrots that you need to eat.
    // @remaining : integer
    // the number of remaining carrots thet exist in stock
    // Constrain:
    // * 0 <= number <= 1000
    // * 0 <= need <= 1000
    // * 0 <= remaining <= 1000
    // Have fun :)
    public static ArrayList<Long> eat(long number, long need, long remaining) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You're a hungry rabbit, and you already have eaten a certain number of carrots,
    // but now you need to eat more carrots to complete the day's meals.
    // you should return an array array list of [ total number of eaten carrots after your meals,
    // the number of carrots left after your meals ]
    // if there are not enough remaining carrots, you will eat all remaining carrots, but will still be hungry.
    // Example:
    // >>> eat((5l), (6l), (10l))
    // (new ArrayList<Long>(Arrays.asList((long)11l, (long)4l)))
    // >>> eat((4l), (8l), (9l))
    // (new ArrayList<Long>(Arrays.asList((long)12l, (long)1l)))
    // >>> eat((1l), (10l), (10l))
    // (new ArrayList<Long>(Arrays.asList((long)11l, (long)0l)))
    // >>> eat((2l), (11l), (5l))
    // (new ArrayList<Long>(Arrays.asList((long)7l, (long)0l)))
    // Variables:
    // @number : integer
    // the number of carrots that you have eaten.
    // @need : integer
    // the number of carrots that you need to eat.
    // @remaining : integer
    // the number of remaining carrots thet exist in stock
    // Constrain:
    // * 0 <= number <= 1000
    // * 0 <= need <= 1000
    // * 0 <= remaining <= 1000
    // Have fun :)
    public static ArrayList<Long> eat(long number, long need, long remaining) {
//        System.out.println("number: " + number + ", need: " + need + ", remaining: " + remaining);
        if (need <= remaining) {
            return new ArrayList<Long>(Arrays.asList((long) (number + need), (long) (remaining - need)));
        }
        return new ArrayList<Long>(Arrays.asList((long) (number + remaining), (long) 0));
    }

    public static void main(String[] args) {
        // This is for testing your code.
        // Anything written here will not be included in your submission,
        // and will