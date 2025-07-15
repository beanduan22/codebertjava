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
	String db = "db";
	String end = "db";
	String st = Long.toBinaryString(decimal);
	StringBuilder res = new StringBuilder();
	res.append(db);
	res.append(st);
	res.append(end);
	return res.toString();
    }

    // You will be given a number in binary form (a string) and your task is to convert it to
    // decimal format. The function should return a long.
    // There will be an extra couple of characters 'db' at the beginning and at the end of the string.