import java.text.DecimalFormat;
  /**
  *   ticket data and provides methods.
  *   
  *   Jack Ryan Fulford
  *   11/4/21
  */
public abstract class AirTicket implements Comparable<AirTicket>
{
   protected String flightNumber;
   protected Itinerary tripData;
   protected double baseFare;
   protected double fareAdjFactor;
/**
*  constructor.
*  @param flightNum flight number.
*  @param itineraryData gets the itinerary data.
*  @param baseFareAmt   gets the amount for the base fare.
*  @param fareAdjFactorAmt adjustment factor value.
*/
   public AirTicket(String flightNum, Itinerary itineraryData,
      double baseFareAmt, double fareAdjFactorAmt)
   {
      flightNumber = flightNum;
      tripData = itineraryData;
      baseFare = baseFareAmt;
      fareAdjFactor = fareAdjFactorAmt;
   }
/**
*  returns flight number.
*
*  @return flightNumber returns a string rep the flight number
*/
   public String getFlightNum()
   {
      return flightNumber;
   }
/**
* sets flight number value.
*
* @param flightNum sets the value for the flight number
*/
   public void setFlightNum(String flightNum)
   {
      flightNumber = flightNum;
   }
/**
*  returns tripData.
*
*  @return tripData returns Itinerary
*/
   public Itinerary getItinerary()
   {
      return tripData;
   }
/**
*  returns base fare amount.
*
*  @return baseFare returns the value of base fare.
*/
   public double getBaseFare()
   {
      return baseFare;
   }
/**
*  sets base fare amount.
*
*  @param baseFareAmt sets the baseFare variable.
*/
   public void setBaseFare(double baseFareAmt)
   {
      baseFare = baseFareAmt;
   }
/**
*  gets FareAdjustmentFactor value.
*
*  @return fareAdjFactor returns double of fare adjustment value.
*/
   public double getFareAdjustmentFactor()
   {
      return fareAdjFactor;
   }
/**
*  returns output of toString.
*
*  @return output.
*/
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = "Flight: " + getFlightNum();
      output += "\n" + getItinerary() + " (" + totalAwardMiles()
         + " award miles)";
      output += "\n" + "Base Fare: " + df.format(getBaseFare())
         + " Fare Adjustment Factor: " + getFareAdjustmentFactor();
      output += "\n" + "Total Fare: "
         + df.format(totalFare()) + " ("
         + getClass() + ")";
      
      return output; 
   }
/**
* compare to interface.
*
* @return integer if flight is less than or equal.
* @param ticket retrieves AirTicket as parameter.
*/
   public int compareTo(AirTicket ticket)
   {
      return (flightNumber).compareTo(ticket.getFlightNum());
   }

/**
*  returns total fare value.
*
*  @return totalFare value.
*/
   public abstract double totalFare();
/**
*  returns total awards miles.
*
*  @return totalAwardMiles value.
*/
   public abstract int totalAwardMiles();
/**
* compare to interface
*
* @return integer if flight is less than or equal.
* @param ticket retrieves AirTicket as parameter.
*/
}