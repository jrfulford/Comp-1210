/**
  *   holds information for nonrefundable tickets.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */
public class NonRefundable extends AirTicket
{

   private double discountFactor;
/**
*  constructor.
*  @param flightNum flight number.
*  @param itineraryData gets itinerary data.
*  @param baseFareAmt gets amount for base fare.
*  @param fareAdjFactorAmt adjustment factor value.
*  @param discountFactorAmt sets discount factor amount for tickets.
*/
   public NonRefundable(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt, double discountFactorAmt)
   {
      super(flightNum, itineraryData, baseFareAmt, fareAdjFactorAmt);
      discountFactor = discountFactorAmt;
   }
/**
*  returns discount factor.
*  @return discountFactor variable that holds discount factor.
*/
   public double getDiscountFactor()
   {
      return discountFactor;
   }
   /**
   *  sets discount factor variable.
   *  @param setDiscountFactor sets variable discountFactor.
   */
   public void getDiscountFactor(double setDiscountFactor)
   {
      discountFactor = setDiscountFactor;
   }
/**
*  returns total fare value.
*
*  @return totalFare value.
*/
   public double totalFare()
   {
      return ((getBaseFare()) * (getFareAdjustmentFactor()
         * getDiscountFactor()));
   }
/**
*  returns total awards miles.
*
*  @return totalAwardMiles value.
*/
   public int totalAwardMiles()
   {
   
      return getItinerary().getMiles();
   }
   /**
   *  returns specific information.
   *  @return String of specific information.
   */
   public String toString()
   {
      String output = super.toString()
         + "\n   Includes DiscountFactor: "
         + getDiscountFactor();
   
      return output;
   }	
}