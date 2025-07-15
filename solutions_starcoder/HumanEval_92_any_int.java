// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes 3 numbers.
    // Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    // Returns false in any other cases.
    // Examples
    // >>> anyInt((float)5l, (float)2l, (float)7l)
    // (true)
    // >>> anyInt((float)3l, (float)2l, (float)2l)
    // (false)
    // >>> anyInt((float)3l, (float)-2l, (float)1l)
    // (true)
    // >>> anyInt((3.6f), (-2.2f), (float)2l)
    // (false)
    public static boolean anyInt(float x, float y, float z) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function that takes 3 numbers.
    // Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
    // Returns false in any other cases.
    // Examples
    // >>> anyInt((float)5l, (float)2l, (float)7l)
    // (true)
    // >>> anyInt((float)3l, (float)2l, (float)2l)
    // (false)
    // >>> anyInt((float)3l, (float)-2l, (float)1l)
    // (true)
    // >>> anyInt((3.6f), (-2.2f), (float)2l)
    // (false)
    public static boolean anyInt(float x, float y, float z) {
<<<<<<< HEAD
        float sum = x + y + z;
        if (x == sum) return true;
        else if (y == sum) return true;
        else if (z == sum) return true;
        else return false;
=======
        return (x == (y + z) || y == (x + z) || z == (x + y));
>>>>>>> c455d7e32f1ac431558732036876c68fd170e0b6
    }
    // Create a function that takes