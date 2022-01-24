import java.util.*;
class factorial
{
    public static void main(String agrs[])
    {
        Scanner obj = new Scanner(System.in);
        int fact=1, i,n ;
        System.out.println("Enter the no: of terms:");
        n = obj.nextInt();
        for(i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of the given number is " +fact);
    }
}
