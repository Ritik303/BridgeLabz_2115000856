import java.util.*;
public class areaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        float r=sc.nextFloat();
        float area= (float)(3.14)*r*r;
        System.out.println("Area of the circle is :"+area);
    }
}
