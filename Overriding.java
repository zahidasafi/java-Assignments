/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.overriding;

/**
 *
 * @Safi Aryan Soft
 */
class ovveriding{  
 
  void run(){System.out.println("Vehicle is running");}  
}  

class Bike2 extends ovveriding{  
 
  void run(){System.out.println("Bike is running safely");}  
  
  public static void main(String args[]){  
  Bike2 obj = new Bike2();
  obj.run();
  }  
}  


 
 
