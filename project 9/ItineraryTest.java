import org.junit.Assert;
import org.junit.Test;

   /**
  *   tests itinerary methods.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */

public class ItineraryTest {
/**
   *Tests getFromAiport method.
   */ 
   @Test public void getFromAirportTest() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.getFromAirport();
      Assert.assertEquals("Failed to getFromAirport",
         "ATL", trip.getFromAirport());
   }
    /**
   *Tests setFromAiport method.
   */ 
   @Test public void setFromAirport() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.setFromAirport("ATP");
      Assert.assertEquals("Failed to setFromAirport",
         "ATP", trip.getFromAirport());
   }
   /**
   *Tests getDepDateTime method.
   */ 
   @Test public void getDepDateTime() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.getDepDateTime();
      Assert.assertEquals("Failed to getDepDateTime",
         "2021/11/21 1400", trip.getDepDateTime());
   }
   /**
   *Tests setDepDateTime method.
   */ 
   @Test public void setDepDateTime() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.setDepDateTime("2020/10/20 1400");
      Assert.assertEquals("Failed to setDepDateTime",
         "2020/10/20 1400", trip.getDepDateTime());
   }
   /**
   *Tests getToAirport method.
   */ 
   @Test public void getToAirport() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.getToAirport();
      Assert.assertEquals("Failed to getToAirport",
         "LGA", trip.getToAirport());
   }
   /**
   *Tests setToAirport method.
   */ 
   @Test public void setToAirport() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.setToAirport("LGE");
      Assert.assertEquals("Failed to setToAirport",
         "LGE", trip.getToAirport());
   }
   /**
   *Tests getArrDateTime method.
   */ 
   @Test public void getArrDateTime() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.getArrDateTime();
      Assert.assertEquals("Failed to getArrDateTime",
         "2021/11/21 1640", trip.getArrDateTime());
   }
  /**
   *Tests setArrDateTime method.
   */ 
   @Test public void setArrDateTime() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.setArrDateTime("2020/10/20 1640");
      Assert.assertEquals("Failed to getArrDateTime",
         "2020/10/20 1640", trip.getArrDateTime());
   }
   /**
   *Tests getMiles method.
   */ 
   @Test public void getMiles() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.getMiles();
      Assert.assertEquals("Failed to getMiles",
         800, trip.getMiles(), 0.000001);
   }
   /**
   *Tests setMiles method.
   */ 
   @Test public void setMiles() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800); 
      trip.setMiles(900);
      Assert.assertEquals("Failed to getMiles",
         900, trip.getMiles(), 0.000001);
   }
   /**
   *Tests toString method.
   */ 
   @Test public void toStringTest() {
   
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800);  
      trip.toString();
      Assert.assertEquals("ATL-LGA (2021/11/21 1400 "
         + "- 2021/11/21 1640) 800 miles", trip.toString());
   }

}