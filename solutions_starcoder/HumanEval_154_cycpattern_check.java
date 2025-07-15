// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given 2 words. You need to return true if the second word or any of its rotations is a substring in the first word
    // >>> cycpatternCheck(("abcd"), ("abd"))
    // (false)
    // >>> cycpatternCheck(("hello"), ("ell"))
    // (true)
    // >>> cycpatternCheck(("whassup"), ("psus"))
    // (false)
    // >>> cycpatternCheck(("abab"), ("baa"))
    // (true)
    // >>> cycpatternCheck(("efef"), ("eeff"))
    // (false)
    // >>> cycpatternCheck(("himenss"), ("simen"))
    // (true)
    public static boolean cycpatternCheck(String a, String b) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given 2 words. You need to return true if the second word or any of its rotations is a substring in the first word
    // >>> cycpatternCheck(("abcd"), ("abd"))
    // (false)
    // >>> cycpatternCheck(("hello"), ("ell"))
    // (true)
    // >>> cycpatternCheck(("whassup"), ("psus"))
    // (false)
    // >>> cycpatternCheck(("abab"), ("baa"))
    // (true)
    // >>> cycpatternCheck(("efef"), ("eeff"))
    // (false)
    // >>> cycpatternCheck(("himenss"), ("simen"))
    // (true)
    public static boolean cycpatternCheck(String a, String b) {
	// Write your code here
	int n=a.length();
	int m=b.length();
	if(n>m)
	    return false;
	String ab=a+a;
	if(ab.contains(b))
	    return true;
	else 
	    return false;
    }
    public static void main(String []args){
	Scanner in = new Scanner(System.in);
	String a = in.next();
	String b = in.next();
	System.out.println(cycpatternCheck(a, b));
    }
