// WAP a java program to find all factors of a number .

import java.util.*;

class EX37Factors {
    public static void main (String []args){
        
        int n;
   Scanner sc = new Scanner (System.in);
   System.out.println("enter a number");
    n=sc.nextInt();
    
    for (int i=1 ; i<=n/2; i++)
    {
        if(n%i==0)
        {
            System.out.print(i+" ");
        }
    }
        
    }
}