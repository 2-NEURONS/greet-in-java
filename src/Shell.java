package net.greet;
import java.util.*;

public class Shell
{

    /*
       this is a shell , it interpret commands and make appropriate calls
   */
          GreetUsers greetusers; // an instance of greet users
          User user; // a user
          GreetedUsers greetedusers; // a list of greeted users
          List<User> temporaryUser; // list of uniqueUsers with no duplicates
          int count = 0;

       public Shell(String command , List<User> temporaryUser )
       {

            this.temporaryUser = temporaryUser;
            interpreter(command , null , Languages.getEnglish()); // invoke the interpreter

       }
       public Shell(String command , String username , List<User> temporaryUser )
       {

            this.temporaryUser = temporaryUser;
            interpreter(command , username , Languages.getEnglish() ); // invoke the interpreter

       }
       public Shell(String command , String username , String language , List<User> temporaryUser )
       {

            this.temporaryUser = temporaryUser ;
            interpreter(command , username , language); // invoke the interpreter

       }

       public void interpreter(String command , String username , String language )
       {

              user = new User(username, language);
              greetusers = new GreetUsers(user,temporaryUser);

              if(command.toLowerCase().equals("greet"))
              {
                  greetusers.greet(); // greet users and add them to a list
              }
              else if(command.toLowerCase().equals("greeted"))
              {

                  greetedusers = new GreetedUsers(temporaryUser , username);

              }
              else if(command.toLowerCase().equals("help"))
              {
                  //help shows a user an overview of all possible commands.

                  new Help().helpDescription(); // execute the help command
              }
              else if(command.toLowerCase().equals("counter"))
              {
                    CountGreetedUsers count = new CountGreetedUsers(temporaryUser);
                    System.out.println(count.uniqueUsers());

              }
              else if(command.toLowerCase().equals("clear"))
              {
                  //clear deletes of all users greeted and the reset the greet counter to 0,
                  // execute the clear command
                  ClearUser clearAuser = new ClearUser(temporaryUser , user.getName());

              }
              else if(command.toLowerCase().equals("exit"))
              {
                  System.exit(0);

              }
              else
              {
                  System.out.println("invalid command");

              }
       } // end of interpreter
} // end of shell
