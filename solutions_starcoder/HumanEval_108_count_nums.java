// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function count_nums which takes an array array list of integers and returns
    // the number of elements which has a sum of digits > 0.
    // If a number is negative, then its first signed digit will be negative:
    // e.g. -123 has signed digits -1, 2, and 3.
    // >>> countNums((new ArrayList<Long>(Arrays.asList())))
    // (0l)
    // >>> countNums((new ArrayList<Long>(Arrays.asList((long)-1l, (long)11l, (long)-11l))))
    // (1l)
    // >>> countNums((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)2l))))
    // (3l)
    public static long countNums(ArrayList<Long> arr) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function count_nums which takes an array array list of integers and returns
    // the number of elements which has a sum of digits > 0.
    // If a number is negative, then its first signed digit will be negative:
    // e.g. -123 has signed digits -1, 2, and 3.
    // >>> countNums((new ArrayList<Long>(Arrays.asList())))
    // (0l)
    // >>> countNums((new ArrayList<Long>(Arrays.asList((long)-1l, (long)11l, (long)-11l))))
    // (1l)
    // >>> countNums((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)2l))))
    // (3l)
    public static long countNums(ArrayList<Long> arr) {
//        throw new UnsupportedOperationException("Delete this line and write your code here.");
        long count = 0;
        for(Long l : arr){
        int sum = 0;
        while(l!= 0){
            int num = (int) (l % 10);
            if(num > 0) {
                sum += num;
            }
            l /= 10;
        }
        if(sum > 0)
        count++;
        }
        return count;
    }

    // Write a function count_pairs which takes an array list of integers and returns
    // the number of pairs of elements