package com.mycompany.objectclass;
import java.util.Scanner;
public class Main {
    
    private static Table table = new Table();
    private static Chaos chaos = new Chaos();
     
    public static void main(String[] args){
        
         table.color = "Green";
         table.Color();
         table.numberOfLegs = table.Leg();
         System.out.println("Table leg = " +table.numberOfLegs );
         table. weight = 20.05;
         table.Weight();
         System.out.println();
         
         System.out.println("Enter Chaos Name: " );
         Scanner n = new Scanner(System.in);
         chaos.name = n.nextLine();
         
         System.out.println("Enter Chaos Age: " );
         Scanner a = new Scanner(System.in);
         chaos.age = a.nextInt();
         
         System.out.println("Enter Chaos Weight: " );
         Scanner w = new Scanner(System.in);
         chaos. weight = w.nextDouble();
         
         System.out.println();
         chaos.Name();chaos.Age();chaos.Weight();        
    }
    
}
