package operation.display;
import java.sql.*;

public class Display {
    public static void displayAll(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from menu");
            System.out.println("Working");
            while (rs.next())
                System.out.println( rs.getString(1) + "  " + rs.getString(2) + "  "+rs.getInt(3));
    }
    public static void displayCatagories(Connection con) throws SQLException {
        Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select distinct Catagory from menu");
            System.out.println("Working");
            while (rs.next())
                System.out.println( rs.getString(1));
    }
}
