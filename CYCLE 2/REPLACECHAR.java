import java.util.*;
class REPLACECHAR
{
    public static void main(String agars[])
    {
        int i ;
        Scanner obj = new Scanner(System.in);
      
        System.out.println("Enter the string length");
        int n = obj.nextInt();
      
        System.out.println("Enter the string elements");
        char a[] = new char[20];
      
        for(i=1;i<=n;i++)
            a[i]=obj.next().charAt(0);
      
        System.out.println("Enter the position of the character to be repalced");
        int x = obj.nextInt();
      
        System.out.println("Enter the character to be placed:");
        char ch = obj.next().charAt(0);
      
        for(i=1;i<=n;i++)
           a[x]=ch ;
      
        System.out.println("Replaced string is : ");
        for(i=0;i<=n;i++)
           System.out.print(a[i]);       

    }
}
