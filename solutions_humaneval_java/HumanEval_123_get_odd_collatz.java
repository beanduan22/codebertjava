// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return a sorted array list that has the odd numbers in collatz sequence.
    // The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined
    // as follows: start with any positive integer n. Then each term is obtained from the 
    // previous term as follows: if the previous term is even, the next term is one half of 
    // the previous term. If the previous term is odd, the next term is 3 times the previous
    // term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.
    // Note: 
    // 1. Collatz(1) is [1].
    // 2. returned array list sorted in increasing order.
    // For example:
    // get_odd_collatz(5) returns [1, 5] # The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.
    // >>> getOddCollatz((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l)))
    public static ArrayList<Long> getOddCollatz(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return a sorted array list that has the odd numbers in collatz sequence.
    // The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined
    // as follows: start with any positive integer n. Then each term is obtained from the 
    // previous term as follows: if the previous term is even, the next term is one half of 
    // the previous term. If the previous term is odd, the next term is 3 times the previous
    // term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.
    // Note: 
    // 1. Collatz(1) is [1].
    // 2. returned array list sorted in increasing order.
    // For example:
    // get_odd_collatz(5) returns [1, 5] # The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.
    // >>> getOddCollatz((5l))
    // (new ArrayList<Long>(Arrays.asList((long)1l, (long)5l)))
    public static ArrayList<Long> getOddCollatz(long n) {
	//your code here
        ArrayList<Long> res = new ArrayList<Long>();
        res.add(n);
        int i = 0;
        while (res.get(i)!= 1) {
            if (res.get(i) % 2 == 0) {
                res.add(res.get(i) / 2);
            } else {
                res.add(res.get(i) * 3 + 1);
            }
            i++;
        }
        return res;
    }
    // Given a List of integers nums, return the number of its subarrays