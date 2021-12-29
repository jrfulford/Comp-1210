/**
*Represents an online text item.
*
*Activity 9
*Jack Ryan Fulford
*11/2/21
*/
public abstract class OnlineTextItem extends InventoryItem {

/**
*constructs an onlineTextItem.
*
*@param nameIn used.
*@param priceIn used.
*/
   public OnlineTextItem(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
   
   }
   
/**
*overrides the calculateCost method from InventoryItem to not include tax.
*
*@return double.
*/
   public double calculateCost() {
   
      return price;
   
   }   
}