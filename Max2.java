import java.util.*;

class Max2 {
    
    public static void main (String args [])  {
        
        int a, c ,b ;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        if (a>b && a>c)
        {
            System.out.println("a is Max number:" +a);
            
        }
        else if (b>a && b>c)
        {
            System.out.println("b is Max number:" +b);
        }
        else 
        {
            System.out.println("c is Max number:" +c);
        }
    }
}