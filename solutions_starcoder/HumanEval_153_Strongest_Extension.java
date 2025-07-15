// Prompt:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given the name of a class (a string) and an array array list of extensions.
    // The extensions are to be used to load additional classes to the class. The
    // strength of the extension is as follows: Let CAP be the number of the uppercase
    // letters in the extension's name, and let SM be the number of lowercase letters 
    // in the extension's name, the strength is given by the fraction CAP - SM. 
    // You should find the strongest extension and return a string in this 
    // format: ClassName.StrongestExtensionName.
    // If there are two or more extensions with the same strength, you should
    // choose the one that comes first in the array list.
    // For example, if you are given "Slices" as the class and an array array list of the
    // extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
    // return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension 
    // (its strength is -1).
    // Example:
    // >>> StrongestExtension(("my_class"), (new ArrayList<String>(Arrays.asList((String)"AA", (String)"Be", (String)"CC"))))
    // ("my_class.AA")
    public static String StrongestExtension(String class_name, ArrayList<String> extensions) {

// Solution:
import java.util.*;
import java.lang.reflect.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // You will be given the name of a class (a string) and an array array list of extensions.
    // The extensions are to be used to load additional classes to the class. The
    // strength of the extension is as follows: Let CAP be the number of the uppercase
    // letters in the extension's name, and let SM be the number of lowercase letters 
    // in the extension's name, the strength is given by the fraction CAP - SM. 
    // You should find the strongest extension and return a string in this 
    // format: ClassName.StrongestExtensionName.
    // If there are two or more extensions with the same strength, you should
    // choose the one that comes first in the array list.
    // For example, if you are given "Slices" as the class and an array array list of the
    // extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
    // return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension 
    // (its strength is -1).
    // Example:
    // >>> StrongestExtension(("my_class"), (new ArrayList<String>(Arrays.asList((String)"AA", (String)"Be", (String)"CC"))))
    // ("my_class.AA")
    public static String StrongestExtension(String class_name, ArrayList<String> extensions) {
	// Write your code here
      Class C;
      try{
        C = Class.forName(class_name);
      }catch(ClassNotFoundException e){
        e.printStackTrace();
        return "";
      }
      Field[] fields = C.getFields();
      int counter = 0;
      String fName = "";
      for(Field f : fields){
        fName = f.getName();
        for(String e : extensions){
          if(e.contains(fName)){
            counter = counter + (int)(Math.abs(fName.charAt(0) - fName.charAt(fName.length