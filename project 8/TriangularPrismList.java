import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
*Creates triangular prism list.
*
*Project 8.
* @author Jack Ryan Fulford
* @version 10/27/21
*/
public class TriangularPrismList {
//instance variables
   private String listName = "";
   private TriangularPrism[] prismList;
   private int numberOfTriangularPrisms;
 /**
   *TriangularPrismList constructor.
   *
   *@param listNameIn used.
   *@param listIn used.
   *@param numberOfTriangularPrismsIn used.
   */
   public TriangularPrismList(String listNameIn, 
      TriangularPrism[] listIn, int numberOfTriangularPrismsIn) {
      listName = listNameIn;
      prismList = listIn;
      numberOfTriangularPrisms = numberOfTriangularPrismsIn;
   }
 //methods
 /**
 *Gets list name.
 *
 *@return String.
 */
   public String getName() {
      return listName;
   }
   /**
   *Counts number of TriangularPrisms.
   *
   *@return int.
   */
   public int numberOfTriangularPrisms() {
      if (numberOfTriangularPrisms > 0) {
         return numberOfTriangularPrisms;
      }
      else {
         return 0;
      }
   }
   /**
   *Computes total surface area.
   *
   *@return double.
   */
   public double totalSurfaceArea() {
      int index = 0;
      double totalSurfaceArea = 0;
      if (numberOfTriangularPrisms > 0) {
         while (index < numberOfTriangularPrisms) {
            totalSurfaceArea 
               += prismList[index].surfaceArea();
            index++;
         }
         return totalSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Computes total volume.
   *
   *@return double.
   */
   public double totalVolume() {
      int index = 0;
      double totalVolume = 0;
      if (numberOfTriangularPrisms > 0) { 
         while (index < numberOfTriangularPrisms) {
            totalVolume += prismList[index].volume();
            index++;
         }
         return totalVolume;
      }
      else {
         return 0.0;
      }
   
   }
   /**
   *Computes average surface area.
   *
   *@return double.
   */
   public double averageSurfaceArea() {
      if (numberOfTriangularPrisms > 0) {
         double averageSurfaceArea = 0;
         averageSurfaceArea = totalSurfaceArea() 
            / (numberOfTriangularPrisms);
         return averageSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Computes average volume.
   *
   *@return double
   */
   public double averageVolume() {
      if (numberOfTriangularPrisms > 0) {
         double averageVolume = 0;
         averageVolume = totalVolume() 
            / (numberOfTriangularPrisms);
         return averageVolume;
      }
      else {
         return 0.0;
      }
   }
   /**
   *creates string of TriangularPrisms.
   *
   *@return String.
   */
   public String toString() {
      int index = 0;
      String output = "" + listName + "\n"; 
      while (index < numberOfTriangularPrisms) {
         output += "\n" + prismList[index].toString() + "\n";
         index++;
      }
      return output;
   }
   /**
   *creates string of all info.
   *
   *@return String.
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName + " -----\n";
      output += "Number of TriangularPrisms: " + numberOfTriangularPrisms() 
         + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      output += "Total Volume: " + df.format(totalVolume()) + "\n";
      output += "Average Surface Area: " + df.format(averageSurfaceArea()) 
         + "\n";
      output += "Average Volume: " + df.format(averageVolume()) + "\n"; 
      return output;
   }
   /**
   *returns list.
   *
   *@return Array.
   */
   public TriangularPrism[] getList() {
      return prismList;
   }
   /**
   *reads file and creates list.
   *
   *@return Array.
   *@param fileNameIn used.
   *@throws FileNotFoundException required by Scanner for file.
   */
   public TriangularPrismList readFile(String fileNameIn) 
      throws FileNotFoundException {
   
      String label = "";
      double edge = 0;
      double height = 0;
      Scanner scanFile = new Scanner(new File(fileNameIn));
      TriangularPrism[] myList = new TriangularPrism[100];
      String tListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         TriangularPrism t = new TriangularPrism(label, edge, height);
         myList[numberOfTriangularPrisms] = t;
         numberOfTriangularPrisms++;
      }
      
      TriangularPrismList myTriangularPrismList 
         = new TriangularPrismList(tListName, myList, numberOfTriangularPrisms);
         
      return myTriangularPrismList;
   }
   /**
   *adds to list.
   *
   *@param labelIn used.
   *@param edgeIn used.
   *@param heightIn used.
   */
   public void addTriangularPrism(String labelIn, double edgeIn,
      double heightIn) {
      
      TriangularPrism t = new TriangularPrism(labelIn, edgeIn, 
         heightIn);
      
      prismList[numberOfTriangularPrisms] = t;
      numberOfTriangularPrisms++;
   }
   /**
   *finds TriangularPrism in List.
   *
   *@param labelIn used.
   *@return TriangularPrism.
   */
   public TriangularPrism findTriangularPrism(String labelIn) {
     
   
      for (int i = 0; i < numberOfTriangularPrisms; i++) {
         if (labelIn.equalsIgnoreCase(prismList[i].getLabel())) {
            return prismList[i];
         }
      }
      return null;
   }
   /**
   *finds and deletes from List.
   *
   *@param labelIn used.
   *@return TriangularPrism.
   */
   public TriangularPrism deleteTriangularPrism(String labelIn) {
   
      for (int i = 0; i < numberOfTriangularPrisms; i++) {
      
         if (prismList[i].getLabel().equalsIgnoreCase(labelIn)) {
         
            TriangularPrism t = prismList[i];
            
            for (int j = i; j < numberOfTriangularPrisms - 1; j++) {
            
               prismList[j] = prismList[j + 1];
            }
            
            prismList[numberOfTriangularPrisms - 1] = null;
            numberOfTriangularPrisms--;
            return t;
         }
      }
      
      return null;
   
   
   } 
   /**
   *finds and edits in List.
   *
   *@param labelIn used.
   *@param edgeIn used.
   *@param heightIn used.
   *@return boolean.
   */
   public boolean editTriangularPrism(String labelIn, double edgeIn,
      double heightIn) {
      
      boolean result = false;
      
      for (int i = 0; i < numberOfTriangularPrisms; i++) {
         if (prismList[i].getLabel().equalsIgnoreCase(labelIn)) {
            prismList[i].setEdge(edgeIn);
            prismList[i].setHeight(heightIn);
            result = true;
         }
      }
      return result;
   }
/**
*finds the largest volume.
*
*@return TriangularPrism.
*/
   public TriangularPrism findTriangularPrismWithLargestVolume() {
   
      if (numberOfTriangularPrisms <= 0) {
      
         return null;
      }
      
      TriangularPrism largestVolume = prismList[0];
      int index = 0;
      while (index < numberOfTriangularPrisms) {
         if (largestVolume.volume() < prismList[index].volume()) {
            largestVolume = prismList[index];
         }
         index++;  
      }   
      
      return largestVolume;
   
   
   }

}