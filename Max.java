import java.util.*;

class Max {
    
    public static void main (String args [])  {
        
        int a, b ;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
        if (a>b)
        {
            System.out.println("a is Max number:" +a);
            
        }
        else
        {
            System.out.println("b is Max number:" +b);
        }
    }
}