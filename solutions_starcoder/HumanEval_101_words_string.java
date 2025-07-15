// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given a string of words separated by commas or spaces. Your task is
    // to split the string into words and return an array array list of the words.
    // For example:
    // >>> wordsString(("Hi, my name is John"))
    // (new ArrayList<String>(Arrays.asList((String)"Hi", (String)"my", (String)"name", (String)"is", (String)"John")))
    // >>> wordsString(("One, two, three, four, five, six"))
    // (new ArrayList<String>(Arrays.asList((String)"One", (String)"two", (String)"three", (String)"four", (String)"five", (String)"six")))
    public static ArrayList<String> wordsString(String s) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given a string of words separated by commas or spaces. Your task is
    // to split the string into words and return an array array list of the words.
    // For example:
    // >>> wordsString(("Hi, my name is John"))
    // (new ArrayList<String>(Arrays.asList((String)"Hi", (String)"my", (String)"name", (String)"is", (String)"John")))
    // >>> wordsString(("One, two, three, four, five, six"))
    // (new ArrayList<String>(Arrays.asList((String)"One", (String)"two", (String)"three", (String)"four", (String)"five", (String)"six")))
    public static ArrayList<String> wordsString(String s) {
//        // Complete this function
        ArrayList<String> arrList = new ArrayList<>();
        String[] s1 = s.split("[, ]");
        for (int i = 0; i < s1.length; i++) {
            arrList.add(s1[i]);
        }
        return arrList;
    }
}
    }
    }
}
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    //