// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You'll be given a string of words, and your task is to count the number
    // of boredoms. A boredom is a sentence that starts with the word "I".
    // Sentences are delimited by '.', '?' or '!'.
    // For example:
    // >>> isBored(("Hello world"))
    // (0l)
    // >>> isBored(("The sky is blue. The sun is shining. I love this weather"))
    // (1l)
    public static long isBored(String S) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You'll be given a string of words, and your task is to count the number
    // of boredoms. A boredom is a sentence that starts with the word "I".
    // Sentences are delimited by '.', '?' or '!'.
    // For example:
    // >>> isBored(("Hello world"))
    // (0l)
    // >>> isBored(("The sky is blue. The sun is shining. I love this weather"))
    // (1l)
    public static long isBored(String S) {
	// your code here
        long count = 0;
        boolean st = false;
        if(S.charAt(0)=='I') {
            count++;
            st = true;
        }
        for(int i = 1;i<S.length();i++) {
            if(S.charAt(i)=='!') {
                if(st) {
                    count++;
                    st = false;
                }
            }
            if(S.charAt(i)=='?') {
                if(st) {
                    count++;
                    st = false;
                }
            }
            if(S.charAt(i)==