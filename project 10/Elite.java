import java.text.DecimalFormat;
/**
  *   child for business class.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */
public class Elite extends Business
{

   private double communication;
/**
*  constructor.
*  @param flightNum flight number.
*  @param itineraryData gets itinerary data.
*  @param baseFareAmt gets amount for base fare.
*  @param fareAdjFactorAmt adjustment factor value.
*  @param foodAndBevAmt sets amount for food and beverages.
*  @param entertainmentAmt sets amount for entertainment.
*  @param communicationAmt sets value for communication amount.
*/
   public Elite(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt, double foodAndBevAmt,
       double entertainmentAmt, double communicationAmt)
   {
      super(flightNum, itineraryData, baseFareAmt,
         fareAdjFactorAmt, foodAndBevAmt, entertainmentAmt);
      communication = communicationAmt;
   }
/**
*  returns amount in communication variable.
*  @return communication amount specified for communication.
*/
   public double getCommunication()
   {
      return communication;
   }
/**
*  sets value for communication.
*  @param communicationAmt sets variable communication.
*/
   public void setCommunication(double communicationAmt)
   {
      communication = communicationAmt;
   }
/**
*  Returns total fare value.
*
*  @return totalFare value.
*/
   public double totalFare()
   {
      return (super.totalFare() + getCommunication());
   }
/**
*  returns total awards miles.
*
*  @return totalAwardMiles value.
*/
   public int totalAwardMiles()
   {
   
      return ((int) (getItinerary().getMiles() * super.BIZ_AWD_MILES));
   }
   /**
   *  returns specific information.
   *  @return String of specific information.
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = super.toString()
         + "\n   Includes: Comm Services: "
         + df.format(getCommunication());
      return output;
   }

}