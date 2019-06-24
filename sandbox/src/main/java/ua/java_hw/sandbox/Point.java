package ua.java_hw.sandbox;

public class Point {

  double x;
  double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /*public static double distance(Point p1, Point p2) {
    double xSquare = Math.pow((p2.x - p1.x), 2);
    double ySquare = Math.pow((p2.y - p1.y), 2);
    double result = Math.sqrt(xSquare + ySquare);
    return result;
  }
  */

  public double distance2(Point p2){
    return Math.sqrt((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y));
  }
}

