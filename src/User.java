package net.greet;
public class User
{


      private String language; // store user language
      private String name; // store user naam
       int greetedCount;

       public User(String name , String language)
       {

              setName(name);
              setLanguage(language);

       }
       public void setName(String name)
       {
           this.name = name;
       }
       public  String getName() {
 return this.name;
 }
       public void setLanguage(String language) {
 this.language = language;
 }
       public  String getLanguage() {
 return this.language;
 }
       public String toString()
       {
         return  "USERNAME| "+getName()+" |" + " GREETED IN |"+ getLanguage() +"| Greet Count : "+getGreetedCount();
       }
       public int getGreetedCount() {
 return greetedCount;
 }
       public void incrementGreeting() {
 greetedCount ++;
 }


}
