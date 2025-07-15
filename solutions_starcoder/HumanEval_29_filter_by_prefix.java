// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter an input array list of strings only for ones that start with a given prefix.
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList())), ("a"))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList((String)"abc", (String)"bcd", (String)"cde", (String)"array"))), ("a"))
    // (new ArrayList<String>(Arrays.asList((String)"abc", (String)"array")))
    public static ArrayList<String> filterByPrefix(ArrayList<String> strings, String prefix) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Filter an input array list of strings only for ones that start with a given prefix.
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList())), ("a"))
    // (new ArrayList<String>(Arrays.asList()))
    // >>> filterByPrefix((new ArrayList<String>(Arrays.asList((String)"abc", (String)"bcd", (String)"cde", (String)"array"))), ("a"))
    // (new ArrayList<String>(Arrays.asList((String)"abc", (String)"array")))
    public static ArrayList<String> filterByPrefix(ArrayList<String> strings, String prefix) {
	return strings.stream()
		   .filter(x -> x.startsWith(prefix))
		   .collect(Collectors.toCollection(ArrayList::new));
    }
    public static void main(String[] args) { System.out.println(filterByPrefix(new ArrayList<String>(Arrays.asList("abc", "bcd", "cde", "array")), "a")); }
}
/03-control-structures/12-while-loops/02-while-loop-factorial/main.c
#include <stdio.h>
#include <stdlib.h>

