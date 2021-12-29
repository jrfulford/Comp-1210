import java.text.DecimalFormat;
 /**
  *   holds business class methods and elite parent method.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */
public class Business extends AirTicket
{
   protected double foodAndBev;
   protected double entertainment;
   /**
   *  constant for award miles.
   */
   public static final double BIZ_AWD_MILES = 2.0;
/**
*  constructor.
*  @param flightNum flight number.
*  @param itineraryData gets itinerary data.
*  @param baseFareAmt gets amount for base fare.
*  @param fareAdjFactorAmt adjustment factor value.
*  @param foodAndBevAmt sets amount for food and beverages.
*  @param entertainmentAmt sets amount for entertainment.
*/
   public Business(String flightNum, Itinerary itineraryData,
       double baseFareAmt, double fareAdjFactorAmt,
       double foodAndBevAmt, double entertainmentAmt)
   {
      super(flightNum, itineraryData, baseFareAmt, fareAdjFactorAmt);
      foodAndBev = foodAndBevAmt;
      entertainment = entertainmentAmt;
   }
/**
*  gets food and beverage amount.
*  @return foodAndBev amount from foodAndBev variable.
*/
   public double getFoodAndBev()
   {
      return foodAndBev;
   }  
/**
*  sets amount in food and beverage.
*  @param foodAndBevAmt sets variable foodAndBev.
*/
   public void setFoodAndBev(double foodAndBevAmt)
   {
      foodAndBev = foodAndBevAmt;
   }
/**
*  returns entertainment amount.
*  @return entertainment gets variable entertainment.
*/
   public double getEntertainment()
   {
      return entertainment;
   }
/**
*  sets variable entertainment.
*  @param entertainmentAmt sets variable entertainment.
*/
   public void setEntertainment(double entertainmentAmt)
   {
      entertainment = entertainmentAmt;
   }
/**
*  returns total fare value.
*
*  @return totalFare value.
*/
   public double totalFare()
   {
      return ((getBaseFare()) * (getFareAdjustmentFactor())
         + getFoodAndBev() + getEntertainment());
   }
/**
*  returns total awards miles.
*
*  @return totalAwardMiles value.
*/
   public int totalAwardMiles()
   {
   
      return ((int) (getItinerary().getMiles() * BIZ_AWD_MILES));
   }
   /**
   *  returns specific information.
   *  @return String of specific information.
   */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output;
      output = super.toString()
         +  "\n   Includes Food/Beverage: " 
         + df.format(getFoodAndBev())
         + " Entertainment: " + df.format(getEntertainment());
   
      return output;
   }	

}