// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given a number in decimal form and your task is to convert it to
    // binary format. The function should return a string, with each character representing a binary
    // number. Each character in the string will be '0' or '1'.
    // There will be an extra couple of characters 'db' at the beginning and at the end of the string.
    // The extra characters are there to help with the format.
    // Examples:
    // >>> decimalToBinary((15l))
    // ("db1111db")
    // >>> decimalToBinary((32l))
    // ("db100000db")
    public static String decimalToBinary(long decimal) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given a number in decimal form and your task is to convert it to
    // binary format. The function should return a string, with each character representing a binary
    // number. Each character in the string will be '0' or '1'.
    // There will be an extra couple of characters 'db' at the beginning and at the end of the string.
    // The extra characters are there to help with the format.
    // Examples:
    // >>> decimalToBinary((15l))
    // ("db1111db")
    // >>> decimalToBinary((32l))
    // ("db100000db")
    public static String decimalToBinary(long decimal) {
	String result = "db";
	while (decimal > 0) {
	    result += decimal % 2;
	    decimal /= 2;
	}
	return new StringBuilder(result).reverse().toString() + "db"; 
    }

    // You are given a number in binary format. The number will be represented as a string and
    // will be prepended with 'db' and appended with 'db'. Your task is to convert it to decimal
    // format.
    // Examples:
    // >>> binaryToDecimal("db1001db")
    // 9
    // >>> binaryToDecimal