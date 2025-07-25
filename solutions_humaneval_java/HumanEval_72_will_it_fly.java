// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that returns true if the object q will fly, and false otherwise.
    // The object q will fly if it's balanced (it is a palindromic array list) and the sum of its elements is less than or equal the maximum possible weight w.
    // Example:
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l))), (5l))
    // (false)
    // # 1+2 is less than the maximum possible weight, but it's unbalanced.
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)3l))), (1l))
    // (false)
    // # it's balanced, but 3+2+3 is more than the maximum possible weight.
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)3l))), (9l))
    // (true)
    // # 3+2+3 is less than the maximum possible weight, and it's balanced.
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)3l))), (5l))
    // (true)
    // # 3 is less than the maximum possible weight, and it's balanced.
    public static boolean willItFly(ArrayList<Long> q, long w) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that returns true if the object q will fly, and false otherwise.
    // The object q will fly if it's balanced (it is a palindromic array list) and the sum of its elements is less than or equal the maximum possible weight w.
    // Example:
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l))), (5l))
    // (false)
    // # 1+2 is less than the maximum possible weight, but it's unbalanced.
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)3l))), (1l))
    // (false)
    // # it's balanced, but 3+2+3 is more than the maximum possible weight.
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)3l, (long)2l, (long)3l))), (9l))
    // (true)
    // # 3+2+3 is less than the maximum possible weight, and it's balanced.
    // >>> willItFly((new ArrayList<Long>(Arrays.asList((long)3l))), (5l))
    // (true)
    // # 3 is less than the maximum possible weight, and it's balanced.
    public static boolean willItFly(ArrayList<Long> q, long w) {
//        if (q.isEmpty()) return true;
//        if (q.size() == 1) return q.get(0) <= w;
//        long sum = q.stream().mapToLong(Long::longValue).sum();
//        if (sum <= w) {
//            for (int i = 0; i < q.size()/2; i++) {
//                if (!q.get(i).equals(q.get(q.size()-i-1))) return false;
//            }
//            return true;
//        }