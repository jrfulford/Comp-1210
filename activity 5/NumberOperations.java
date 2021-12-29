/**
* Number Operations.
*
* @author Jack Ryan Fulford
* @version 9/21/21
*/
public class NumberOperations {
   private int number;
   /**
   * number int.
   * @param numberIn - used.
   */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
   * get value.
   * @return returns number
   */
   public int getValue() {
      return number;
   }
   /**
   * string odds.
   * @return returns number
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
   * powers two under.
   * @return returns number
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concentrate to output
         powers = powers * 2; //get next power of 2
      }
      return output;
   }
   /**
   * public int.
   * @return returns number
   * @param compareNumber - used
   */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
   * string.
   * @return returns number
   */
   public String toString() {
      return number + "";
   }
   
   
}