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
	// Write your code here.
	float answer = number % 1;
	return answer;
    }
}
/C#/C#-Practice/C#-Practice/Practice-1/Practice-1/Program.cs
﻿using System;

namespace Practice_1
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine("Enter First Number");
            int first = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter Second Number");
            int second =