import java.util.*;
public class employee
{
    String name;
    int epno,pn ;
    void enterdetails()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = obj.nextLine();
        System.out.println("Enter the employ no:");
        epno = obj.nextInt();
        System.out.println("Enter the phone number: ");
        pn=obj.nextInt();
    }
    void Printdetails()
    {
        System.out.println("\n");
        System.out.println("Details");
        System.out.println("Name:  "+name);
        System.out.println("Epno No:  "+epno);
        System.out.println("Phone no: "+pn);
    }
    public static void main(String agrs[])
    {
        int i ;
        Scanner obj1= new Scanner(System.in);
        employee obj[]=new employee[10];
        System.out.println("Enter the no: of employees");
        int n = obj1.nextInt();
        for(i=0;i<n;i++)
        {
            obj[i]=new employee();
            obj[i].enterdetails();
        }
        for(i=0;i<n;i++)
        {
            obj[i].Printdetails();
        }

    }
}
