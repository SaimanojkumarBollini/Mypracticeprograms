import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDetailsDb {
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (Exception e) {
            System.out.println(e);
      }
      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "Pooja511#");
      System.out.println("Connection is created successfully:");
      stmt = (Statement) conn.createStatement();
     
      
      
      
      
      String query1 = "INSERT INTO user " + "VALUES ('Pooja','Andhra Pradesh','Poojareddyindukuru@gmail.com','PoojaReddy','Reddy511#','2022-05-02')";
      stmt.executeUpdate(query1);
      
        
      
    
      
      
      System.out.println("Record is inserted in the table successfully..................");
      } catch (SQLException excep) {
         excep.printStackTrace();
      } catch (Exception excep) {
         excep.printStackTrace();
      } finally {
         try {
            if (stmt != null)
               conn.close();
         } catch (SQLException se) {}
         try {
            if (conn != null)
               conn.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }  
      }
      System.out.println("Please check it in the MySQL Table......... ��..");
   }
}