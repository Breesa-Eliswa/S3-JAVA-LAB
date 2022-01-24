import java.util.*;
class trace 
{
    public static void main(String agrs[])
    {
        int r , c, i ,j , sum=0 ;
        Scanner num = new Scanner (System.in);
        int a[][]= new int [10][20];
        System.out.println("Enter the no: of rows and columns : \n ");
        r = num.nextInt();
        c = num.nextInt();
      
        System.out.println("Enter the elements in the matrix \n ");
        for(i=0;i<r;i++)
           for(j=0;j<c;j++)
           {
               a[i][j]=num.nextInt();
           }
      
        if (r==c) 
        {
           for(i=0;i<r;i++)
              for(j=0;j<c;j++) 
                if (i==j)
                     sum= sum+a[i][j];
                     
        System.out.println("The sum of the diagonal elements = "  +sum);    
        }
        
        else
             System.out.println("Matrix is not a square matrix");
    }

}
