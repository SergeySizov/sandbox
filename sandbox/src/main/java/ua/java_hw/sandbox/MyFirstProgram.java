package ua.java_hw.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {
    /*Point firstPoint = new Point(3, 2);
    Point secondPoint = new Point(7, 8);
    double distance = MyFirstProgram.distance(firstPoint, secondPoint);
    System.out.println("Distance between 2 points is: " + distance);
    distance = Point.distance(firstPoint, secondPoint);
    System.out.println("Distance between 2 points from Point class is: " + distance);*/

    Point p1 = new Point(3, 2);
    Point p2 = new Point(7, 8);
    System.out.println("Расстояние между точками " + p1.x + ";" + p1.y + " и " + p2.x + ";" + p2.y + " = " + p1.distance2(p2));
  }

  /*public static double distance(Point p1, Point p2) {
    double xSquare = Math.pow((p2.x - p1.x), 2);
    double ySquare = Math.pow((p2.y - p1.y), 2);
    double result = Math.sqrt(xSquare + ySquare);
    return result;*/
}