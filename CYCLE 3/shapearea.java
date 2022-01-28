// PROGRAM TO FIND THE AREA OF THE SHAPES: RECTANGLE , CIRCLE AND TRIANGLE 
import java.util.*;
class shapearea
{
    public static void main(String agrs[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the lenghth and breadth of the recatngle");
        int l = obj.nextInt();
        int b = obj.nextInt();
        System.out.println("Enter the radius of the circle");
        int r = obj.nextInt();
        System.out.println("Enter the height and base of the triangle:");
        double base = obj.nextDouble();
        double h =obj.nextDouble();
        Second dimension = new Second();
        dimension.area( l, b);
        dimension.area(r);
        dimension.area(base,h);
    }
}
class Second
{
    void area(int l, int b)
    {
        int a=l*b;
        System.out.println("Area of the rectangle is  "+a);
    }
    void area(double r)
    {
        
        double a = 3.14*r*r;
        System.out.println("Area of the circle is  "+a);
    }
    void area(double base, double h)
    {
        double A= base*h/2;
        System.out.println("Area of the triangle is  "+A);
    }
}
