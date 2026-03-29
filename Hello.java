import java.util.*;

class Hello {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("This number is not prime number");
        } else {
            boolean isPrimeNumber = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            // ✅ PRINT OUTSIDE LOOP
            if (isPrimeNumber) {
                System.out.println("This number is prime number");
            } else {
                System.out.println("This number is not prime number");
            }
        }
    }
}