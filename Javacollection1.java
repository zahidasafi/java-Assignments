/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javacollection1;

import java.io.*;
import java.util.*;

public class Javacollection1 {

    public static void main(String[] args) {
        
        int arr[]=new int[]{1,23,4};
        Vector<Integer> v=new Vector();
        Hashtable<Integer,String> h=new Hashtable();
        
        v.addElement(1);
        v.addElement(2);
        
        h.put(1,"Zahida");
        h.put(2, "Safi");
        
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
      
    }
}
