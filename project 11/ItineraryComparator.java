import java.util.Comparator;
/**
* creates comparator.
* 
* @author Jack Ryan Fulford
* @version 11/11/21
*/
public class ItineraryComparator implements Comparator<AirTicket> 
{
  /**
  * compares itinerary.
  * @return to return an int.
  * @param t1 for air ticket 1
  * @param t2 for air ticket 2
  */
   public int compare(AirTicket t1, AirTicket t2) {
   
      return t1.getItinerary().toString()
         .compareTo(t2.getItinerary().toString());
   }
}