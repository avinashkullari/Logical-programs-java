// WAP a java program to print all Ascii character with their values.

import java.util.Scanner;

class EX35Ascii {
    
    public static void main (String args[]) {
        
        char ch;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter any character ");
        ch=sc.next().charAt(0);
        
        int a=ch;
        System.out.print("ASCII value of "+ch +" is " +a);
        
        
    }
}