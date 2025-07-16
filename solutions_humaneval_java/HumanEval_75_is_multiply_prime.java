// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that returns true if the given number is the multiplication of 3 prime numbers
    // and false otherwise.
    // Knowing that (a) is less then 100. 
    // Example:
    // >>> isMultiplyPrime((30l))
    // (true)
    // 30 = 2 * 3 * 5
    public static boolean isMultiplyPrime(long a) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Write a function that returns true if the given number is the multiplication of 3 prime numbers
    // and false otherwise.
    // Knowing that (a) is less then 100. 
    // Example:
    // >>> isMultiplyPrime((30l))
    // (true)
    // 30 = 2 * 3 * 5
    public static boolean isMultiplyPrime(long a) {
	// Your code goes here
	if(a==1)
	    return false;
	int count=0,flag=0;
	for(int i=2;i<=a/2;i++)
	{
	    if(isPrime(i))
	    {
		if(a%i==0)
		{
		    flag=1;
		    break;
		}
	    }
	}
	if(flag==1)
	    return false;
	else
	{
	    for(int i=2;i<=a/2;i++)
	    {
		if(