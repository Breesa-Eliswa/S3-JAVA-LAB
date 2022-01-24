import java.util.*;
class armstrong
{
    public static void main(String agrs[])
    {
        int count = 0, num, orgnum, i,r ,revnum=0        ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        num= obj.nextInt();
        orgnum = num;
        while(num!=0)
        {
            num=num/10;
            count=count+1;
        }
        num= orgnum;
        while(num!=0)
        {
            int multi =1 ;
            r = num%10;
            for(i=0;i<count;i++)
            {
                multi=multi*r;
            }
            num=num/10;
            revnum=revnum+multi ;
        }
        if(orgnum==revnum)
             System.out.println("The given number is an armstrong number");
        else
             System.out.println("The given number is not an armstrong number");
                  

    }
}
