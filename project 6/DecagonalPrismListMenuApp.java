import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
*Creates menu app.
*
*Project 6.
* @author Jack Ryan Fulford
* @version 9/29/21
*/
public class DecagonalPrismListMenuApp {
/**
*main.
*
 * @param args - is not used.
 * @throws FileNotFoundException if the file can't opened.
 */
   public static void main(String[] args) throws FileNotFoundException {
   
      String dListName = "*** no list name assigned ***";
      ArrayList<DecagonalPrism> myList = new ArrayList<DecagonalPrism>();
      DecagonalPrismList myDList = new DecagonalPrismList(dListName, myList);
      String fileName = "no file name";
      
      String label;
      double edge;
      double height;
      
      String code = "";
   
      Scanner scan = new Scanner(System.in);
   
      System.out.println("DecagonalPrism List System Menu\n"
         + "R - Read File and Create DecagonalPrism List\n"
         + "P - Print DecagonalPrism List\n"
         + "S - Print Summary\n"
         + "A - Add DecagonalPrism\n"
         + "D - Delete DecagonalPrism\n"
         + "F - Find DecagonalPrism\n"
         + "E - Edit DecagonalPrism\n"
         + "Q - Quit");
         
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
            
               myDList = myDList.readFile(fileName);
            
               System.out.println("\tFile read in and DecagonalPrism "
                  + "List created\n");
                  
               break;
               
            case 'P':
            
               System.out.println("\n" + myDList);
               break;
               
            case 'S':
               
               System.out.println("\n" + myDList.summaryInfo());
               break;
               
            case 'A':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               myDList.addDecagonalPrism(label, edge, height);
               System.out.println("\t*** DecagonalPrism added ***\n");
               break;
               
            case 'D':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myDList.deleteDecagonalPrism(label) != null) {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (myDList.findDecagonalPrism(label) != null) {
                  System.out.println(myDList.findDecagonalPrism(label) + "\n");
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'E':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
            
               if (myDList.editDecagonalPrism(label, edge, height)) {
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q':
               break;   
               
            default:
               System.out.print("\t*** invalid code ***\n\n"); 
               break;
         }
      } while (!code.equalsIgnoreCase("Q"));
   }  
}