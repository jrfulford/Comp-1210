import org.junit.Assert;
import org.junit.Test;
import java.text.DecimalFormat;
/**
*Tests methods of TriangularPrism.
*
*project 7a.
*@author Jack Ryan Fulford
*@version 10/14/21
*/
public class TriangularPrismTest {

/**
*Tests getLabel method.
*/
   @Test public void getLabelTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.getLabel();
      Assert.assertEquals("Failed to getLabel", "Example", t.getLabel());
   
   }
   
   /**
   *Tests setLabel method with non-null.
   */
   @Test public void setLabelNonNullTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.setLabel("Example 2");
      Assert.assertEquals("Failed to setLabel - non-null", true, 
         t.setLabel("Example 2"));
   
   }
   
   /**
   *Tests setLabel method with null.
   */
   @Test public void setLabelNullTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.setLabel(null);
      Assert.assertEquals("Failed to setLabel - null", false, t.setLabel(null));
   
   }
   
   /**
   *Tests getEdge method.
   */
   @Test public void getEdgeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.getEdge();
      Assert.assertEquals("Failed to getEdge", 5.0, t.getEdge(), 0.000001);
   
   }
   
   /**
   *Tests the setEdge method with non-negative.
   */
   @Test public void setEdgeNonNegativeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.setEdge(6);
      Assert.assertEquals("Failed to setEdge - non-negative", 
         true, t.setEdge(6));
   
   }
   
   /**
   *Tests setRadius method with negative.
   */
   @Test public void setEdgeNegativeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.setEdge(-5);
      Assert.assertEquals("Failed to setEdge - negative", 
         false, t.setEdge(-5));
   
   }
   
   /**
   *Tests the getHeight method.
   */
   @Test public void getHeightTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.getHeight();
      Assert.assertEquals("Failed to getHeight", 
         5.0, t.getHeight(), 0.000001);
   
   }
   
   /**
   *Tests setHeight method with non-negative.
   */
   @Test public void setHeightNonNegativeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.setHeight(6);
      Assert.assertEquals("Failed to setHeight - non-negative", 
         true, t.setHeight(6));
   
   }
   
   /**
   *Tests setHeight method with negative.
   */
   @Test public void setHeightNegativeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.setHeight(-5);
      Assert.assertEquals("Failed to setHeight - negative", 
         false, t.setHeight(-5));
   
   }

/**
*Tests the triangleArea method.
*/
   @Test public void triangeAreaTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.triangleArea();
      Assert.assertEquals("Failed triangle area test", 
         10.825318, t.triangleArea(), 0.000001);
   
   }
   
   /**
*Tests the rectangleArea method.
*/
   @Test public void rectangleAreaTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.triangleArea();
      Assert.assertEquals("Failed rectangle area test", 
         25.0, t.rectangleArea(), 0.000001);
   
   }
   
   /**
*Tests the surfaceArea method.
*/
   @Test public void surfaceAreaTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.triangleArea();
      Assert.assertEquals("Failed surface area test", 
         96.650635, t.surfaceArea(), 0.000001);
   
   }
   /**
   *Tests volume method.
   */
   @Test public void volumeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.volume();
      Assert.assertEquals("Failed volume test", 
         54.126588, t.volume(), 0.000001);
   
   }
   
   /**
   *Tests getCount method.
   */
   @Test public void getCountTest() {
   
      TriangularPrism.resetCount();
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      TriangularPrism.getCount();
      Assert.assertEquals("Failed getCountTest", 1, TriangularPrism.getCount());
   
   }
   
   /**
   *Tests resetCount method.
   */
   @Test public void resetCountTest() {
   
      TriangularPrism.resetCount();
      Assert.assertEquals("Failed resetCountTest", 
         0, TriangularPrism.getCount());
   
   }
   /**
   *Tests the equals - false method.
   */
   @Test public void equalsFalseTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      Object obj = new Object();
      Assert.assertEquals("Failed equalsFalseTest", false, t.equals(obj));
   
   }
   
   /**
   *Tests equals - true method.
   */
   @Test public void equalsTrueTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      TriangularPrism p = new TriangularPrism("Example", 5, 5);
      Assert.assertEquals("Failed equalsTrueTest", true, t.equals(p));
   
   }
   
   /**
   *Tests equals - false method.
   */
   @Test public void equalsFalseDifferentLabelsTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      TriangularPrism p = new TriangularPrism("Example 2", 5, 5);
      Assert.assertEquals("Failed equalsFalseDifferentLabelsTest", 
         false, t.equals(p));
   
   }

/**
   *Tests equals - false(different edge) method.
   */
   @Test public void equalsFalseDifferentEdgeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      TriangularPrism p = new TriangularPrism("Example", 6, 5);
      Assert.assertEquals("Failed equalsFalseDifferentEdgeTest", 
         false, t.equals(p));
   
   }
   
   /**
   *Tests equals - false(different heights) method.
   */
   @Test public void equalsFalseDifferentHeightTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      TriangularPrism p = new TriangularPrism("Example", 5, 6);
      Assert.assertEquals("Failed equalsFalseDifferentHeightTest", 
         false, t.equals(p));
   
   }
   
   /**
   *Tests hashCode method.
   */
   @Test public void hashCodeTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      t.hashCode();
      Assert.assertEquals("Failed hasCodeTest", 0, t.hashCode());
   
   }
   /**
   *Tests toString method.
   */
   @Test public void toStringTest() {
   
      TriangularPrism t = new TriangularPrism("Example", 5, 5);
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "TriangularPrism \"Example\""
         + " with triangle edge of 5.0 units "
         + "\n" + "and prism height of 5.0 units has: " + "\n";
      output += "\ttriangle area = 10.825 square units" + "\n";
      output += "\trectangle area = 25.0 square units" + "\n";
      output += "\tsurface area = 96.651 square units" + "\n";
      output += "\tvolume = 54.127 cubic units";
      Assert.assertEquals(output, t.toString());
   } 
}
