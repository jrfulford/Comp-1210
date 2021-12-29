import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*Creates an ArrayList of objects.
*
*Project 5.
* @author Jack Ryan Fulford
* @version 9/22/21
*/
public class DecagonalPrismList {
//instance variables
   private String listName = "";
   private ArrayList<DecagonalPrism> prismList 
      = new ArrayList<DecagonalPrism>();
/**
*constructor.
*
* @param listNameIn used.
* @param listIn used.
*/
   public DecagonalPrismList(String listNameIn,
      ArrayList<DecagonalPrism> listIn) {
      listName = listNameIn;
      prismList = listIn;
   }
//methods
 /**
 *Gets the name of the list.
 *
 *@return String.
 */
   public String getName() {
      return listName;
   }
/**
   *Counts Decogonal Prisms in list.
   *
   *@return returns the int.
   */
   public int numberOfDecagonalPrisms() {
      if (prismList.size() > 0) {
         return prismList.size();
      }
      else {
         return 0;
      }
   }
   /**
   *Calculates total surface area of decagonal prisms.
   *
   *@return returns the double.
   */
   public double totalSurfaceArea() {
      int index = 0;
      double totalSurfaceArea = 0;
      if (prismList.size() > 0) {
         while (index < prismList.size()) {
            totalSurfaceArea 
               += prismList.get(index).surfaceArea();
            index++;
         }
         return totalSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates total base area of decagonal prisms.
   *
   *@return returns the double.
   */
   public double totalBaseArea() {
      int index = 0;
      double totalBaseArea = 0;
      if (prismList.size() > 0) {
         while (index < prismList.size()) {
            totalBaseArea 
               += prismList.get(index).baseArea();
            index++;
         }
         return totalBaseArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates total lateral surface area of decagonal prisms.
   *
   *@return returns the double.
   */
   public double totalLateralSurfaceArea() {
      int index = 0;
      double totalLateralSurfaceArea = 0;
      if (prismList.size() > 0) {
         while (index < prismList.size()) {
            totalLateralSurfaceArea 
               += prismList.get(index).lateralSurfaceArea();
            index++;
         }
         return totalLateralSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates total volume of decagonal prisms.
   *
   *@return returns the double.
   */
   public double totalVolume() {
      int index = 0;
      double totalVolume = 0;
      if (prismList.size() > 0) { 
         while (index < prismList.size()) {
            totalVolume += prismList.get(index).volume();
            index++;
         }
         return totalVolume;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates average surface area of decagonal prisms.
   *
   *@return returns the double.
   */
   public double averageSurfaceArea() {
      if (prismList.size() > 0) {
         double averageSurfaceArea = 0;
         averageSurfaceArea = totalSurfaceArea() 
            / (prismList.size());
         return averageSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates average volume of decagonal prisms.
   *
   *@return returns the double.
   */
   public double averageVolume() {
      if (prismList.size() > 0) {
         double averageVolume = 0;
         averageVolume = totalVolume() 
            / (prismList.size());
         return averageVolume;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Creates a string of decagonal prisms.
   *
   *@return returns the String.
   */
   public String toString() {
      int index = 0;
      String output = listName + "\n"; 
      while (index < prismList.size()) {
         output += "\n" + prismList.get(index).toString() + "\n";
         index++;
      }
      return output;
   }
   /**
   *Creates a string of calculated information.
   *
   *@return returns the String.
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName + " -----\n";
      output += "Number of Decagonal Prisms: " + numberOfDecagonalPrisms() 
         + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      output += "Total Base Area: " + df.format(totalBaseArea()) + "\n";
      output += "Total Lateral Surface Area: "
         + df.format(totalLateralSurfaceArea()) + "\n";
      output += "Total Volume: " + df.format(totalVolume()) + "\n";
      output += "Average Surface Area: " + df.format(averageSurfaceArea()) 
         + "\n";
      output += "Average Volume: " + df.format(averageVolume()) + "\n"; 
      return output;
   }
}