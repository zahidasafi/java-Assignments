/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheratance;



/**
 *
 * @safi Aryan Soft
 */
public class Inheratance {
    // Private Fields
  private String make; 
  private String color; 
  private int year;      
  private String model;   


   
  public Inheratance(String make, String color, int year, String model) {
    this.make = make;
    this.color = color;
    this.year = year;  
    this.model = model; 
  }

  
  public void printDetails() {
    System.out.println("Manufacturer: " + make);
    System.out.println("Color: " + color);
    System.out.println("Year: " + year);
    System.out.println("Model: " + model);
  }
  
}


class Car extends Inheratance {


  private String bodyStyle;


  public Car(String make, String color, int year, String model, String bodyStyle) {
    super(make, color, year, model);  
    this.bodyStyle = bodyStyle;       
  }

  public void carDetails() { 
    printDetails();        
    System.out.println("Body Style: " + bodyStyle);
  }
  
}

class Main {

  public static void main(String[] args) {
    Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan");
    elantraSedan.carDetails(); 
  }
  
    }
   


