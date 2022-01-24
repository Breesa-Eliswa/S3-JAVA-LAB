import java.util.*;
class small
{
    public static void main(String agrs[])
    {
        int i , n,small=0  ;
        Scanner num = new Scanner(System.in);
        int a[] = new int [20];
        System.out.println("Enter the the total no: of elements");
        n = num.nextInt();
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=num.nextInt();
        }
        for(i=0;i<n;i++)
        {
            small = a[0];
            if(a[i]<small)
            {
                small = a[i];
            }
        }
        System.out.println("Smallest element in the array is " +small);
    }
}
