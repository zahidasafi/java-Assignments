/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.polymorphism;

/**
 *
 * @Safi Aryan Soft
 */
public class Polymorphism {
     public void displayInfo() {
    System.out.println("Common English Language");
  }
}

class Java extends Polymorphism {
  @Override
  public void displayInfo() {
    System.out.println("Java Programming Language");
  }
}

class Main {
  public static void main(String[] args) {

    
    Java j1 = new Java();
    j1.displayInfo();

    
    Polymorphism l1 = new Polymorphism();
    l1.displayInfo();
  }
}


   
