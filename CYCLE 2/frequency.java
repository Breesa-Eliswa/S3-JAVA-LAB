import java.util.*;
class frequency
{
    public static void main(String agrs[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
      
        System.out.println("Enter the character  whose frequency is to be found"); 
        char ch = sc.next().charAt(0);
      
        int i,j=s.length(),c=0;
        for(i=0;i<j;i++)
        {
            char cha=s.charAt(i);
            if(cha==ch)
            {
                c=c+1;
            }
        }
        System.out.println(c+ " times the character occurs" );
            
    }
}
