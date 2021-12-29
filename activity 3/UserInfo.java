  /**
*Simple program to print user info
*
*Activity 4A
*Name: Jack Ryan Fulford - COMP 1210 - Sections 4.1-4.8
*Date: September 13, 2021
*/
/**
*public class to print user info.
*/
public class UserInfo
{
// instance variable
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
// constructor
/**
*set default value.
* @param firstNameIn Command line arguments (not used).
* @param lastNameIn Command line arguments (not used).
*/
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
/**
*set default value.
* @return ageIn Command line arguments (not used).
*/
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) 
      {
         output += "Offline";
      }
      else 
      {
         output += "Online";
      }
      return output;
   }
}