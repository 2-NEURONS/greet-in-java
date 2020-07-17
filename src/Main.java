package net.greet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
       public static void main(String ... cdm_args) throws SQLException
       {
              /*
               create an empty list that will be used for in-memory persistence
               

            */

           List<User> temporaryUser = new ArrayList();
           new CommandPrompt(temporaryUser); // pass a heap memory address of this list to command prompt

       } //end of main method

} //  end of Main
