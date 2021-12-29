import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*tests the methods.
*
*Project 8.
* @author Jack Ryan Fulford
* @version 10/27/21
*/
public class TriangularPrismListTest {

/**
*tests getName method.
*/
   @Test public void getNameTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("getNameTest failed", "Test List", tList.getName());
   
   }
   
   /**
   *tests numberOfTriangularPrisms - non-zero.
   */
   @Test public void numberOfTriangularPrismsNonZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
         
      Assert.assertEquals("numberOfTriangularPrismsNonZeroTest failed",
         3, tList.numberOfTriangularPrisms());
   }

/**
   *tests numberOfTriangularPrisms - zero.
   */
   @Test public void numberOfTriangularPrismsZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 0);
         
      Assert.assertEquals("numberOfTriangularPrismsZeroTest failed",
         0, tList.numberOfTriangularPrisms());
   }

/**
*tests totalSurfaceArea - non-zero.
*/
   @Test public void totalSurfaceAreaNonZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("totalSurfaceAreaNonZeroTest failed", 30.12435565,
         tList.totalSurfaceArea(), 0.000001);
   
   }

/**
*tests totalSurfaceArea - zero.
*/
   @Test public void totalSurfaceAreaZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 0);
   
      Assert.assertEquals("totalSurfaceAreaZeroTest failed", 0.0,
         tList.totalSurfaceArea(), 0.000001);
   
   }

/**
*tests totalVolume - non-zero.
*/
   @Test public void totalVolumeNonZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("totalVolumeNonZeroTest failed", 15.58845727,
         tList.totalVolume(), 0.000001);
   
   }

/**
*tests totalVolume - zero.
*/
   @Test public void totalVolumeZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 0);
   
      Assert.assertEquals("totalVolumeZeroTest failed", 0.0,
         tList.totalVolume(), 0.000001);
   
   }

/**
*tests averageSurfaceArea - non-zero.
*/
   @Test public void averageSurfaceAreaNonZeroTest() {
   
      TriangularPrism[] sArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("averageSurfaceAreaNonZeroTest failed", 10.04145188,
         tList.averageSurfaceArea(), 0.000001);
   
   }

/**
*tests averageSurfaceArea - zero.
*/
   @Test public void averageSurfaceAreaZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 0);
   
      Assert.assertEquals("averageSurfaceAreaZeroTest failed", 0.0,
         tList.averageSurfaceArea(), 0.000001);
   
   }

/**
*tests averageVolume - non-zero.
*/
   @Test public void averageVolumeNonZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("averageVolumeNonZeroTest failed", 5.196152423,
         tList.averageVolume(), 0.000001);
   
   }

/**
*tests averageVolume - zero.
*/
   @Test public void averageVolumeZeroTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 0);
   
      Assert.assertEquals("averageVolumeZeroTest failed", 0.0,
         tList.averageVolume(), 0.000001);
   
   }

/**
   *Tests toString.
   */
   @Test public void toStringTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         sArray, 1);
   
      boolean has = tList.toString().contains("Test List\n\nSpherocylinder"
         + " \"Example 1\" with triangle edge of 1.0"
         + " units and prism height of 1.0 units has:"
         + "\n\ttriangle area = 0.433 square units\n\trectangle area = 1.0 square"
         + " units\n\ttotal surface area = 3.866 square units\n\t"
         + "volume = 0.433 cubic units\n");
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   } 

/**
   *Tests summaryInfo.
   */
   @Test public void summaryInfoTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 1);
   
      boolean has = tList.summaryInfo().contains("----- Summary for Test List"
         + " -----\nNumber of TriangularPrisms: 1\nTotal Surface Area: 3.866"
         + "\nTotal Volume: 0.433\nAverage Surface Area: 3.866\nAverage Volume"
         + ": 0.433\n");
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   }
   
   /**
   *tests getList.
   */
   @Test public void getListTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         sArray, 3);
   
      Assert.assertArrayEquals("getListTest failed", tArray, tList.getList());
   
   }
   
   /**
   *tests readFile.
   *
   *@throws FileNotFoundException for reading a file.
   */
   @Test public void readFileTest() throws FileNotFoundException {
   
      TriangularPrismList tList = new TriangularPrismList("Test List", null, 0);
      tList = tList.readFile("triangularprism_data_1.txt");
      
      Assert.assertEquals("readFileTest failed", "TriangularPrism Test List", 
                           tList.getName());
                           
   }
   
   /**
   *tests the addTriangularPrism method.
   */
   @Test public void addTriangularPrismTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
         
      TriangularPrism t = new TriangularPrism("Example 4", 4, 4);
      tList.addTriangularPrism("Example 4", 4, 4);
      TriangularPrism[] tA = tList.getList();
   
      Assert.assertEquals("addTriangularPrismTest failed", t, tA[3]);
   }
   
   /**
   *tests findTriangularPrism - valid entry.
   */
   @Test public void findTriangularPrismValidEntryTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("findTriangularPrismTestValidEntry failed", tArray[1], 
         tList.findTriangularPrism("EXAMPLE 2"));
   
   }
   
   /**
   *tests findTriangularPrism - non-valid entry.
   */
   @Test public void findTriangularPrismNonValidEntryTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("findTriangularPrismTestNonValidEntry failed", null, 
         tList.findTriangularPrism("EXAMPLE 5"));
   
   }
   
   /**
   *tests deleteSpherocylinder - valid entry.
   */
   @Test public void deleteTriangularPrismValidEntryTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("deleteTriangularPrismValidEntryTest failed",
         tArray[1], tList.deleteTriangularPrism("Example 2"));
   }

/**
   *tests deleteTriangularPrism - non-valid entry.
   */
   @Test public void deleteTriangularPrismNonValidEntryTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("deleteTriangularPrismNonValidEntryTest failed",
         null, tList.deleteTriangularPrism("Example 5"));
   }
   
   /**
   *tests editTriangularPrism - valid entry.
   */
   @Test public void editTriangularPrismValidEntryTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("editTriangularPrismValidEntryTest failed",
         true, tList.editTriangularPrism("Example 2", 4, 4));
   }

/**
   *tests editSpherocylinder - non-valid entry.
   */
   @Test public void editTriangularPrismrNonValidEntryTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("editTriangularPrismNonValidEntryTest failed",
         false, tList.editTriangularPrism("Example 5", 5, 5));
   }

/**
*tests the findTriangularPrismWithLargestVolume.
* - Number of TriangularPrism > 0 method.
*/
   @Test public void findTriangularPrismWithLargestVolumeValidTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
      tArray[0] = new TriangularPrism("Example 1", 1, 1);
      tArray[1] = new TriangularPrism("Example 2", 2, 2);
      tArray[2] = new TriangularPrism("Example 3", 3, 3);
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 3);
   
      Assert.assertEquals("findTriangularPrismWithLargestVolumeValidTest"
         + " failed", tArray[2], tList.findTriangularPrismWithLargestVolume());
   
   }
   
   /**
*tests the findTriangularPrismWithLargestVolume.
* - Number of TriangularPrism = 0 method.
*/
   @Test public void findTriangularPrismWithLargestVolumeNonValidTest() {
   
      TriangularPrism[] tArray = new TriangularPrism[10];
   
      TriangularPrismList tList = new TriangularPrismList("Test List",
         tArray, 0);
   
      Assert.assertEquals("findTriangularPrismWithLargestVolumeNonValidTest"
         + " failed", null, tList.findTriangularPrismWithLargestVolume());
   
   }

}