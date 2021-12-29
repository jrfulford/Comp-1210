import java.text.DecimalFormat;
/**
 * Class DecagonalPrism calculates information based
 * user inputs.
 *
 * Project 4
 * @author Jack Ryan Fulford - COMP1210
 * @version 9/16/21
 */
public class DecagonalPrism {
// instance variables
   private String label = "";
   private double edge = 0;
   private double height = 0;
/**
   * Constructor for DecagonalPrism.
   * Creates the object with given parameters.
   *
   * @param labelIn - used
   * @param edgeIn - used
   * @param heightIn - used
   */
   public DecagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
   /**
    * Creates and returns the string assigned to a created object.
    *
    * @return String created string
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "A decagonal prism \"" + label + "\" ";
      output += "with edge = " + edge + " ";
      output += "units and height = " + height + " units, has:";
      output += "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units";
      output += "\n\tbase area = " + df.format(baseArea())
         + " square units";
      output += "\n\tlateral surface area = "
         + df.format(lateralSurfaceArea()) + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
   /**
   * returns label variable.
   * @return returns the label variable.
   */
   public String getLabel() {
      return label;
   }
   /**
    * Sets the label to the given String.
    *
    * @param labelIn - used
    * @return boolean if label is set
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
    * Sets the edge to the given double.
    *
    * @param edgeIn - used
    * @return boolean if base is set
    */
   public boolean setEdge(double edgeIn) {
      boolean isEdgeSet = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         isEdgeSet = true;
      }
      // returns a boolean dependant upon if the given paramater is valid
      return isEdgeSet;
   }
   /**
    * Retrieves the edge of the object.
    *
    * @return double the edge of the object
    */
   public double getEdge() {
      return edge;
   }
   /**
    * Sets the height to the given.
    *
    * @param heightIn - used
    * @return boolean if height is set
    */
   public boolean setHeight(double heightIn) {
      boolean isHeightSet = false;
      if (heightIn >= 0) {
         height = heightIn;
         isHeightSet = true;
      }
      // returns a boolean dependant upon if the given paramater is valid
      return isHeightSet;
   }
   /**
    * Retrieves the height of the object.
    *
    * @return double the height of the object
    */
   public double getHeight() {
      return height;
   }
   /**
    * Calculates and returns the surface area of the decagonal prism.
    *
    * @return double calculated surface area
    */
   public double surfaceArea() {
      double surfaceArea = (10 * edge * height)
         + (5 * Math.pow(edge, 2)) * (Math.sqrt(5 + 2 * Math.sqrt(5)));
      return surfaceArea;
   }
   /**
   * Calculates and returns the base area of the decagonal prism.
   *
   * @return double calculated base area
   */
   public double baseArea() {
      double baseArea = (5.0 / 2.0) * (Math.pow(edge, 2)) * (Math.sqrt(5
         + 2 * Math.sqrt(5)));
      return baseArea;
   }
   /**
   * Calculates and returns the lateral surface area.
   *
   * @return double calculated base area
   */
   public double lateralSurfaceArea() {
      double lateralSurfaceArea = (10 * edge * height);
      return lateralSurfaceArea;
   }
   /**
    * Calculates and returns the volume of the decagonal prism.
    *
    * @return double calculated volume
    */
   public double volume() {
      double volume = (5.0 / 2.0) * (Math.pow(edge, 2)) * (Math.sqrt(5
         + 2 * Math.sqrt(5))) * height;
      return volume;
   }
}