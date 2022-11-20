/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;  
/**
 *
 * @Safi Soft
 */
public class ArrayDeque {
    public static void main(String[] args) {  
//Creating Deque and adding elements  

Deque<String> deque = new ArrayDeque<String>();  
deque.add("kandahar");  
deque.add("kabul");  
deque.add("hearat");  

//Traversing elements 

for (String str : deque) {  
System.out.println(str);  
}  
}  
}  
}
