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
	Stack<Character> stack = new Stack<Character>();
	int length = brackets.length();
	for (int i = 0; i < length; i++)
	{
	    char c = brackets.charAt(i);
	    if (c == '<' &&!stack.isEmpty())
	    {
		stack.pop();
	    }
	    else if (c == '>')
	    {
		stack.push(c);
	    }
	}
	if (stack.isEmpty())
	    return true;
	else
	    return false;
    }
    public static void main(String[] args) throws