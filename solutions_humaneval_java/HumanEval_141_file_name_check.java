// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function which takes a string representing a file's name, and returns
    // 'Yes' if the the file's name is valid, and returns 'No' otherwise.
    // A file's name is considered to be valid if and only if all the following conditions 
    // are met:
    // - There should not be more than three digits ('0'-'9') in the file's name.
    // - The file's name contains exactly one dot '.'
    // - The substring before the dot should not be empty, and it starts with a letter from 
    // the latin alphapet ('a'-'z' and 'A'-'Z').
    // - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
    // Examples:
    // >>> fileNameCheck(("example.txt"))
    // ("Yes")
    // >>> fileNameCheck(("1example.dll"))
    // ("No")
    public static String fileNameCheck(String file_name) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function which takes a string representing a file's name, and returns
    // 'Yes' if the the file's name is valid, and returns 'No' otherwise.
    // A file's name is considered to be valid if and only if all the following conditions 
    // are met:
    // - There should not be more than three digits ('0'-'9') in the file's name.
    // - The file's name contains exactly one dot '.'
    // - The substring before the dot should not be empty, and it starts with a letter from 
    // the latin alphapet ('a'-'z' and 'A'-'Z').
    // - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
    // Examples:
    // >>> fileNameCheck(("example.txt"))
    // ("Yes")
    // >>> fileNameCheck(("1example.dll"))
    // ("No")
    public static String fileNameCheck(String file_name) {
	// your code here
	return null;
    }

    public static void main(String[] args) {
        // test your code here
    }
}
/src/problem0392.py
# Problem 392
# =======================
# You are given a list of integers numbers and a positive integer k.
# Return the kth largest element in the list.
# Example:
# >>> find_kth_largest([1, 12, 5, 6, 10], 3)
# 6
# >>> find_kth