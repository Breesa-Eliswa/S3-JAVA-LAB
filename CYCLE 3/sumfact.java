// PROGRAM TO FIND THE FACTORAIL AND SUM OF THE DIGITS OF A GIVEN NUMBER
import java.util.*;
class sumfact
{
      int i ;
      public static void main (String args[])
      {
          int  num  ;
          Scanner obj = new Scanner(System.in);
          sumfact data = new sumfact();
          System.out.println("Enter the number whose sum of the digits and fatorial is to be found");
          num=obj.nextInt();
          data.sum(num);
          data.factorial(num);
      }
     void sum(int num)
      {
        int sum=0;
        while(num!=0)
         {
              int rem=num%10;
              sum=sum+rem;
              num=num/10;
         }
        System.out.println("The sum of the digits of the number is  "+sum);
      }
      void factorial(int num )
      {
          int fact =1;
          for(i=1;i<=num;i++)
          {
              fact=fact*i;
          }
          System.out.println("Factorial of a given number is  "+fact);
      }   
}
