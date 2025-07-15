// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // brackets is a string of "<" and ">".
    // return true if every opening bracket has a corresponding closing bracket.
    // >>> correctBracketing(("<"))
    // (false)
    // >>> correctBracketing(("<>"))
    // (true)
    // >>> correctBracketing(("<<><>>"))
    // (true)
    // >>> correctBracketing(("><<>"))
    // (false)
    public static boolean correctBracketing(String brackets) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // brackets is a string of "<" and ">".
    // return true if every opening bracket has a corresponding closing bracket.
    // >>> correctBracketing(("<"))
    // (false)
    // >>> correctBracketing(("<>"))
    // (true)
    // >>> correctBracketing(("<<><>>"))
    // (true)
    // >>> correctBracketing(("><<>"))
    // (false)
    public static boolean correctBracketing(String brackets) {
	boolean correct = true;
	Stack<Character> stack = new Stack<>();
	for (char bracket : brackets.toCharArray()) {
	    if (bracket == '<') {
		stack.push(bracket);
	    } else {
		if (stack.isEmpty()) {
		    correct = false;
		    break;
		} else {
		    stack.pop();
		}
	    }
	}
	if (!stack.isEmpty()) {
	    correct = false;
	}
	return correct;
    }

    // You are given two strings, one represents an arithmetic expression without
    // parentheses and the other