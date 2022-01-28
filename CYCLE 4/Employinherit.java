import java.util.*;
class Employee
{
    Scanner obj = new Scanner(System.in);
    String name,addr;
    int age,phno;
    float salary;
    void input()
     {
         
         System.out.print("Enter Name ");
         name=obj.nextLine();
         System.out.print("Enter Age ");
         age=obj.nextInt();
         System.out.print("Enter Phone No ");
         phno=obj.nextInt();
         obj.nextLine();       
         System.out.print("Enter Address ");
         addr=obj.nextLine();
         System.out.print("Enter Salary ");
         salary=obj.nextInt();
     }  
    
    void display()
    {
        System.out.println("Name: "+name);
        
        System.out.println("Age: "+age);
        
        System.out.println("Phone No: "+phno);
        
        System.out.println("Address: "+addr);
        
        
    }
    void print_salary()
    {
        System.out.print("Salary: "+salary); 
    }
}   

class Officer extends Employee
{
   String specialisation;
   void officer_read()
   {
       System.out.println();
       System.out.println("Enter the details of the Officer");
       System.out.print("Enter the Specialication ");
       specialisation = obj.nextLine();    
   }  
   void officer_print()
   {
       System.out.println();
       System.out.println("Details of the Officer");
       System.out.println("Specialication: "+specialisation);
          
   }  
}

class Manager extends Employee
{
  String department; 
  void manager_read() 
  {
    System.out.println("\n");  
    System.out.println("Enter following details of the Manager");
    System.out.print("Enter the Department ");
    department = obj.nextLine();    
  } 
  void manager_print()
   {
       System.out.println("\n"); 
       System.out.println("Details of the Manager");
       System.out.println("Department: "+department);
          
   }  
} 

class Employinherit
{
  public static void main(String[] args) 
  {
    Officer obj1 = new Officer();
    obj1.officer_read();
    obj1.input();
    obj1.officer_print();
    obj1.display();
    obj1.print_salary();
    Manager obj2 = new Manager();
    obj2.manager_read();
    obj2.input();
    obj2.manager_print();
    obj2.display();
    obj2.print_salary();
   } 
}
