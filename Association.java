/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.association;

/**
 *
 * @author Aryan Soft
 */
import java.util.*; 
 class Mobile {    
    private String mobile_no;  
    
    public String getMobileNo() {  
        return mobile_no;  
    }  
    public void setMobileNo(String mobile_no) {  
        this.mobile_no = mobile_no;  
    }  
}  
class Person {       
    private String name;  
    List<Mobile> numbers;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public List<Mobile> getNumbers() {  
        return numbers;  
    }  
    public void setNumbers(List<Mobile> numbers) {  
        this.numbers = numbers;  
    }  
}  
public class Association {  
      public static void main(String[] args) {  
            Person person = new Person();  
            person.setName("Shubham Rastogi");  
             
           Mobile number1 = new Mobile();  
            number1.setMobileNo("8868923136");  
            Mobile number2 = new Mobile();  
            number2.setMobileNo("8630023310");  
      
            List<Mobile> numberList = new ArrayList<Mobile>();  
            numberList.add(number1);  
            numberList.add(number2);  
            person.setNumbers(numberList);  
            System.out.println(person.getNumbers()+" are mobile numbers of the person "+  
            person.getName());  
        }  
        
 } 
 


     
    

