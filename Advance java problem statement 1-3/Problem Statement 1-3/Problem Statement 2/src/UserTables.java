import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserTables {
   static final String DB_URL = "jdbc:mysql://localhost:3306/bookstore";
   static final String USER = "root";
   static final String PASS = "Pooja511#";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          
          
    	  String sql2 = "CREATE TABLE User " +
                  "(first_name VARCHAR(255), " +
                  " address VARCHAR(255), "+
                  " email VARCHAR(255), " +
                  " uname VARCHAR(255), " +
                  " pass VARCHAR(225), " + 
                  " regdate DATE )" ;
                  
                  
          
          

         stmt.executeUpdate(sql2);
         System.out.println("Created table in given database..."); 
         
      }
      catch (SQLException e) {
         e.printStackTrace();
      }
      
   }
}
