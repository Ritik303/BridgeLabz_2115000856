import java.util.*;
public class avgThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number :");
        float n1=sc.nextFloat();
        System.out.print("Enter second number :");
        float n2=sc.nextFloat();
        System.out.print("Enter third number :");
        float n3=sc.nextFloat();
        float avg= (n1+n2+n3)/3;
        System.out.println("Average is :"+avg);

    }
}
