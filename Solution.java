import static java.lang.System.in;
import java.util.Scanner;
class Employee
{
    String name;
    String address;
    int age;
    int phonenumber;
    float salary;
    Employee(String name, String address, int age, int phonenumber, float salary)
    {
        this.name=name;
        this.address=address;
        this.age=age;
        this.phonenumber=phonenumber;
        this.salary=salary;
    }
    void  printSalary()
    {
        System.out.println("The salary is " +salary);
    }
}
class Officer extends Employee
{
    String specialization;  
    Officer(String name, String address, int age, int phonenumber, float salary, String specialization)
    {
        super(name, address, age, phonenumber, salary);
        this.specialization = specialization;
    }
}
class Manager extends Employee
{
String department;
Manager(String name, String address, int age, int phonenumber, float salary, String department)
    {
    super(name,address,age,phonenumber,salary);
    this.department=department;
    }
}
 class Solution   
 {
     public static void main(String args[])
     {      
       Scanner in= new Scanner(System.in);
       System.out.println("Enter the name");
       String officerName = in.nextLine();
        System.out.println("Enter the address");
       String address= in.nextLine();
       System.out.println("Enter the age");
         int age = in.nextInt();
       System.out.println("Enter the salary");
       int salary=in.nextInt();
       System.out.println("Enter the phone number");
       int phonenumber=in.nextInt();
       in.nextLine();
       System.out.println("Enter specialization");
       String specialization=in.nextLine();
       Employee ob1 = new Officer(officerName,address,age,phonenumber,salary,specialization);
       System.out.println("Enter the name");
       String name= in.nextLine();
       System.out.println("Enter the address");
       address = in.nextLine();
       System.out.println("Enter the age");
       age =in.nextInt();
       System.out.println("Enter the salary");
       salary =in.nextInt();
       System.out.println("Enter the phone number");
       phonenumber =in.nextInt();
       System.out.println("Enter department");
       String department=in.nextLine();
       Employee ob2 = new Manager(name,address,age,phonenumber, salary,department);
       ob1.printSalary();
       ob2.printSalary();
     }
 }
