package net.greet;
import java.util.List;

public class ClearUser
{
    public ClearUser(List<User> users , String username)
    {
          clearUsers(users , username);
    }
    public void clearUsers(List<User> users , String username)
    { // this method does the clear command action

           int index = 0;
           if(username != null)
           { // if the clear command is followed by a user name , remove the first occurrence of the element in the list with the specified value

                while (index < users.size())
                { // go through each and every element in the list

                     if (users.get(index).getName().toLowerCase().equalsIgnoreCase(username))  // if the list contains a user with the specified user name
                     {
                        users.get(index).greetedCount --;
                        break;
                     }
                     else
                     {
                         index++;
                     }
                }    // end of the while loop

           } //  end of if
                     else
                     {  // if the clear command is not followed by any username , delete all greeted users
                       users.clear(); // empty greeted users
                     } //  end of else
                     deleteUser(users); // check if a particular user has a greeting count of zero

    }// end of clear users method
    private void deleteUser(List<User> user)
    {
        // delete user if its count is zero
        for(int index = 0; index < user.size(); index++)
        {
            if(user.get(index).getGreetedCount() == 0)
            {
                user.remove(index);
            }
        }
    }

} // end of clear users
