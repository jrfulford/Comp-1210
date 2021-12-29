import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* Decagonal Prism list app.
*
* Project 5
* @author Jack Ryan Fulford
* @version 9/22/21
*/
public class DecagonalPrismListApp {
/**
*Reads file info.
*
* @param args - not used.
* @throws FileNotFoundException needed for file.
*/
   public static void main(String[] args) throws FileNotFoundException {
      String label = "";
      double edge = 0;
      double height = 0;
      
      ArrayList<DecagonalPrism> myList
         = new ArrayList<DecagonalPrism>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         DecagonalPrism d = new DecagonalPrism(label, edge, height);
         myList.add(d);
      }
      scanFile.close();
      DecagonalPrismList myDecagonalPrismList 
         = new DecagonalPrismList(listName, myList);
   
      System.out.println("\n" + myDecagonalPrismList);
      System.out.println("\n" + myDecagonalPrismList.summaryInfo());
   }
}