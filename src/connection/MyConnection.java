package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private static String url = "jdbc:mysql://localhost:3306/computershop";
    private static String user = "root";
    private static String password = "";

    public static Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }

//    public static void main(String[] args) {
//        try {
//           Connection conn = MyConnection.getConnect();
//            System.out.print("oke");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}