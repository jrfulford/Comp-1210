import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
* air ticket processor.
*
* @author Jack Ryan Fulford
* @version 11/11/21
*/
public class AirTicketProcessor {
   
   private AirTicket[] airTickets;
   private String[] invalidRecord;
   
   /**
   * constructor.
   */
   public AirTicketProcessor() {
      airTickets = new AirTicket[0];
      invalidRecord = new String[0];
   }
   /** 
   * get air ticket array.
   * @return air tickets
   */
   public AirTicket[] getTickets() {
      return airTickets;
   }
   /** 
   * get invalid record array.
   * @return invalid records
   */
   public String[] getInvalidInput() {
      return invalidRecord;
   }
   /** 
   * adds air ticket.
   * @param airTicketIn air ticket
   */
   public void addAirTicket(AirTicket airTicketIn) {
      airTickets = Arrays.copyOf(airTickets, airTickets.length + 1);
      airTickets[airTickets.length - 1] = airTicketIn;
   }
   /** 
   * adds invalid record.
   * @param invalidRecordIn invalid record
   */
   public void addInvalidRecord(String invalidRecordIn) {
      invalidRecord = Arrays.copyOf(invalidRecord, invalidRecord.length + 1);
      invalidRecord[invalidRecord.length - 1] = invalidRecordIn;
   }
   
   /** 
   * reads air ticket file.
   * @param fileName string
   * @throws FileNotFoundException file not found
   */ 
   public void readAirTicketFile(String fileName) 
                  throws FileNotFoundException {
      char category;
      Scanner fileScan = new Scanner(new File(fileName));
      
      while (fileScan.hasNext())
      {
         String line = fileScan.nextLine();
         Scanner lineScan = new Scanner(line).
                  useDelimiter(",");
         while (lineScan.hasNext())
         {
            String flightNum;
            Itinerary i;
            AirTicket t;
            category = (lineScan.next()).charAt(0);
            try
            {
               switch (category)
               {
                  case 'B':
                     flightNum = lineScan.next();
                     i = new Itinerary(lineScan.next(), lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                 
                     t = new Business(flightNum, i,
                        Double.parseDouble(lineScan.next()), 
                           Double.parseDouble(lineScan.next()), 
                              Double.parseDouble(lineScan.next()), 
                                 Double.parseDouble(lineScan.next())); 
                                 
                  
                     addAirTicket(t);
                  
                     break;     
                  case 'E':
                     flightNum = lineScan.next();
                     i = new Itinerary(lineScan.next(),
                            lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                    
                     t = new Economy(flightNum, i,
                        Double.parseDouble(lineScan.next()),
                        Double.parseDouble(lineScan.next()));
                  
                     addAirTicket(t);
                     break;      
                  case 'F':
                     flightNum = lineScan.next();
                     i = new Itinerary(lineScan.next(),
                            lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                    
                                    
                     t = new Elite(flightNum, i,
                        Double.parseDouble(lineScan.next()), 
                           Double.parseDouble(lineScan.next()),
                              Double.parseDouble(lineScan.next()), 
                                 Double.parseDouble(lineScan.next()), 
                                    Double.parseDouble(lineScan.next())); 
                  
                     addAirTicket(t);
                     break;
                  case 'N':
                     flightNum = lineScan.next();
                     i = new Itinerary(lineScan.next(),
                            lineScan.next(),
                               lineScan.next(),
                                 lineScan.next(),
                                    Integer.parseInt(lineScan.next()));
                                    
                     t = new NonRefundable(flightNum, i,
                        Double.parseDouble(lineScan.next()), 
                           Double.parseDouble(lineScan.next()), 
                              Double.parseDouble(lineScan.next())); 
                              
                     addAirTicket(t);
                     break;
                  default:
                     if (lineScan.hasNext())
                     {
                        lineScan.nextLine(); 
                     }
                     throw new InvalidCategoryException(Character.
                                          toString(category));
               }
            }
            catch (InvalidCategoryException e) {
               String  result = e + " in: " + line;
               addInvalidRecord(result);               
            }
            catch (NumberFormatException nfe) {
               if (lineScan.hasNext())
               {
                  lineScan.nextLine(); 
               }
               String  result = nfe + " in: " + line;
               addInvalidRecord(result);               }
         }
      } 
   } 
    /**
 * generates report.
* @return to return the report
*/
   public String generateReport() {  	
      String report = "";  	
   
      for (AirTicket at : airTickets) {  	
         report += "\n" + at.toString() + "\n";  	
      }  	
      return "----------------------------\n" 	  	
          + "Air Ticket Report\n"	  	
          + "----------------------------\n"	  	
          + report;	  	
   }  	
 /**	  	
 * generates report by flight num.	  	
 * @return to return report by flight number	  	
 */	  	
   public String generateReportByFlightNum() {	  	
      Arrays.sort(airTickets);	  	
      String report = "";	  	
    	  	
      for (AirTicket at : airTickets) {	  	
         report += "\n" + at.toString() + "\n";	  	
      }  	
      return "--------------------------------------\n" 	  	
          + "Air Ticket Report (by Flight Number)\n"  	
          + "--------------------------------------\n"	  	
          + report;	  	
   }	  	
 /**	  	
 * generates report by itinerary.  	
 * @return to return report by itinerary	  	
 */	  	
   public String generateReportByItinerary() {
      Arrays.sort(airTickets, new ItineraryComparator()); 	
      String report = ""; 	
     	
      for (AirTicket at : airTickets) { 	
         report += "\n" + at.toString() + "\n"; 	
      }  	
      return "---------------------------------------\n"  	
          + "Air Ticket Report (by Itinerary)\n" 	
          + "---------------------------------------\n" 	
          + report; 	
   }
   /**	  	
 * generates report by invalid records.  	
 * @return to return report by invalid records	  	
 */	    
   public String generateReportForInvalidInput() {
      String report = "";
   
      for (String record : invalidRecord) {
         report += "\n" + record + "\n";
      }
      return "--------------------------------------\n" 
         + "Air Ticket Report for Invalid Input\n"
         + "--------------------------------------\n"
         + report;
   }
}