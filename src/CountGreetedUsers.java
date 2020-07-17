package net.greet;

import java.util.ArrayList;
import java.util.List;

public class CountGreetedUsers
{

    List<User> users ; // this stores a list of greeted users

    public CountGreetedUsers(List<User> users)
    {
        this.users = users;
    }
   public int uniqueUsers()
   {
       return users.size();
   }


}
