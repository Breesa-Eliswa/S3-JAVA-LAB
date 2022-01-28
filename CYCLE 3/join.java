import java.util.*;
class join
{
    public static void main(String agrs[])
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the 2 strings");
        String str1= obj.nextLine();
        String str2= obj.nextLine();
        
        System.out.println("Enter the numbers to be concatenated:");
        int num1= obj.nextInt();
        int num2=obj.nextInt();

        Second obj2=new Second();
        obj2.concatenate(str1,str2);
        obj2.concatenate(num1,num2);
    }
}
class Second 
{
    void concatenate(String str1,String str2)
    {
     System.out.println("The concatenated string is  "+(str1+str2));
    }
    void concatenate(int num1 , int num2)
    {
        System.out.println("The concatenated numbers are  "+(num1)+(num2));
    }
}
