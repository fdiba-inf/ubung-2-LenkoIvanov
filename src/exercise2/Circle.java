package exercise2;

import java.util.Scanner;

public class Circle{
  public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the radius: ");
      double radius = input.nextDouble();

      double circ = 2.0 * Math.PI * radius;
      double area = Math.PI * (radius * radius);

      System.out.println("Circumference: " + circ);
      System.out.println("Area: " + area);


  }
}