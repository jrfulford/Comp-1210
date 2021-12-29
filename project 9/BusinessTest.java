import org.junit.Assert;
import org.junit.Test;
   /**
  *   tests business methods.
  *
  *   Jack Ryan Fulford
  *   11/4/21
  */

public class BusinessTest {
   private Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400", 
                                  "2021/11/21 1640", 800);
/**
   *Tests getFoodAndBev method.
   */ 
   @Test public void getFoodAndBevTest() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.getFoodAndBev();
      Assert.assertEquals("Failed to getFoodAndBev",
         50.0, b.getFoodAndBev(), 0.000001);
   }
   /**
   *Tests setFoodAndBev method.
   */ 
   @Test public void setFoodAndBevTest() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.setFoodAndBev(75.0);
      Assert.assertEquals("setFoodAndBevTest failed", 75.0,
         b.getFoodAndBev(), 0.01);
   
   }
   /**
   *Tests getEntertainment method.
   */ 
   @Test public void getEntertainment() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.getEntertainment();
      Assert.assertEquals("Failed to getEntertainment",
         50.00, b.getEntertainment(), 0.000001);
   
   }
   /**
   *Tests setFoodAndBev method.
   */ 
   @Test public void setEntertainment() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.setEntertainment(75.00);
      Assert.assertEquals("setEntertainment failed", 75.00,
         b.getEntertainment(), 0.01);
   }
   /**
   *Tests totalFare method.
   */ 
   @Test public void totalFare() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);  
      b.totalFare();
      Assert.assertEquals("Failed to totalFare", 1000, b.totalFare(), 0.000001);
   }
   /**
   *Tests totalAwardMiles method.
   */ 
   @Test public void totalAwardMiles() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.totalAwardMiles();
      Assert.assertEquals("totalAwardMiles failed", 1600.0,
         b.totalAwardMiles(), 0.01);
   }
   /**
   *Tests setFlightNum method.
   */ 
   @Test public void setFlightNum() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.setFlightNum("DD 1870");
      Assert.assertEquals("setFlightNum failed", "DD 1870",
         b.getFlightNum());
   }
    /**
   *Tests getBaseFare method.
   */ 
   @Test public void getBaseFare() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.getBaseFare();
      Assert.assertEquals("setBaseFare failed", 450,
         b.getBaseFare(), 0.01);
   }
   /**
   *Tests setBaseFare method.
   */ 
   @Test public void setBaseFare() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.setBaseFare(470);
      Assert.assertEquals("setBaseFare failed", 470,
         b.getBaseFare(), 0.01);
   }

   /**
   *Tests toString method.
   */ 
   @Test public void toStringTest() {
   
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00); 
      b.toString();
      Assert.assertEquals("Flight: DL 1860"
         + "\nATL-LGA (2021/11/21 1400 - 2021/11/21 1640) "
         + "800 miles (1600 award miles)"
         + "\nBase Fare: $450.00 Fare Adjustment Factor: 2.0"
         + "\nTotal Fare: $1,000.00 (class Business)"
         + "\n   Includes Food/Beverage: $50.00"
         + " Entertainment: $50.00", b.toString());
   }

}