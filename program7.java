/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

/**
 *7) How to reverse String without recursion? (solution)
 * @author omkar
 */
import java.util.Scanner;
public class program7 {
   public static String reverseString(String str){
      if(str.isEmpty()){
         return str;
      }else{
         return reverseString(str.substring(1))+str.charAt(0);
      }
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String value: ");
      String str = sc.next();
      String result = program7.reverseString(str);
      System.out.println(result);
   }
}
