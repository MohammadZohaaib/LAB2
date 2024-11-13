/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.remaining_tasks;

/**
 *
 * @author USER
 */
public class Remaining_tasks {

  public static void main(String[] args)
{
 String s1="Zohaib";
 String s2="Usaim";
 String s3="Bilal";
 String s4=new String("Java");
 String s5=new String("Programming");
 String s6=s1.concat (s1).concat (s2).concat (s3).concat (s4).concat (s5);
 String substring=s6.substring(8);
 System.out.println(s6);
 System.out.println(s1);
 System.out.println(substring);
}
}


public class Remaining_tasks{
public static void main(String[] args) { 
     String word1 = "abc"; 
     String word2 = "pqr";
     
     String mergedString = mergeAlternately(word1, word2); 
     System.out.println("Merged String:" + mergedString); 
} 
public static String mergeAlternately(String word1, String word2) { 
     StringBuilder merged = new StringBuilder();
     int length1 = word1.length(); 
     int length2 = word2.length(); 
     int maxLength = Math.max(length1, length2); 
     
     for (int i = 0; i < maxLength; i++) { 
        if (i < length1) { 
          merged.append(word1.charAt(i)); 
          } 
        if (i < length2) { 
          merged.append(word2.charAt(i)); 
          } 
        } 
        return merged.toString(); 
}
}

public static void main(String[] args) {
    int mininteger = Integer.MIN_VALUE;
    int maxinteger = Integer.MAX_VALUE;
    System.out.println("Minimum Integer Value:" + mininteger);
    System.out.println("Maximum Integer Value:" + maxinteger);
    float minFloat = Float.MIN_VALUE;
    float maxFloat = Float.MAX_VALUE;
    System.out.println("\nMinimum Float Value: " + minFloat);
    System.out.println("Maximum Float Value:" + maxFloat);
    double minDouble = Double.MIN_VALUE; 
    double maxDouble = Double.MAX_VALUE ;
    System.out.println("\nMinimum Double Value: " + minDouble);
    System.out.println("Maximum Double Value: " + maxDouble);
}
