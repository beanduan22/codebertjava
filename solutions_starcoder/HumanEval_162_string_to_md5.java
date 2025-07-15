// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string 'text', return its md5 hash equivalent string.
    // If 'text' is an empty string, return null.
    // >>> stringToMd5(("Hello world"))
    // Optional.of("3e25960a79dbc69b674cd4ec67a72c62")
    public static Optional<String> stringToMd5(String text) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given a string 'text', return its md5 hash equivalent string.
    // If 'text' is an empty string, return null.
    // >>> stringToMd5(("Hello world"))
    // Optional.of("3e25960a79dbc69b674cd4ec67a72c62")
    public static Optional<String> stringToMd5(String text) {
	try {
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(text.getBytes());
	    byte[] digest = md.digest();
	    return Optional.of(new BigInteger(1, digest).toString(16));
	} catch (NoSuchAlgorithmException e) {
	    return Optional.empty();
	}
    }

    // Given a string 'text', return its sha1 hash equivalent string.
    // If 'text' is an empty string, return null.
    // >>> stringToSha1(("Hello world"))
    // Optional.of("5eb63bbbe01