package com.employee;
import java.util.Scanner;

public class parentclass {
    protected String name ,age,salary;
    Scanner sc=new Scanner(System.in);
    public void getDetails()
    {
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter age");
        age=sc.nextLine();
        System.out.println("Enter salary");
        salary=sc.nextLine();
    }
    public String DisplayDetails()
    {
        return " "+name+"  has age "+age+" with salary "+salary;
    }
}
