 /**
*Simple program to print user info.
*
*Activity 4B
*Name: Jack Ryan Fulford - COMP 1210 - Sections 4.1-4.8
*Date: September 13, 2021
*/
/**
*public class to print user info.
*/
public class UserInfoDriver {

/**
*prints user info.
*@param args Command line arguments - not used.
*/ 
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}