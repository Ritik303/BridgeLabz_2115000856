import java.util.Scanner;

public class PoundsToKilo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pounds=sc.nextDouble();
        double kilo=pounds/2.2;
        System.out.println("The weight of the person in pound is "+pounds+" and in kg is "+kilo);
    }
}
