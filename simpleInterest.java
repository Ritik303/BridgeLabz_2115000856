import java.util.*;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal :");
        float p=sc.nextFloat();
        System.out.print("Enter the rate :");
        float r=sc.nextFloat();
        System.out.print("Enter time :");
        float t=sc.nextFloat();
        float si=(float) (p*r*t)/100;
        System.out.println("Simple interest is :"+si);
    }
}
