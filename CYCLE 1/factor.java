import java.util.*;
class factor 
{
    public static void main(String agrs[])
    {
        int n , i;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = num.nextInt();
        System.out.println("The factors are:");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}            
