/**
*Simple program to find time in seconds
*
*Project 02
*Name: Jack Ryan Fulford - COMP 1210 - Sections 2.1-2.11
*Date: September 2, 2021
*/
import java.util.Scanner;

/**
*public class to find time in seconds.
*/
public class TimeInSeconds
{
/**
*Finds two variables.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) 
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int inseconds, outseconds, days, hours, minutes;
     
      System.out.print("Enter the raw time in seconds: ");
      inseconds = userInput.nextInt();
      
      if (inseconds < 0)
      {
         System.out.println("*** Time must be non-negative. ***");
      }
      else
      {
         System.out.println("");
         System.out.println("Time by combined days, hours, minutes, seconds:");
         days = inseconds / 86400;
         System.out.println("\tdays: " + days);
         hours = (inseconds % 86400) / 3600;
         System.out.println("\thours: " + hours);
         minutes = (inseconds % 86400) % 3600 / 60;
         System.out.println("\tminutes: " + minutes);
         outseconds = inseconds % 60;
         System.out.println("\tseconds: " + outseconds);
         System.out.println("");
      
         System.out.println(inseconds + " seconds = " + days
            + " days, " + hours
            + " hours, "
            + minutes + " minutes, "
            + outseconds + " seconds");
            
      }
   }
}