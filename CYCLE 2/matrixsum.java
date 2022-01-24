import java.util.*;
class matrixsum
{
    public static void main(String agrs[])
    {
        int a[][]= new int[10][10];
        int b[][]= new int[10][10];
        int i , j, r,c ;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no: of rows and columns ");
        r = num.nextInt();
        c = num.nextInt();
        System.out.println("Enter the elements of the first matrix a");
        for(i=0;i<r;i++)
          for(j=0;j<c;j++)
              a[i][j]= num.nextInt();
        System.out.println("Enter the elements of the second matrix b");
        for(i=0;i<r;i++)
             for(j=0;j<c;j++)
                b[i][j]= num.nextInt();
        int sum[][]=new int[10][10];
        for(i=0;i<r;i++)
         for(j=0;j<c;j++)
            sum[i][j]=a[i][j]+b[i][j];
        System.out.println("Resultant matrix is :");
        for(i=0;i<r;i++)
        {
            System.out.print("\n"); 
                for(j=0;j<c;j++)
                    System.out.print("\t" +sum[i][j]); 
        }                     
    }
}
