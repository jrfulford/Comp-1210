/**
*Simple program to accept coded ticket information.
*
*Project 02
*Name: Jack Ryan Fulford - COMP 1210 - Sections 2.1-2.11
*Date: September 9, 2021
*/
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
/** class Moon Trip definition. **/
public class MoonTrip {
/**
*Decodes the Moon Trip ticket.
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String inputTicket = "";
      DecimalFormat df2 = new DecimalFormat("#,###,###.00");
      DecimalFormat df6 = new DecimalFormat("00000");
      System.out.print("Enter ticket code: ");
      inputTicket = input.nextLine();
      System.out.println("");
      String ticket = inputTicket.trim();
      if (ticket.length() >= 27)
      {
         Random rand = new Random();
         String date = ticket.substring(0, 8);
         String time = ticket.substring(8, 12);
         double price = Double.parseDouble(ticket.substring(12, 19) + "."
            + ticket.substring(18, 20));
         double discount = Double.parseDouble(ticket.substring(20, 23));
         String seat = ticket.substring(23, 26);
         String desc = "";
         desc = ticket.substring(26, ticket.length());
         double cost = price - ((discount / 100) * price);
         int prizenumber = rand.nextInt(99999);
         System.out.print("Ticket: " + desc);
         System.out.println("   Date: " 
            + date.substring(0, 2) + "/"
            + date.substring(2, 4) + "/" + date.substring(4, 8) + "   Time: "
            + time.substring(0, 2) + ":" + time.substring(2, 4));
         System.out.println("Seat: " + seat + "   " 
            + "Price: $" + df2.format(price)
            + "   Discount: " + ((int) discount)
            + "%   Cost: $" + df2.format(cost));
         System.out.println("Prize Number: "
            + df6.format(prizenumber));
      }
      else
      {
         System.out.println("*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 27 characters.");
      }
      input.close();
   }
}