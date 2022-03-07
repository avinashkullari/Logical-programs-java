
import java.util.*;

class Number {
    
    public static void main (String args [])  {
        
        int num ;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a numbers");
        num=sc.nextInt();
        
        if(num>1)
        {
            System.out.println("it is a positive number");
        }
        else if (num<0)
        {
            System.out.println("it is a Negative number");
        }
        else{
            System.out.println("it is a Zero number");
        }
    }
}