import java.util.Scanner;

public class SimpleIn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        double SI=(principal*rate*time)/100;
        System.out.println("The simple interest is "+SI+" for principal "+principal+" ,Rate of interest "+rate+" and Time "+time);
    }
}
