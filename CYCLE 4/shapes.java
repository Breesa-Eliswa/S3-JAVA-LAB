abstract class Shape
{
    abstract void numberOfSides();
}

class Rectangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("No of sides of rectangle is 4");
    }
}

class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("No of sides of triangle is 3");
    }
}

class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("No of sides of hexagon is 6");
    }
}

class shapes
{
   public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.numberOfSides();
        Triangle t = new Triangle();
        t.numberOfSides();
        Hexagon h = new Hexagon();
        h.numberOfSides();
    }
 }
