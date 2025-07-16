// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a string representing a sentence,
    // the sentence contains some words separated by a space,
    // and you have to return a string that contains the words from the original sentence,
    // whose lengths are prime numbers,
    // the order of the words in the new string should be the same as the original one.
    // Example 1:
    // >>> wordsInSentence(("This is a test"))
    // ("is")
    // Example 2:
    // >>> wordsInSentence(("lets go for swimming"))
    // ("go for")
    // Constraints:
    // * 1 <= len(sentence) <= 100
    // * sentence contains only letters
    public static String wordsInSentence(String sentence) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You are given a string representing a sentence,
    // the sentence contains some words separated by a space,
    // and you have to return a string that contains the words from the original sentence,
    // whose lengths are prime numbers,
    // the order of the words in the new string should be the same as the original one.
    // Example 1:
    // >>> wordsInSentence(("This is a test"))
    // ("is")
    // Example 2:
    // >>> wordsInSentence(("lets go for swimming"))
    // ("go for")
    // Constraints:
    // * 1 <= len(sentence) <= 100
    // * sentence contains only letters
    public static String wordsInSentence(String sentence) {
	String[] words = sentence.split(" ");
	List<String> result = new ArrayList<String>();
	for (String word : words) {
	    if (isPrime(word.length())) {
		result.add(word);
	    }
	}
	String resultStr = "";
	for (int i = 0; i < result.size() - 1; i++) {
	    resultStr += result.get(i) + " ";
	}
	resultStr += result.get(result.size() - 1);
	return resultStr;
    }