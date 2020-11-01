package com.employee;
import java.util.Scanner;
public class prentclass {
    private String name, age, salary,designation;
    public  void getDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter age");
        age=sc.nextLine();
        System.out.println("Enter salary");
        salary=sc.nextLine();
        System.out.println("Enter designation");
        designation=sc.nextLine();
    }
    public void DisplayDetails()
    {
        System.out.println("Employee name : "+name+", age : "+age+", salary : "+salary+", designation : "+designation);
    }
}
