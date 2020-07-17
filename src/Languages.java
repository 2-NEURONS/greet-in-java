package net.greet;

public class Languages
{
     // this class defines languages a user can be greeted
     public static  String[] languages = new String[]{"Xhosa","Zulu","English"}; // known languages
      /*
        define methods to access predefined languages to be used later for decision making
        when greeting a user.
    */

      public static String getXhosa() {
        return languages[0]; // return isixhosa
 }
      public static String getZulu() {
        return languages[1]; // return isiZulu
 }
      public static String getEnglish() {
        return languages[2]; // return isixhosa
 }
      // languages that this app can greet in
      public String toString()
  {
      return "[ "+getXhosa() +" "+ getZulu() +" "+ getEnglish()+" ]";
  }

} // end of languages help
