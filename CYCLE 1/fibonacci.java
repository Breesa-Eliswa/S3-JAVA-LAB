import java.util.*;
class fibonacci
{
    public static void main(String arsg[])
    {
        int i , first =0 , second =1, count , next ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the total no: of terms");
        count = obj.nextInt();
        if(count==1)
           System.out.println(""+first);
        else
        {
            for(i=1;i<=count;i++)
            {
                System.out.println(""+first);
                next = first+ second ;
                first = second ;
                second = next ;            
            }
        }   
    }
}
