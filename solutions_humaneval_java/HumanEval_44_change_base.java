// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Change numerical base of input number x to base.
    // return string representation after the conversion.
    // base numbers are less than 10.
    // >>> changeBase((8l), (3l))
    // ("22")
    // >>> changeBase((8l), (2l))
    // ("1000")
    // >>> changeBase((7l), (2l))
    // ("111")
    public static String changeBase(long x, long base) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Change numerical base of input number x to base.
    // return string representation after the conversion.
    // base numbers are less than 10.
    // >>> changeBase((8l), (3l))
    // ("22")
    // >>> changeBase((8l), (2l))
    // ("1000")
    // >>> changeBase((7l), (2l))
    // ("111")
    public static String changeBase(long x, long base) {
	StringBuilder result = new StringBuilder();
	while (x > 0) {
	    result.append(x % base);
	    x /= base;
	}
	return result.reverse().toString();
    }
}
/week-02/02-recursion/2-recursion-examples/src/main/java/recursion/problem/Problem.java
package recursion.problem;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Problem {
    // Write tail recursive version of the factor