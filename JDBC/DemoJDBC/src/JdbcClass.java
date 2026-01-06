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

         int sid = 6;
         String sname = "thomas";
         int marks = 98;

         String url = "jdbc:postgresql://localhost:5432/postgres";
         String uname = "postgres";
         String password = "0000";
//         String sql = "select * from student;";
//         String sql = "Insert into student values("+ sid +", '"+ sname +"', "+ marks +");";
         String sql = "Insert into student values(?, ?, ?);";
//         String sql = "Update student set sname = 'pera pera' where sid = 5;";
//         String sql = "delete from student where sid = 5;";

         try {
             Class.forName("org.postgresql.Driver");
         } catch (ClassNotFoundException e) {
             throw new RuntimeException(e);
         }
         try {
             Connection con = DriverManager.getConnection(url, uname, password);
//             Statement st = con.createStatement();
             PreparedStatement st = con.prepareStatement(sql);
             st.setInt(1,sid);
             st.setString(2,sname);
             st.setInt(3,marks);
//             ResultSet rs = st.executeQuery(sql);
//             rs.next();
//             System.out.println(rs.getString("sname"));
//             while(rs.next()) {
//                 System.out.print(rs.getInt("sid") + " - ");
//                 System.out.print(rs.getString("sname") + " - ");
//                 System.out.println(rs.getInt("marks"));
//             }

             boolean status =  st.execute();
             System.out.println(status);

//             rs.close();
             st.close();
             con.close();
             System.out.println("Connection closed");
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
}
