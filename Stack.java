/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @Safi Soft
 */
public class Stack {
    public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("aa");  
stack.push("bb");  
stack.push("cc");  
stack.push("dd");  
stack.push("ee");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  

