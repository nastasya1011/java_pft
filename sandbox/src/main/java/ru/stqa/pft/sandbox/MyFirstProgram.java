package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    Point p1 = new Point (2.0, 8.0);
    Point p2 = new Point (3.0, 7.0);

    System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + distance(p1,p2) );


    //hello("Nastya");

    //Square s = new Square(5);
   // System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

   // Rectangle r = new Rectangle(4,6);
    //System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
  }

  //public static void hello(String somebody) {
  // System.out.println("Hello," + somebody + "!");
  //}

  public static double distance (Point p1, Point p2) {
    double diffX = p1.x - p2.x;
    double diffY = p1.y - p2.y;

    return Math.sqrt (Math.pow(diffX, 2) + Math.pow(diffY, 2));
  }


}