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
   public static void main(String[] args) throws FileNotFoundException { 	
      if (0 < args.length) {
         AirTicketProcessor atfile = new AirTicketProcessor();	
         try {
            atfile.readAirTicketFile(args[0]);
            System.out.println(atfile.generateReport());
            System.out.println(atfile.generateReportByFlightNum());
            System.out.println(atfile.generateReportByItinerary());  
            System.out.println(atfile.generateReportForInvalidInput());
         }
         catch (FileNotFoundException e) {
            System.out.println("*** File not found."
                                + "\n Program ending.");
         }
      }
      
      else {
         System.out.println("*** File name not provided by command "
                   + "line argument.\n Program ending.");
      }
   }
   
}