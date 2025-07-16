// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive integer n, return the count of the numbers of n-digit
    // positive integers that start or end with 1.
    public static long startsOneEnds(long n) {
	long[] dp = new long[60];
	dp[1] = 1;
	for (int i = 2; i < 60; i++) {
	    dp[i] += dp[i-1] * 9;
	    dp[i] += dp[i-2] * 9;
	}
	long ans = 0;
	for (int i = 0; i < 60; i++) {
	    if ((1l << i) <= n) ans += dp[i];
	}
	return ans;
   