import java .util.*;
class secondlargest
{
    public static void main(String agrs[])
    {
        int i , j , r , c, large=0, seclarge=0 ;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no: of rows and columns");
        r = num.nextInt();
        c = num.nextInt();
      
        int a[][]=new int[10][10];
      
        System.out.println("Enter the elemnts of the matrix");
        for(i=0;i<r;i++)
          for(j=0;j<c;j++)
             a[i][j] = num.nextInt();
        large = a[0][0];
      
        for(i=0;i<r;i++)
          for(j=0;j<c;j++)
            if(a[i][j]>large)
                large = a[i][j];
      
        for(i=0;i<r;i++)
          for(j=0;j<c;j++)
            if(a[i][j]>seclarge && a[i][j]<large)
                  seclarge=a[i][j];    
      
        System.out.println("The second largest element in the array is  " +seclarge);             
    
    }
}

