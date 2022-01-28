import java.util.*;
class FR
{
    int i ,len; 
    public static void main(String agrs[])
    {
        String str;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str= object.nextLine();
        int len=str.length();
        char a[]=new char[len];
        for(int i=0;i<len;i++)
        {
            a[i]=str.charAt(i);
        }
        Strings data=new Strings();
        data.frequency(a,len);
        data.reverse(a,len);
    }
    
}   
class Strings
{
    void frequency(char a[],int len)
    {
        int i , c=0;
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter the character whose frequency is to be found:");
        char y =obj2.next().charAt(0);
        for(i=0;i<len;i++)
        {
            if(a[i]==y)
            {
                c=c+1;
            }
        }
        System.out.println(c+ "  times the character occurs ");
    }
    void reverse(char a[], int n)
    {
        char b[]=new char[20];
        int i , m =n-1;
        for(i=0;i<n;i++,m--)
        {
            b[i]=a[m];
        }
        System.out.println("Reversed string is");
        for(i=0;i<n;i++)
        {
            System.out.print(b[i]);
        }
    }
}
        


