import java.util.*;
class arraysum
{
    public static void main(String agars[])
    {
        int i , sum =0 ;
        int a[]=new int[20];
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the total no: of elements ");
        int n = num.nextInt();
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i] = num.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum = sum +a[i];
        }
        System.out.println("Total sum = "+sum);

    }
}

