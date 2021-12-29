import org.junit.Assert;
import org.junit.Test;

   /**
  *   tests nonrefundable methods.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */

public class NonRefundableTest {
   private Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800);
  /**
   *Tests getDiscountFactor method.
   */ 
   @Test public void getDiscountFactor() {
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90); 
      nr.getDiscountFactor();
      Assert.assertEquals("Failed to getDiscountFactor",
         0.90, nr.getDiscountFactor(), 0.000001);
   }
   /**
   *Tests totalFare method.
   */ 
   @Test public void totalFare() {
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90); 
      nr.totalFare();
      Assert.assertEquals("Failed to totalFare",
         182.25, nr.totalFare(), 0.000001);
   }
   /**
   *Tests totalAwardMiles method.
   */ 
   @Test public void totalAwardMiles() {
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90); 
      nr.totalAwardMiles();
      Assert.assertEquals("totalAwardMiles failed", 800.0,
         nr.totalAwardMiles(), 0.01);
   }
   /**
   *Tests toString method.
   */ 
   @Test public void toStringTest() {
   
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90); 
      nr.toString();
      Assert.assertEquals("Flight: DL 1860"
         + "\nATL-LGA (2021/11/21 1400 - 2021/11/21 1640) "
         + "800 miles (800 award miles)"
         + "\nBase Fare: $450.00 Fare Adjustment Factor: 0.45"
         + "\nTotal Fare: $182.25 (class NonRefundable)"
         + "\n   Includes DiscountFactor: 0.9", nr.toString());
   }

}