import java.util.*;
class Shapeperimeter
{
    public static void main(String agars[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the lenghth and breadth of the rectangle: ");
        int l=obj.nextInt();
        int b =obj.nextInt();
        System.out.println("Enter the radius of the circle: ");
        int r = obj.nextInt();
        Perimeter dimension = new Perimeter(l,b);
        dimension  = new Perimeter(r);
    }
}
class Perimeter
{
    Perimeter(int a, int b)
    {
        int p = 2*(a+b);
        System.out.println("PERIMETER OF THE RECTANGLE IS  "+p+ " UNITS");
    }
    Perimeter(double r)
    {
        double p = 6.28*r;
        System.out.println("PERIMETER OF THE CIRCLE IS  "+p+" UNITS");
    }
}
