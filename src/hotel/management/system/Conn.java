
package hotel.management.system;
import java.sql.*;
public class Conn {
    Connection c;
    Conn()
    {
        try
        {
               Class.forName("com.mysql.cj.jdbc.Drivers");
                       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/");
                       
        }
    catch (Exception e)
    {
        e.printStackTrace();
    } 
}
}