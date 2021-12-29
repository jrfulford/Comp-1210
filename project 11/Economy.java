/**
  *   holds economy class tickets information.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */
public class Economy extends AirTicket
{
   /**
   *  constant for award miles.
   */
   public static final double ECO_AWARD_MILES = 1.5;
/**
*  constructor.
*  @param flightNum flight number.
*  @param itineraryData gets itinerary data.
*  @param baseFareAmt gets amount for base fare.
*  @param fareAdjFactorAmt adjustment factor value.
*/
   public Economy(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt)
   {
      super(flightNum, itineraryData, baseFareAmt, fareAdjFactorAmt);
   }

/**
*  returns total fare value.
*
*  @return totalFare value.
*/
   public double totalFare()
   {
      return ((getBaseFare()) * (getFareAdjustmentFactor()));
   }
/**
*  returns total awards miles.
*
*  @return totalAwardMiles value.
*/
   public int totalAwardMiles()
   {
   
      return ((int) (getItinerary().getMiles() * ECO_AWARD_MILES));
   }
   /**
   *  returns specific information.
   *  @return String of specific information.
   */
   public String toString()
   {
      String output;
      output = super.toString() 
         + "\n   Includes Award Miles Factor: " + ECO_AWARD_MILES;
   
      return output;
   }	
}