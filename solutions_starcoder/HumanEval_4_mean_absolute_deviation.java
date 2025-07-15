// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given array list of input numbers, calculate Mean Absolute Deviation
    // around the mean of this dataset.
    // Mean Absolute Deviation is the average absolute difference between each
    // element and a centerpoint (mean in this case):
    // MAD = average | x - x_mean |
    // >>> meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f))))
    // (1.0f)
    public static float meanAbsoluteDeviation(ArrayList<Float> numbers) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // For a given array list of input numbers, calculate Mean Absolute Deviation
    // around the mean of this dataset.
    // Mean Absolute Deviation is the average absolute difference between each
    // element and a centerpoint (mean in this case):
    // MAD = average | x - x_mean |
    // >>> meanAbsoluteDeviation((new ArrayList<Float>(Arrays.asList((float)1.0f, (float)2.0f, (float)3.0f, (float)4.0f))))
    // (1.0f)
    public static float meanAbsoluteDeviation(ArrayList<Float> numbers) {
	Float mean = numbers.stream().reduce(0.0f, (a, b) -> a + b) / numbers.size();
	return numbers.stream().map(x -> Math.abs(x - mean)).reduce(0.0f, (a, b) -> a + b) / numbers.size();
    }

    // For a given array list of input numbers, calculate the variance of this dataset.
    // Use the definition of the variance:
    // Variance = average (x - x_mean)^2
    // >>> variance((new ArrayList<Float>(Arrays.asList((