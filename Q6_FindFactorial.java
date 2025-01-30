import java.util.Scanner;
public class Q6_FindFactorial {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
    }
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {
        int num = getInput(); 
        long result = factorial(num); 
        displayResult(num, result); 
    }
}


