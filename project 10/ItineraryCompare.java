import java.util.Comparator;
  
  /**
  *   defines itenerary comparator.
  *   
  *   @author Jack Ryan Fulford
  *   @version 11/11/21
  */
public class ItineraryCompare implements Comparator<AirTicket>
{
/**
*  defines how itenerary will be compared.
*  @param t1 ticket one
*  @param t2 ticket two
*  @return integer if equal, less than, or equal to.
*/
   public int compare(AirTicket t1, AirTicket t2)
   {
      return (t1.getItinerary()).toString().
            compareTo((t2.getItinerary()).toString());
   }
}