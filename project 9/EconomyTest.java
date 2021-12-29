import org.junit.Assert;
import org.junit.Test;
   /**
  *   tests economy methods.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */

public class EconomyTest {
   private Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800);
/**
   *Tests totalFare method.
   */ 
   @Test public void totalFare() {
   
      Economy e = new Economy("DL 1860", trip, 450, 1.0);  
      e.totalFare();
      Assert.assertEquals("Failed to totalFare", 450, e.totalFare(), 0.000001);
   
   }
   /**
   *Tests totalAwardMiles method.
   */ 
   @Test public void totalAwardMiles() {
   
      Economy e = new Economy("DL 1860", trip, 450, 1.0); 
      e.totalAwardMiles();
      Assert.assertEquals("totalAwardMiles failed", 1200.0,
         e.totalAwardMiles(), 0.01);
   }
   /**
   *Tests toString method.
   */ 
   @Test public void toStringTest() {
   
      Economy e = new Economy("DL 1860", trip, 450, 1.0); 
      e.toString();
      Assert.assertEquals("Flight: DL 1860"
         + "\nATL-LGA (2021/11/21 1400 - 2021/11/21 1640) "
         + "800 miles (1200 award miles)"
         + "\nBase Fare: $450.00 Fare Adjustment Factor: 1.0"
         + "\nTotal Fare: $450.00 (class Economy)"
         + "\n   Includes Award Miles Factor: 1.5", e.toString());
   }
}