 /**
  *   holds flight information.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */
public class Itinerary
{

   private String fromAirport;
   private String depDateTime;
   private String toAirport;
   private String arrDateTime;
   private int miles;
/**
*  constructor.
*  @param departCode sets depature code from airport.
*  @param arrivalCode sets arrival code from airport.
*  @param depDayTime sets depature time.
*  @param arrDayTime sets arrival Time.
*  @param travelDist sets distance needs to be covered.
*/
   public Itinerary(String departCode, String arrivalCode,
       String depDayTime, String arrDayTime, int travelDist)
   {
      fromAirport = departCode;
      depDateTime = depDayTime;
      toAirport = arrivalCode;
      arrDateTime = arrDayTime;
      miles = travelDist;
   }
 
/**
*  returns depature airport code.
*  @return fromAirport departure airport code.
*/
   public String getFromAirport()
   {
      return fromAirport;
   }
/**
*  sets depature airport code.
*  @param departCode sets fromAirport variable.
*/
   public void setFromAirport(String departCode)
   {
      fromAirport = departCode;
   }
/**
*  return depature time and date.
*  @return depDateTime returns depDateTime variable.
*/
   public String getDepDateTime()
   {
      return depDateTime;
   }
/**
*  sets depature date and time.
*  @param depDayTime sets depDateTime variable.
*/
   public void setDepDateTime(String depDayTime)
   {
      depDateTime = depDayTime;
   }
/**
*  returns arrival airport code.
*  @return toAirport arrival airport code.
*/
   public String getToAirport()
   {
      return toAirport;
   }
/**
*  sets arrival airport code.
*  @param arrivalCode sets arrival airport variable.
*/
   public void setToAirport(String arrivalCode)
   {
      toAirport = arrivalCode;
   }
   
/**
*  returns date and time of arrival airport.
*  @return arrDateTime variable arrival date and time.
*/ 
   public String getArrDateTime()
   {
      return arrDateTime;
   }
/**
*  sets the arrival date and time to the airport.
*  @param arrDayTime sets variable arrDateTime.
*/
   public void setArrDateTime(String arrDayTime)
   {
      arrDateTime = arrDayTime;
   }
	/**
*  returns milage.
*  @return miles variable of miles that will be covered.
*/
   public int getMiles()
   {
      return miles;
   }
/**
*  sets distance to be traveled.
*  @param travelDist sets miles variable.
*/
   public void setMiles(int travelDist)
   {
      miles = travelDist;
   }
	
   /**
   *  returns specific information.
   *  @return String of specific information.
   */
   public String toString()
   {
   
      return getFromAirport() + "-" + getToAirport()
         + " (" + getDepDateTime() + " - "
         + getArrDateTime() + ") " + getMiles() + " miles";
   
   }
   
}