/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.finallyblock;

/**
 *
 * @safi Aryan Soft
 */
public class FinallyBlock {

    public static void main(String[] args) {
      try{    

   int data=25/5;    
   System.out.println(data);    
  }    

  catch(NullPointerException e){  
System.out.println(e);  
}    
 
 finally {  
System.out.println("finally block is always executed");  
}    
    
System.out.println("rest of phe code...");    
  }    
}    
  
