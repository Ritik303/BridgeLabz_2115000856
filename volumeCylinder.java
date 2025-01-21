import java.util.*;
public class volumeCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius :");
        float r=sc.nextFloat();
        System.out.print("Enter the height :");
        float h=sc.nextFloat();
        float v=(float) 3.14*r*r*h;
        System.out.println("Volume of the cylinder is :"+v);
    }
}
