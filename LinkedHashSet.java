/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;  

/**
 *
 * @Safi Soft
 */
public class LinkedHashSet {
    public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  

set.add("pakistan");  
set.add("uk");  
set.add("afghanistan");  
set.add("canada"); 

Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
}
