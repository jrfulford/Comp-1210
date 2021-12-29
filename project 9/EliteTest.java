import org.junit.Assert;
import org.junit.Test;   
   /**
  *   tests elite methods.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */

public class EliteTest {
   private Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800);
  /**
   *Tests getCommunication method.
   */ 
   @Test public void getCommunication() {
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);   
      be.getCommunication();
      Assert.assertEquals("Failed to getCommunication",
         100.00, be.getCommunication(), 0.000001);
   }
  /**
   *Tests setCommunication method.
   */ 
   @Test public void setCommunication() {
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);   
      be.setCommunication(200.0);
      Assert.assertEquals("Failed to getCommunication",
         200.00, be.getCommunication(), 0.000001);
   }
   /**
   *Tests totalFare method.
   */ 
   @Test public void totalFare() {
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);  
      be.totalFare();
      Assert.assertEquals("Failed to totalFare",
         1325.0, be.totalFare(), 0.000001);
   }
   /**
   *Tests totalAwardMiles method.
   */ 
   @Test public void totalAwardMiles() {
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00); 
      be.totalAwardMiles();
      Assert.assertEquals("totalAwardMiles failed", 1600.0,
         be.totalAwardMiles(), 0.01);
   }
   /**
   *Tests toString method.
   */ 
   @Test public void toStringTest() {
   
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00); 
      be.toString();
      Assert.assertEquals("Flight: DL 1860"
         + "\nATL-LGA (2021/11/21 1400 - 2021/11/21 1640) "
         + "800 miles (1600 award miles)"
         + "\nBase Fare: $450.00 Fare Adjustment Factor: 2.5"
         + "\nTotal Fare: $1,325.00 (class Elite)"
         + "\n   Includes Food/Beverage: $50.00"
         + " Entertainment: $50.00"
         + "\n   Includes: Comm Services: $100.00", be.toString());
   }
}