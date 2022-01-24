import java.util.*;
class pal
{
    public static void main(String agrs[])
    {
        Scanner num = new Scanner(System.in);
        int n ,  rem , revnum=0 ;
        System.out.println("Enter the number:");
        n = num.nextInt();
        int orgnum = n;
        while(n!=0)
        {
            rem = n%10;
            revnum = revnum*10 + rem ;
            n = n/10;
        }
        if(revnum ==orgnum)
            System.out.println(orgnum+ " is a pallindrome!!");
        else 
            System.out.println(orgnum+ " is not a pallindrome");   


    }
}
