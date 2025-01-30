import java.util.*;
class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void DisplayDetails(){
        System.out.println("Employee name is :"+name);
        System.out.println("Employee ID is :"+id);
        System.out.println("Employee Salary is :"+salary);
    }
}
public class EmployeeDetails {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int  id=sc.nextInt();
        double salary=sc.nextDouble();
        Employee obj=new Employee(name, id, salary);
        obj.DisplayDetails();
    }
}
