package operation.insert;

import java.sql.*;

public class Insert {
    public static void insertRecord(Connection con, String[] args) {
        try {
            System.out.println("Working");
            String query = " insert into menu(FOOD_NAME,CATEGORY,FOOD_TYPE,PRICE) values (?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, args[1]);
            preparedStmt.setString(2, args[2]);
            preparedStmt.setString(3, args[3]);
            preparedStmt.setInt(4, Integer.parseInt(args[4]));
            preparedStmt.execute();
        } catch (Exception e) {
            System.out.println("Wrong command\nType \"-h\" to get help");

        }

    }
}
