package jdbcConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcMain
{
    public static void main (String[] args)
    {
        try
        {
            Class.forName ("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@192.168.1.30:1521:xe", "employee",
                "aavanor");
            Statement stmt = con.createStatement ();
            stmt.executeUpdate ("CREATE TABLE REG (id INTEGER not NULL,  first VARCHAR(255) )");
            stmt.executeUpdate ("INSERT INTO REG VALUES (3, 'ss')");
            stmt.executeUpdate ("UPDATE  REG SET first = 'anna' WHERE id in (1)");
            stmt.executeQuery ("DELETE FROM REG WHERE id = 2");
            ResultSet rs = stmt.executeQuery ("select * from REG");
            while (rs.next ())
                System.out.println (rs.getInt (1) + "  " + rs.getString (2));
            con.close ();
        }
        catch (Exception e)
        {
            System.out.println (e);
        }
    }
}
