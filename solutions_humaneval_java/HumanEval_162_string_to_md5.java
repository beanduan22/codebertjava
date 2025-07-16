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
//        try {
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            byte[] digest = md.digest(text.getBytes());
//            BigInteger bi = new BigInteger(1, digest);
//            String hashText = bi.toString(16);
//            while (hashText.length() < 32) {
//                hashText = "0" + hashText;
//            }
//            return Optional.of(hashText);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//            return Optional