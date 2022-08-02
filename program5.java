/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

/**
 *
5) How to check if two strings are rotations of each other? (solution)
 * @author omkar
 */
class StringRotation
{
    /* Function checks if passed strings (str1 and str2)
       are rotations of each other */
    static boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1. 
        return (str1.length() == str2.length()) &&
               ((str1 + str1).contains(str2));
    }
     
    // Driver method
    public static void main (String[] args)
    {
        String str1 = "AACD";
        String str2 = "ACDA";
 
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}
