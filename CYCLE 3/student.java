import java.util.*;
class student
{
    public static void main(String agrs[])
    {
        Read data=new Read();
        data.enter();
        data.display();
    }
}
class Read
{
    Scanner obj = new Scanner(System.in);
    String name;
    int Rollno , i; 
    double m[] = new double[20];    
    void enter()
    {
         System.out.println("Enter the name and roll no: of the student:");
         name= obj.nextLine();
         Rollno = obj.nextInt();
         for(i=1;i<=5;i++)
        {
            System.out.println("Enter the mark of subject_ " +i);
            m[i]=obj.nextDouble();
        }
    }
    void display()
    {
        System.out.println("Student Name:  "+name);
        System.out.println("Roll no: "+Rollno);
        for(i=1;i<=5;i++)
        { 
            
            System.out.println("The mark of the subject_ "+i+ " is  "+m[i]);  
        }
    }
}
