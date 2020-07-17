package net.greet;
import java.util.*;

public class GreetUsers
{
    /*
        this class ensures that , a user can only exist once in the list with its count only increasing
     */

    User user; // a user
    String[] languages = new String[]{"xhosa", "zulu", "english"}; //Languages
    List<User> users = null;

    public GreetUsers(User user, List<User> users)
    {
        this.user = user; // create an instance of person
        this.users = users;
    }

    public void greet()
    {

        if ((user.getLanguage().equalsIgnoreCase(languages[0]) && (user != null))) // greeting in xhosa
        {
            System.out.println("Molo " + user.getName());
            filterAndAddUsers(user);

        } else if ((user.getLanguage().equalsIgnoreCase(languages[1])) && (user != null)) // greeting in zulu
        {
            System.out.println("Sawbona " + user.getName());
            filterAndAddUsers(user);
        } else if ((user.getLanguage().equalsIgnoreCase(languages[2]) && (user != null))) // greeting in english
        {
            System.out.println("Hello " + user.getName());
            filterAndAddUsers(user);

        }
        else
        {
                if (user != null)
                {
                System.out.println("Hello " + user.getName());
                filterAndAddUsers(user);

                }
                else
                {
                System.out.println(" Ensure Person is instantiated ! ");
                }

        } //  end of outer else
    } //  end of greet
    public void filterAndAddUsers(User user)
    {
       // add users with thier counts to the ArrayLIst
        int countUsers = 0; // must be 1 if user exist , else zero

       if(users.isEmpty())
       {
           user.incrementGreeting();
           users.add(user);
       }
       else
       {
           for(int index = 0; index < users.size(); index++)
           {
               if(users.get(index).getName().toLowerCase().equals(user.getName().toLowerCase()))
               {
                    users.get(index).incrementGreeting();
                    countUsers ++;


               }
           }

           if(countUsers == 1)
           {
               /* it's Ok, don't do anything*/
           }
           else
           {   user.incrementGreeting(); //if a user is greeted for the first time, its counter must at least be 1
               users.add(user);
           }

       }
        countUsers *= 0; // reset countUsers
        ///System.out.println(users);

    } // end of filterAndAddUsers


} // end of greet users class