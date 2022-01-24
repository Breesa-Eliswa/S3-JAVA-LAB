import java.util.*;
class replace
{
    public static void main(String agrs[])
    {
        int i , n, key ;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no: of elements");
        n = num.nextInt();
        int a[] = new int[10];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=num.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println(+a[i]);
        }
        System.out.println("Enter the element to be replaced:");
        key = num.nextInt();
        System.out.println("Enter the new element to be placed:");
        int elt = num.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==key)
              {
                  a[i]=elt;
              }
        }
        System.out.println("NEW ARRAY IS :");
        for(i=0;i<n;i++)
        {
            System.out.println(+a[i]);
        }


    }
}
