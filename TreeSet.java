/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;  
/**
 *
 * @Safi Soft
 */
public class TreeSet {
   public static void main(String args[]){  
       
//Creating and adding elements

TreeSet<String> set=new TreeSet<String>(); 

set.add("sohila");  
set.add("adila");  
set.add("razia");  
set.add("khatima");

//traversing elements 

Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}   
}
