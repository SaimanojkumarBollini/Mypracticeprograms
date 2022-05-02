import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderDetailsDb {
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
     
      
      
      
      
      String query1 = "INSERT INTO Order_Details " + "VALUES (1001, 1 , 'Pooja', '1111111111', 'AP','2022-05-02', 1)";
      stmt.executeUpdate(query1);
      
       query1 = "INSERT INTO Order_Details " + "VALUES (1002, 2 , 'Raj', '1111111111', 'Delhi','2022-05-02', 2)";
      stmt.executeUpdate(query1);
      
      query1 = "INSERT INTO Order_Details " + "VALUES (1003, 3 , 'Rohit', '1111111111', 'Haryana','2022-05-02', 4)";
      stmt.executeUpdate(query1);
      
      query1 = "INSERT INTO Order_Details " + "VALUES (1004, 4 , 'Avinash', '1111111111', 'Patna','2022-05-02', 2)";
      stmt.executeUpdate(query1);
      
      query1 = "INSERT INTO Order_Details " + "VALUES (1005, 5 , 'Yuvaraj', '1111111111', 'Varanashi','2022-05-02', 6)";
      stmt.executeUpdate(query1);
      
      query1 = "INSERT INTO Order_Details " + "VALUES (1006, 6 , 'Himanshu', '1111111111', 'Gaya','2022-05-02', 8)";
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
      System.out.println("Please check it in the MySQL Table......... ……..");
   }
}