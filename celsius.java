import java.util.*;
public class celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        float c=sc.nextFloat();
        float f=(float)((c*9)/5)+32;
        System.out.println("Temperature in fahrenheit is :"+ f);
    }
}
