import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Base :");
        int b=sc.nextInt();
        System.out.print("Enter Exponent :");
        int e=sc.nextInt();
        double p= Math.pow(b,e);
        System.out.println("Power of " +b + " raised to "+ e + " is "+ p );
    }
}
