// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that returns a pair (a, b), where 'a' is
    // the largest of negative integers, and 'b' is the smallest
    // of positive integers in an array array list.
    // If there is no negative or positive integers, return them as null.
    // Examples:
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(1l))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList())))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)0l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    public static Pair<Optional<Long>, Optional<Long>> largestSmallestIntegers(ArrayList<Long> lst) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that returns a pair (a, b), where 'a' is
    // the largest of negative integers, and 'b' is the smallest
    // of positive integers in an array array list.
    // If there is no negative or positive integers, return them as null.
    // Examples:
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)2l, (long)4l, (long)1l, (long)3l, (long)5l, (long)7l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(1l))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList())))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    // >>> largestSmallestIntegers((new ArrayList<Long>(Arrays.asList((long)0l))))
    // Pair.with(Optional.of(Optional.empty()), Optional.of(Optional.empty()))
    public static Pair<Optional<Long>, Optional<Long>> largestSmallestIntegers(ArrayList<Long> lst) {
																																																																																																																																