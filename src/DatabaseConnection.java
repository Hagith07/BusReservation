
import java.sql.*;
public class DatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/busreserve";
    private static final String userName = "root";
    private static final String passWord = "apple123";

    public static Connection getConnection() throws SQLException
    {
        return  DriverManager.getConnection(url,userName,passWord);
    }

}