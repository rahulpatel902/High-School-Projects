package Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class StudentsInfo {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/studentinfo";
        String username = "root";
        String password = "mysql";
        
        try {
            Connection C = DriverManager.getConnection(URL, username, password);
            Statement stmt = C.createStatement();
            String query = "select * from students";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                for (int i = 1; i <= 6; i++) {
                    System.out.print(rs.getString(i));
                    System.out.print("  |  ");
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }}
