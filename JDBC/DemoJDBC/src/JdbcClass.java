import java.sql.*;

public class JdbcClass {
     static void main(String[] args) {

         /*
         *  IMPORT PACKAGES
         *  LOAD DRIVERS
         *  ESTABLISH CONNECTION
         *  CREATE STATEMENTS
         *  EXECUTE STATEMENTS
         *  PROCESS RESULT
         *  CLOSE CONNECTION
         */
         String url = "jdbc:postgresql://localhost:5432/postgres";
         String uname = "postgres";
         String password = "0000";
         String sql = "select sname from student where sid = 1";

         try {
             Class.forName("org.postgresql.Driver");
         } catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
         }
         try {
             Connection con = DriverManager.getConnection(url, uname, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             rs.next();

             System.out.println(rs.getString("sname"));

             con.close();
             System.out.println("Connection closed");
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
}
