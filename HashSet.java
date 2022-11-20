/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;  
/**
 *
 * @Safi Soft
 */
public class HashSet {
 public static void main(String args[]){  
//Creating HashSet and adding elements  

HashSet<String> set=new HashSet<String>();  

set.add("Zahida");  
set.add("Safi");  
set.add("sa");  
set.add("zahida");  
//Traversing elements  

Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}     
}
