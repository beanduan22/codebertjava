// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
    // >>> flipCase(("Hello"))
    // ("hELLO")
    public static String flipCase(String string) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
    // >>> flipCase(("Hello"))
    // ("hELLO")
    public static String flipCase(String string) {
//        return string.replaceAll("([a-z]+)", word -> word.toUpperCase()).replaceAll("([A-Z]+)", word -> word.toLowerCase());

//        return string.replaceAll("([a-z])", word -> word.toUpperCase()).replaceAll("([A-Z])", word -> word.toLowerCase());
        return string.replaceAll("([a-z])", word -> word.toUpperCase(Locale.ROOT)).replaceAll("([A-Z])", word -> word.toLowerCase(Locale.ROOT));
    }
}package com.codewar;

public class Solution {
    public static