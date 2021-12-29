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

//methods
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
   /**
   *sets location.
      *@param locationIn takes input from user for the location
      */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
   *sets age.
   *@return returns the variable age and isSet.
   * @param ageIn takes input from the user for the age
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *gets the age.
   * @return returns the age
   */
   public int getAge() {
      return age;
   }
   /**
   *gets the location.
   * @return returns the location
   */
   public String getLocation() {
      return location;
   }
   /**
   *logs user off.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   *logs user on.
   */
   public void logOn() {
      status = ONLINE;
   }
}