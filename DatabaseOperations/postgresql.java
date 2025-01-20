import java.sql.*;

public class postgresql implements databaseconnection {
  Connection con;

  public Connection connect() {
    try {

      Class.forName("org.postgresql.Driver");
      System.out.println("load...");
      con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sms", "postgres", "root");
      Statement smt = con.createStatement();
      ResultSet rs = smt.executeQuery("select*from student");
      while (rs.next()) {
        int id = rs.getInt("sid");
        String name = rs.getString("sname");
        System.out.println("student id:" + id);
        System.out.println("student name:" + name);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return con;
  }

  public Connection disconnect() {
    try {
      con.close();
      con = null;
    } catch (Exception e) {
      System.out.println(e);
    }
    return con;
  }
}
