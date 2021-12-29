/**
*Represents an item in a store.
*
*Activity 9
*Jack Ryan Fulford
*11/2/21
*/
public class OnlineBook extends OnlineTextItem {

//variables
   protected String author;

/**
*constructor for OnlineBook.
*
*@param nameIn used.
*@param priceIn used.
*/
   public OnlineBook(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      author = "Author Not Listed";
   
   }
   
/**
*overrides the toString method in InventoryItem to include author's name.
*
*@return String.
*/
   public String toString() {
   
      return name + " - " + author + ": $" + calculateCost();
   
   } 
   
/**
*sets the author's name.
*
*@param authorIn used.
*/
   public void setAuthor(String authorIn) {
   
      author = authorIn;
   
   }        
}