import java.util.*;
class Circle{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void Area(){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is :"+area);
    }
    public void Perimeter(){
        double perimeter=2*3.14*radius;
        System.out.println("Perimeter of circle is :"+perimeter);
    }
}


public class AreaCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        Circle c=new Circle(radius);
        c.Area();
        c.Perimeter();
    }
}
