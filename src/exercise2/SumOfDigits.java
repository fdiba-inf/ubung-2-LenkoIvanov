package exercise2;

import java.util.Scanner;

public class SumOfDigits{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number from 0 to 999: ");
    int number = input.nextInt();

  
    if(number < 0 || number > 999){
      System.out.println("Invalid number!");
    }
    else{
      int d1 = number % 10;
      number = number/10;
      int d2 = number % 10;
      number = number/10;
      int d3 = number % 10;

      int sum = d1 + d2 + d3;
      System.out.println("Sum of digits: " + sum);
    }
 
  }
}
