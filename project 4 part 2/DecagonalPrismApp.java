import java.util.Scanner;
/**
 * Calculates information of a Decagonal Prism.
 *
 * Project 04
 * @author Jack Ryan Fulford - COMP1210
 * @version 9/16/21
 */
public class DecagonalPrismApp {
/**
 * Creates prompts for user inputs of variables then calculates
 * the Decagonal Prism information.
 *
 * @param args Command line arguments - not used
 */
   public static void main(String[] args) {
    // Scanner
      Scanner user = new Scanner(System.in);
      DecagonalPrism prism = new DecagonalPrism("", 0, 0);
    // Initial prompt
      System.out.println("Enter label, edge, "
         + "and height for a decagonal prism.");
    // Label prompt
      System.out.print("\tlabel: ");
    // Defines label variable
      String label = user.nextLine();
      prism.setLabel(label);
    // Edge prompt
      System.out.print("\tedge: ");
    // Defines edge variable
      double edge = Double.parseDouble(user.nextLine());
      prism.setEdge(edge);
    // if edge is invalid
      if (!prism.setEdge(edge)) {
         System.out.println("Error: edge must be non-negative.");
         return;
      }
    // Height prompt
      System.out.print("\theight: ");
    // Defines height variable
      double height = Double.parseDouble(user.nextLine());
      prism.setHeight(height);
    // if height is valid
      if (!prism.setHeight(height)) {
         System.out.println("Error: height must be non-negative.");
         return;
      }
    // Print information
      System.out.println(prism);
   }
}