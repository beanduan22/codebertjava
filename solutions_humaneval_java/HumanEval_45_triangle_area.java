// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given length of a side and high return area for a triangle.
    // >>> triangleArea((5l), (3l))
    // (7.5f)
    public static float triangleArea(long a, long h) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given length of a side and high return area for a triangle.
    // >>> triangleArea((5l), (3l))
    // (7.5f)
    public static float triangleArea(long a, long h) {
	return (a * h) / 2f;
    }

    // Given a list of names return a list of the names with'sister'
    // inserted to the end of each name.
    // >>> insertSister(['sue', 'kitty', 'jill'])
    // (['suesister', 'kittysister', 'jillsister'])
    public static List<String> insertSister(List<String> names) {
	return names.stream().map(x -> x + "sister").collect(Collectors.toList());
    }

    // In the provided list