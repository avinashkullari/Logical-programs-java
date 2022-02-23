import java.util.Scanner;

class Totalmarks {
    
    public static void main (String []args) {
        
        int total=0 , pr=0 , in=0 , ex=0 ,mr=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the marks ");
        mr= sc.nextInt();
        
        pr= (mr/100)*70;
        ex= (mr/100)*20;
        in=(mr/100)*10;
        
        total=pr+ex+in;
         System.out.println("Total marks : "+total);
        
        
        
    }
}