import java.util.*;
class product
{
    public static void main(String agrs[])
    {
        int a[][]= new int[10][10];
        int b[][]= new int[10][10];
        int i , j, r1,c1,r2,c2,k ;
        Scanner num = new Scanner(System.in);
        System.out.println(" While multiplying 2 matrices the column of first matrix(c1) must be equal to the row (r2) of the second matrix");
      
        System.out.println("Enter the no: of rows and columns of the first matrix a : ");
        r1 = num.nextInt();
        c1 = num.nextInt();
      
        System.out.println("Enter the elements of the first matrix a");
        for(i=0;i<r1;i++)
          for(j=0;j<c1;j++)
              a[i][j]= num.nextInt();
      
        System.out.println("Enter the no: of rows and columns of the second matrix b : ");
         r2 = num.nextInt();
         c2 = num.nextInt();
      
        System.out.println("Enter the elements of the first matrix b");
         for(i=0;i<r2;i++)
            for(j=0;j<c2;j++)
                b[i][j]= num.nextInt(); 
      
        int result[][] = new int [10][10];
        for(i=0;i<r1;i++)
           for(j=0;j<c2;j++)
               result[i][j]=0;
      
        for(i=0;i<r1;i++)
          for(j=0;j<c2;j++)
            for(k=0;k<c1;k++)
              result[i][j]=result[i][j]+(a[i][k]*b[k][j]);
      
        for(i=0;i<r1;i++)
        {
          System.out.println("\n");
          for(j=0;j<c2;j++)
             System.out.print("\t" +result[i][j]);
        }     
                   
    }
}
