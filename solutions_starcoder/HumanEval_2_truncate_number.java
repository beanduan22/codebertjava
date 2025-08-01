// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive floating point number, it can be decomposed into
    // and integer part (largest integer smaller than given number) and decimals
    // (leftover part always smaller than 1).
    // Return the decimal part of the number.
    // >>> truncateNumber((3.5f))
    // (0.5f)
    public static float truncateNumber(float number) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a positive floating point number, it can be decomposed into
    // and integer part (largest integer smaller than given number) and decimals
    // (leftover part always smaller than 1).
    // Return the decimal part of the number.
    // >>> truncateNumber((3.5f))
    // (0.5f)
    public static float truncateNumber(float number) {
	return (float) number - (int) number;
    }

    // Given a positive floating point number, it can be decomposed into
    // and integer part (largest integer smaller than given number) and decimals
    // (leftover part always smaller than 1).
    // Return the integer part of the number.
    // >>> truncateNumber(3.5f)
    // (3)
    public static int truncateInteger(float number) {
	return (int) number;
    }

    // 20.34.toDigits(10)
    // 20.34