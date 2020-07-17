package net.greet;
import java.util.*;

public class CommandPrompt
{

     // this class emulates a command prompt , by continuously asking a user to enter a command
     String[] commandDetails = new String[4]; // this array stores contents of a splitted command input so that i can know if a command is followed by a parameter
     String defaultLanguage = "English";// this is a default language if a user doesn't specify one
     String command = null; // this String stores a command as a line of text with words separated with a space
     String username = null; // store a user name passed along with a command
     // this list holds a reference to an instance that was created in main
     List<User> temporaryUser; // this list stores every user greeted in the application including duplicates
      /*
            constructor
     */
     public CommandPrompt( List<User> temporaryUser )
     { // constructor

            this.temporaryUser  = temporaryUser ; // instantiate the list of greeted users
            prompt(); // prompt a user for a command until exit command is passed

     }
     public void prompt()
     {
     // this method continuously  asks a user to enter a command
     do
     {
           // prompt for commands
           System.out.println("Enter a command :~$  "); // ask for a command
           command = new Scanner(System.in).nextLine(); // read the command
           commandDetails = command.split("[ ]"); // read the contents of the current command by splitting it
           commandProcessor(); // process commands before interpreting

      }
      while(!( commandDetails[0].equalsIgnoreCase("EXIT") ) ); // terminate if exit command is passed
           System.out.println("Application terminated.............");

      }  // end of prompt method
      public void commandProcessor()
      {
          /*
              this is a command processor , it simple checks if a command has been passed with a parameter,
              i.e , i know if a command is not passed with any parameter , command details's length will be zero e.t.c
        */
              if( commandDetails.length == 1 ) // if the command is not followed by any parameter
              new Shell( commandDetails[0] , temporaryUser );// pass the command to the shell for interpretation
              else if( commandDetails.length == 2 ) // if the command is followed by 1 parameter
              new Shell(commandDetails[0] , commandDetails[1] , temporaryUser); // pass the command and its parameter to the shell
              else if( commandDetails.length == 3) // if the command is followed by two parameters
              new Shell(commandDetails[0] , commandDetails[1] , commandDetails[2] , temporaryUser); // pass the command and both of its parameters to the shell


      } // end of command processor

} // end of the class
