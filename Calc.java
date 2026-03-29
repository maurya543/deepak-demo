import java.util.*;
public class Calc {
    public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number");
     int n=sc.nextInt();
   
     switch(n % 2){
             case 0:
                {
                  System.out.println("Even Numebr:");
                }
                break;
             case 1:
                {
                System.out.println("odd Numebr");
                }
                break;
            default:
            {
                   System.out.println("Invalid");
            }

                

     }

    }
    
}
