import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
   static final String DB_URL = "jdbc:mysql://localhost:3306/bookstore";
   static final String USER = "root";
   static final String PASS = "Pooja511#";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE Books " +
                   "(Book_id INTEGER not NULL, " +
                   " Book_name VARCHAR(255), " + 
                   " Author VARCHAR(255), " + 
                   " Price FLOAT, " + 
                   " PRIMARY KEY ( Book_id ))";
          
          

         stmt.executeUpdate(sql);
         System.out.println("Created table in given database..."); 
         
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
      
   }
}
