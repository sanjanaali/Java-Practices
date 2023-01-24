package com.mycompany.objectclass;


public class Table {
    
    String color;
    int numberOfLegs;
    double weight;
 

   void Color(){
       
       System.out.println("Table color = " +color);
   }
   public int Leg(){
       
       return 4;
   }
   void Weight(){
       
       System.out.println("Table weight = " +weight);
   }
}
