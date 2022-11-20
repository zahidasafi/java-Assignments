/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*; 
/**
 *
 * @Safi soft
 */
public class LinkedList {
   public static void main(String args[]){  
LinkedList<String> al= new LinkedList<String>();  

al.add("heart");  
al.add("kabul");  
al.add("kandahar");  
al.add("farah");  

Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}   
}
