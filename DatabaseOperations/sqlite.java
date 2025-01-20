import java.sql.*;

public class sqlite implements databaseconnection {
    Connection con = null;

    public Connection connect() {
        // String q="select * from student";
        try {
    Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:sqlite:sqlitedb.db");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select * from student");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("student id:" + id);
                System.out.println("student name:" + name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }return con;
    }

    public Connection disconnect() {
        try {
            if (con != null) {
                con.close();
                System.out.println("connection is closed.......!");
                con = null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
