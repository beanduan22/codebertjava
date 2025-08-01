// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // "Given an array array list representing a branch of a tree that has non-negative integer nodes
    // your task is to pluck one of the nodes and return it.
    // The plucked node should be the node with the smallest even value.
    // If multiple nodes with the same smallest even value are found return the node that has smallest index.
    // The plucked node should be returned in an array array list, [ smalest_value, its index ],
    // If there are no even values or the given array array list is empty, return [].
    // Example 1:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))
    // Explanation: 2 has the smallest even value, and 2 has the smallest index.
    // Example 2:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))
    // Explanation: 2 has the smallest even value, and 2 has the smallest index.
    // Example 3:
    // >>> pluck((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    // Example 4:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)5l, (long)0l, (long)3l, (long)0l, (long)4l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))
    // Explanation: 0 is the smallest value, but  there are two zeros,
    // so we will choose the first zero, which has the smallest index.
    // Constraints:
    // * 1 <= nodes.length <= 10000
    // * 0 <= node.value
    public static ArrayList<Long> pluck(ArrayList<Long> arr) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // "Given an array array list representing a branch of a tree that has non-negative integer nodes
    // your task is to pluck one of the nodes and return it.
    // The plucked node should be the node with the smallest even value.
    // If multiple nodes with the same smallest even value are found return the node that has smallest index.
    // The plucked node should be returned in an array array list, [ smalest_value, its index ],
    // If there are no even values or the given array array list is empty, return [].
    // Example 1:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))
    // Explanation: 2 has the smallest even value, and 2 has the smallest index.
    // Example 2:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l))))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)1l)))
    // Explanation: 2 has the smallest even value, and 2 has the smallest index.
    // Example 3:
    // >>> pluck((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<Long>(Arrays.asList()))
    // Example 4:
    // >>> pluck((new ArrayList<Long>(Arrays.asList((long)5l, (long)0l, (long)3l, (long)0l, (long)4l, (long)2l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)1l)))
    // Explanation: 0 is the smallest value, but  there are two zeros,
    // so we will choose the first zero, which has the smallest index.
    // Constraints:
    // * 1 <= nodes.length <= 10000
    // * 0 <= node.value
    public static ArrayList<Long> pluck(ArrayList<Long> arr) {
//        System.out.println("pluck");
        ArrayList<Long> result = new ArrayList<>();
        if (arr.isEmpty())
            return result;
        long minIndex = 0;
        long minValue = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0 && minValue > arr.get(i)) {
                minValue = arr.get(i);
                minIndex = i;
            }
        }
//        System.out.println(minValue + " "