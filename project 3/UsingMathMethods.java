/**
*Simple program to solve expression. 
*
*Project 02
*Name: Jack Ryan Fulford - COMP 1210 - Sections 2.1-2.11
*Date: September 9, 2021
*/
import java.text.DecimalFormat;
import java.util.Scanner;
/**
*public class to find the result of an expression.
*/
public class UsingMathMethods {
/**
*Solves the expression.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      double x = 0.0;
   
      System.out.print("Enter a value for x: ");
      x = scanner.nextDouble();
      double numerator = Math.pow(x, 4) * 8
         + Math.sqrt(Math.abs(Math.pow(x, 3) * 4 + Math.pow(x, 2) * 4
         + x * 4 + 4));
      double denominator = 4 + Math.abs(x);
   
      double result = numerator / denominator;
      System.out.println("Result: " + result);
      
      String resultStr = Double.toString(result); 
     
      int position = resultStr.indexOf(".");
      int leftCharacterCount = position;
      int rightCharacterCount = resultStr.length() - position - 1;
   
      System.out.println("# of characters to left of decimal "
         + "point: " + leftCharacterCount);
      System.out.println("# of characters to right of decimal "
         + "point: " + rightCharacterCount);
      String pattern = "#,##0.0##";
      DecimalFormat formatter = new DecimalFormat(pattern);
      String formattedResult = formatter.format(result);
      System.out.println("Formatted Result: " + formattedResult);
   }
}