import java.util.*;
class Stringpalindrome
{
    public static void main(String agrs[])
    {
        int i , flag =0 ;
        Scanner obj = new Scanner(System.in);
      
        System.out.println("Enter the string length:");
        int n = obj.nextInt();
      
        System.out.println("Enter the string:");
        char a[] = new char[20];
      
        for(i=1;i<=n;i++)
            a[i]=obj.next().charAt(0);
      
        for(i=0;a[i]!='\0';i++)
           if(a[i]!=a[n-i-1]) 
             {
                 flag=1;
                 break;
             }  
      
        if(flag==1)
            System.out.println("The given string is not a palindrome");
        else
            System.out.println("The given string is a palindrome");
                
    }
}
