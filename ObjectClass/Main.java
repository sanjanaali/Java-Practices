package com.mycompany.objectclass;

public class Main {
    
    private static Table table = new Table();
    private static Chaos chaos = new Chaos();//create the class with multiple arguments
     
    public static void main(String[] args){
        
         table.color = "Green";
         table.Color();
         table.numberOfLegs = table.Leg();
         System.out.println("Table leg = " +table.numberOfLegs );
         table. weight = 20.05;
         table.Weight();
         
         chaos.name = "ABC";
         chaos.Name();
         chaos.age = 20;
         chaos.Age();
         chaos. weight = 30.15;
         chaos.Weight();        
    }
    
}
