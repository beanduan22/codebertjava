// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // I think we all remember that feeling when the result of some long-awaited
    // event is finally known. The feelings and thoughts you have at that moment are
    // definitely worth noting down and comparing.
    // Your task is to determine if a person correctly guessed the results of a number of matches.
    // You are given two array array lists of scores and guesses of equal length, where each index shows a match. 
    // Return an array array list of the same length denoting how far off each guess was. If they have guessed correctly,
    // the value is 0, and if not, the value is the absolute difference between the guess and the score.
    // example:
    // >>> compare((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)1l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)2l, (long)-2l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l, (long)0l, (long)3l, (long)3l)))
    // >>> compare((new ArrayList<Long>(Arrays.asList((long)0l, (long)5l, (long)0l, (long)0l, (long)0l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)1l, (long)0l, (long)0l, (long)-2l))))
    // (new ArrayList<Long>(Arrays.asList((long)4l, (long)4l, (long)1l, (long)0l, (long)0l, (long)6l)))
    public static ArrayList<Long> compare(ArrayList<Long> game, ArrayList<Long> guess) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // I think we all remember that feeling when the result of some long-awaited
    // event is finally known. The feelings and thoughts you have at that moment are
    // definitely worth noting down and comparing.
    // Your task is to determine if a person correctly guessed the results of a number of matches.
    // You are given two array array lists of scores and guesses of equal length, where each index shows a match. 
    // Return an array array list of the same length denoting how far off each guess was. If they have guessed correctly,
    // the value is 0, and if not, the value is the absolute difference between the guess and the score.
    // example:
    // >>> compare((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)5l, (long)1l))), (new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l, (long)2l, (long)-2l))))
    // (new ArrayList<Long>(Arrays.asList((long)0l, (long)0l, (long)0l, (long)0l, (long)3l, (long)3l)))
    // >>> compare((new ArrayList<Long>(Arrays.asList((long)0l, (long)5l, (long)0l, (long)0l, (long)0l, (long)4l))), (new ArrayList<Long>(Arrays.asList((long)4l, (long)1l, (long)1l, (long)0l, (long)0l, (long)-2l))))
    // (new ArrayList<Long>(Arrays.asList((long)4l, (long)4l, (long)1l, (long)0l, (long)0l, (long)6l)))
    public static ArrayList<Long> compare(ArrayList<Long> game, ArrayList<Long> guess) {
	ArrayList<Long> result = new ArrayList<Long>();
	int i = 0;
	for (i = 0 ; i < game.size() ; i++) {
	    if (game.get(i) == guess.get(i)) {
		result.add(0l);
	    } else {
		result.add(Math.abs(game.get(i) - guess.get(i)));
	    }
	}
	return result;
    }

    public static void main(String[] args) {
	ArrayList<Long> game = new ArrayList<Long>(