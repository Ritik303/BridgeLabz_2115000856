import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int o1=a+b*c;
        int o2=a*b+c;
        int o3=c+a/b;
        int o4=a%b+c;
        System.out.println("The result of Int operations are "+o1+" , "+o2+" , "+o3+" and "+o4);
    }
}
