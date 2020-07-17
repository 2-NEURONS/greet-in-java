package net.greet;
import java.sql.*;

public class ConnectDataBase
{



    public ConnectDataBase() throws SQLException
    {


        try
        {

             // load the jdbc driver
             // load the jdbc driver
             Class.forName ("org.h2.Driver").newInstance();
            // set the jdbc connection string
            // connect to the database
            System.out.println("Connecting to a selected database...");
            Connection conn = DriverManager.getConnection ("jdbc:h2:~/testdb", "sa", "");
            System.out.println("Connected database successfully...");
            Statement stmt = null;

            // execute a querry
            //STEP 3: Execute a query

            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql =  "CREATE TABLE   REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();



        }
        catch(Exception sqlError)
        {

          sqlError.printStackTrace();
        }

    }




}
