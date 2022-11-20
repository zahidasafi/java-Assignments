/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exception;

/**
 *
 * @Safi Aryan Soft
 */
public class Exception {

    public static void main(String[] args) {
  try{  
      
      int data=100/0;  
   }catch(ArithmeticException e)
   
   {System.out.println(e);}  
    
   System.out.println("rest of the code...");  
  }  

}
