// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given two array lists operator, and operand. The first array list has basic algebra operations, and 
    // the second array list is an array array list of integers. Use the two given array lists to build the algebric 
    // expression and return the evaluation of this expression.
    // The basic algebra operations:
    // Addition ( + ) 
    // Subtraction ( - ) 
    // Multiplication ( * ) 
    // Floor division ( // ) 
    // Exponentiation ( ** ) 
    // Example:
    // operator['+', '*', '-']
    // array array list = [2, 3, 4, 5]
    // result = 2 + 3 * 4 - 5
    // => result = 9
    // Note:
    // The length of operator array list is equal to the length of operand array list minus one.
    // Operand is an array array list of of non-negative integers.
    // Operator array list has at least one operator, and operand array list has at least two operands.
    public static long doAlgebra(ArrayList<String> op, ArrayList<Long> operand) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given two array lists operator, and operand. The first array list has basic algebra operations, and 
    // the second array list is an array array list of integers. Use the two given array lists to build the algebric 
    // expression and return the evaluation of this expression.
    // The basic algebra operations:
    // Addition ( + ) 
    // Subtraction ( - ) 
    // Multiplication ( * ) 
    // Floor division ( // ) 
    // Exponentiation ( ** ) 
    // Example:
    // operator['+', '*', '-']
    // array array list = [2, 3, 4, 5]
    // result = 2 + 3 * 4 - 5
    // => result = 9
    // Note:
    // The length of operator array list is equal to the length of operand array list minus one.
    // Operand is an array array list of of non-negative integers.
    // Operator array list has at least one operator, and operand array list has at least two operands.
    public static long doAlgebra(ArrayList<String> op, ArrayList<Long> operand) {
	// Use two stacks to solve the problem.
	// The first one is for the operator
	// The second one is for the operand
	// The solution is pop two elements from the operand stack, and then pop one operator from the operator stack.
	// Do the calculation with the two elements and the operator.
	// Push the result back to the operand stack.
	// After the loop, there is only one element in the operand stack.
	// Pop this element and return it.
	Stack<String> opStack = new Stack<String>();
	Stack<Long> operand