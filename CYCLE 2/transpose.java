import java.util.*;
class transpose
{
    public static void main(String agrs[])
    {
        int i , j,r,c ;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no: of rows and columns : ");
        r = num.nextInt();
        c = num.nextInt();
      
        int matrix[][] = new int [10][10];
        int tmatrix[][] = new int [10][10];
        
        System.out.println("Enter the matrix elements");
        for(i=0;i<r;i++)
          for(j=0;j<c;j++)
               matrix[i][j] = num.nextInt();
               
        for(i=0;i<r;i++) 
           for(j=0;j<c;j++)
               tmatrix[i][j] = matrix[i][j];
               
        for(i=0;i<c;i++)
        {
          for(j=0;j<r;j++)
              System.out.print("\t"  +tmatrix[j][i]);
          System.out.println("\n");  
        }  
      
    }
}
