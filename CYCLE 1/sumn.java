import java.util.*;
class sumn
{
    public static void main(String agrs[])
    {
        int i , sum =0  , num ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the total no: of terms");
        num = obj.nextInt();
        for(i=1;i<=num;i++)
        {
            sum = sum+i ;
        }
        System.out.println("Sum = "+sum);

    }
}
