/**
*Simple program to find 2 variables.
*
*Project 02
*Name: Jack Ryan Fulford - COMP 1210 - Sections 2.1-2.11
*Date: September 2, 2021
*/
import java.util.Scanner;

/**
*public class to find x and y.
*/
public class TwoVariableExpression
{
/**
*Finds two variables.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x = 0;
      double y = 0;
      double result = 0;
      
      //print expression
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      if (x * y == 0)
      {
         System.out.print("result is \"undefined\"");
      }
      else
      { 
         result = (4.5 * x + 12.5) * (3 * y - 9.0) / (x * y);
         System.out.print("result = ");
         System.out.println(result);
      }
      
   }
}
