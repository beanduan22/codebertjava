// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given the lengths of the three sides of a triangle. Return true if the three
    // sides form a right-angled triangle, false otherwise.
    // A right-angled triangle is a triangle in which one angle is right angle or 
    // 90 degree.
    // Example:
    // >>> rightAngleTriangle((3l), (4l), (5l))
    // (true)
    // >>> rightAngleTriangle((1l), (2l), (3l))
    // (false)
    public static boolean rightAngleTriangle(long a, long b, long c) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given the lengths of the three sides of a triangle. Return true if the three
    // sides form a right-angled triangle, false otherwise.
    // A right-angled triangle is a triangle in which one angle is right angle or 
    // 90 degree.
    // Example:
    // >>> rightAngleTriangle((3l), (4l), (5l))
    // (true)
    // >>> rightAngleTriangle((1l), (2l), (3l))
    // (false)
    public static boolean rightAngleTriangle(long a, long b, long c) {
//        if (a == 0 || b == 0 || c == 0) {
//            return false;
//        }
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
    }

    // Write a function