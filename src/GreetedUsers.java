
package net.greet;
import java.util.*;

public class GreetedUsers
{
         /*
           Greeted users
       */
      List<User> users ; // this stores a list of greeted users
      String userName; // user name

         // constructor
      public GreetedUsers( List<User> users , String userName)
      {

             this.users = users; // instantiate greeted users list
             this.userName = userName; // initialize userName
             printGreetedUsers(userName); // print the users
      }
      public void printGreetedUsers(String userName)
      {
             // check if a user name is mentioned in the greeted command
              if(userName != null)
              {
                  // access the list of users and print the specific user , to do so , use a loop
                  for(int listIndex = 0; listIndex < users.size(); listIndex++)
                  {

                      if(users.get(listIndex).getName().equalsIgnoreCase(userName))
                      {
                          System.out.println(users.get(listIndex));
                          break;
                      }

                  } // end of for loop

              } // end of if
              else
              {
                  // if no user name has been mentioned in the greeted command , simple print all users
                  for(User user : users)
                      System.out.println(user);
              }
              checkUsers(users); // check if there are any greeted users
              } // end of print greeted users
              private void checkUsers(List<User> Users)
              {
                  if(users.isEmpty())
                  {
                      System.out.println("No Users have been greeted!");
                  }
              }

} //  end of greeted users


