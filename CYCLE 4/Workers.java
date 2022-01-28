class Employee
{
  void display()
  {
    System.out.println("Name of class is Employee");
  }

  void calcSalary()
  {
    System.out.println("Salary of the employee is Rs 10000");
  }
}

class Engineer extends Employee
{
 void calcSalary()  
  {
    super.calcSalary();
    System.out.println("Salary of the engineer is Rs 20000");
  } 

}

class Workers
{
    public static void main(String args[])
    {
        Engineer e = new Engineer();
        e.display();
        e.calcSalary();
    }
}
