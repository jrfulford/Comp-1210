import java.text.DecimalFormat;
/**
*triangular prism.
*
*project 7a.
*@author Jack Ryan Fulford
*@version 10/14/21.
*/
public class TriangularPrism {
// instance variables
   private String label = "";
   private double edge = 0;
   private double height = 0;
   private static int count = 0; 
/**
*TriangularPrism constructor.
*
*@param labelIn used.
*@param edgeIn used.
*@param heightIn used.
*/
   public TriangularPrism(String labelIn, double edgeIn, 
      double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
      count++;
   }
//methods
/**
*gets label string.
*
*@return String.
*/

   public String getLabel() {
      return label;
   }
/**
*checks for label and sets.
*
*@param labelIn used.
*@return boolean.
*/
   public boolean setLabel(String labelIn) {
      if (labelIn == null) { 
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
   /**
   *gets the edge.
   *
   *@return double.
   */      
   public double getEdge() {
      return edge;
   }
/**
*checks for negative edge and sets.
*
*@param edgeIn used.
*@return boolean.
*/   
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
/**
*gets prism height.
*
*@return double.
*/
   public double getHeight() {
      return height;
   }
/**
*checks for negative height and sets.
*
*@param heightIn used.
*@return boolean.
*/
   public boolean setHeight(double heightIn) {
      if (heightIn >= 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
/**
*calculates triangle area.
*
*@return double.
*/   
   public double triangleArea() {
      double triangleArea = 0.25 * Math.sqrt(3 * (Math.pow(edge, 4)));
      return triangleArea;
   }
/**
*calculates rectangle area.
*
*@return double.
*/
   public double rectangleArea() {
      double rectangleArea = edge * height;
      return rectangleArea;
   }
/**
*calculates total surface area.
*
*@return double.
*/
   public double surfaceArea() {
      double surfaceArea = (2 * (triangleArea()))
         + (3 * (rectangleArea()));
      return surfaceArea;
   }
/**
*calculates volume.
*
*@return double.
*/
   public double volume() {
      double volume = (triangleArea()) * (height);
      return volume;
   }
   /**
   *gets number of triangular prisms created.
   *
   *@return int.
   */
   public static int getCount() {
   
      return count;
   
   }
   /**
   *resets the number of triangular prisms.
   */
   public static void resetCount() {
   
      count = 0;
   
   }
   /**
   *checks to see if object is a triangular prism.
   *
   *@return boolean.
   @param obj used.
   */
   public boolean equals(Object obj) {
   
      if (!(obj instanceof TriangularPrism)) { 
      
         return false;
      
      }
      
      else {
      
         TriangularPrism t = (TriangularPrism) obj;
      
         return (label.equalsIgnoreCase(t.getLabel())
            && Math.abs(edge - t.getEdge()) < .000001
            && Math.abs(height - t.getHeight())
            < .000001);
      }
   }
   /**
   *required by checkstyle for equals method.
   *
   *@return int.
   */
   public int hashCode() {
   
      return 0;
   
   }
/**
*creates string from all info.
*
*@return String.
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "TriangularPrism \"" + label + "\" with "
         + "triangle edge of " + edge + " units " + "\n" + "and prism "
         + "height of " + height + " units has: " + "\n";
      output += "\ttriangle area = " + df.format(triangleArea()) 
         + " square units" + "\n";
      output += "\trectangle area = " + df.format(rectangleArea()) 
         + " square units" +  "\n";
      output += "\tsurface area = " + df.format(surfaceArea()) 
         + " square units" +  "\n";
      output += "\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}