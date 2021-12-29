/**
*Provides two methods for division.
*
*Activity 11.
*Jack Ryan Fulford
*11/15/21.
*/
public class Division {

//methods

/**
*performs integer division.
*
*@param numerator used.
*@param denominator used.
*@return int.
*/
   public static int intDivide(int numerator, int denominator) {
   
      try {
      
         return numerator / denominator;
      
      }
      
      catch (ArithmeticException e) {
      
         return 0;
      
      }
   
   }

/**
*performs floating point division.
*
*@param numerator used.
*@param denominator used.
*@return float.
*@throws IllegalArgumentException yes
*/
   public static float decimalDivide(int numerator, int denominator) {
   
      if (denominator == 0) {
      
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      
      }
      return (float) numerator / (float) denominator;
   
   }
}