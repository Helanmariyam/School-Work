class Area1
{
    double Area1 (int l, int b)
    {
        return l*b;
    }
    float Area1 (float r)
    {
        return (float) (3.14*r*r);
    }
    double Area1 (double a,double h)
    {
        return 0.5*a*h;
    }
}
public class abcd 
{
    public static void main(String args[])
    {
        Area1 Area = new Area1();
        double Rectangle;
        Rectangle = Area.Area1(5,2);
        System.out.println("Area of rectangle is "+Rectangle);
        float circle;
        circle = Area.Area1((float)3.2);
        System.out.println("Area of circle is "+circle);
        double triangle;
        triangle=Area.Area1(5.0,3.0);
        System.out.println("Area of triangle is "+triangle);
    }
}

