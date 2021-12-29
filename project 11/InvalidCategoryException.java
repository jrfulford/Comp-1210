/**
  *   Invalid category exception.
  *   
  *   @author Jack Ryan Fulford
  *   @version 11/17/21
  */
  
public class InvalidCategoryException extends Exception
{
/**
* defines invalid category exception. 
*
*@param category with wrong char of line in file.
*/
   public InvalidCategoryException(String category)
   {
   
      super("For category: " + "\"" + category + "\"");
   }

}