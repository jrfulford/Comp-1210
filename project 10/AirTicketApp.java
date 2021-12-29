import java.io.FileNotFoundException;  	
   /**	  	
   *   main driver program.  	
   *   	  	
   *   @author Jack Ryan Fulford	  	
   *   @version 11/11/21	  	
   */  	
public class AirTicketApp  	
{	  	
 /**	  	
 *  outputs file in 3 ways.	  	
 *  @param args Did not use command line argument.	  	
 *  @throws FileNotFoundException if file is typed wrong or not found.	  	
 */	  	
   public static void main(String[] args) throws FileNotFoundException	  	
   {	  	
      String fileName = null;	  	
      if (args.length > 0) {	  	
         fileName = args[0];	  	
      } else {	  	
         System.out.println("File name expected as command line argument."
             + "\nProgram ending.");	  	
      }	  	
      AirTicketProcessor atfile = new AirTicketProcessor();	  	
      if (fileName != null) {	  	
         atfile.readAirTicketFile(fileName);	  	
         System.out.print(atfile.generateReport());	  	
         System.out.print(atfile.generateReportByFlightNum());	  	
         System.out.print(atfile.generateReportByItinerary());	  	
      }	  	
   }	  	
}