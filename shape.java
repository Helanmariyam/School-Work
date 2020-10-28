abstract class Shape1
{
  abstract void numberOfSides();
}
class Rectangle extends Shape1
{
  void numberOfSides()
  {
       System.out.println("Number of sides for rectangle is four");
  }
}
  class Triangle extends Shape1
{
    void numberOfSides()
    {
     System.out.println("Number of sides for triangle is three");
    }
}
  class Hexagon extends Shape1
  {
      void numberOfSides()
      {
          System.out.println("Number of sides for hexagon is six");
      }
  }

class Shape
{
    public static void main(String args[])
    {
        Shape1 ob1=new Rectangle();
        Shape1 ob2=new Triangle();
        Shape1 ob3=new Hexagon();
        ob1.numberOfSides();
        ob2.numberOfSides();
        ob3.numberOfSides();
    }
}
