import java.util.*;
public class perimeterRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length :");
        float l=sc.nextFloat();
        System.out.print("Enter Width :");
        float w=sc.nextFloat();
        float p= 2*(l+w);
        System.out.println("Perimeter is :"+p);

    }
}
