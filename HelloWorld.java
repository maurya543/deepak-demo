import java.util.*;
class HelloWorld{
    public static void  main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the term:");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.println("Fibonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.print(a+ "  ");
            int next=a+b;
            a=b;
            b=next;
        }
        
    }

}