package exercise2;

import java.util.Scanner;

public class Circle{
  public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the radius: ");
      double radius = input.nextDouble();

      double circ = 2 * 3.14 * radius;
      double area = 3.14 * (radius * radius);

      System.out.println("Circumference: " + circ);
      System.out.println("Area: " + area);


  }
}