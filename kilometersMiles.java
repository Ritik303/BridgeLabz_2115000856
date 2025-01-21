import java.util.*;
public class kilometersMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in kilometers :");
        float k=sc.nextFloat();
        double m=(float) k*(0.621371);
        System.out.println("Distance in miles is :"+m);

    }
}
