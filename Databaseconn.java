
package databaseconn;
import java.sql.*;

public class Databaseconn {

    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
        if (con!=null)
        {
            System.out.println("connected..");
        }
        else
            System.out.println("connection failed..");
          
    }
    
}
