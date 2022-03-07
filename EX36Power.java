// WAP  a java program to find power of a naumber using for loop.

import java.util.*;

class EX36Power {
    public static void main (String [] args) {
    
    int n, p, result=1;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter No.");
    n=sc.nextInt();
    System.out.println("Enter Power");
     p=sc.nextInt();
     
     for (int i=1 ; i<=p;i++)
     {
         result=n*result;
     }
     
     System.out.println("poWer is " + result);
    
}
}