import java.sql.*;

class mysql implements databaseconnection {
  // String ab="SELECT * FROM student";
  Connection con;

  public Connection connect() {
    try {

      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
      // Statement smt = con.createStatement();
      // ResultSet rs = smt.executeQuery("select*from student");
      // while (rs.next()) {
      //   int id = rs.getInt("sid");
      //   String name = rs.getString("sname");
      //   System.out.println("student id:" + id);
      //   System.out.println("student name:" + name);
     // }
    } catch (Exception e) {
      System.out.println(e);
    }
    return con;
  }
  public void selectQuery()
  {
    try {
      Statement smt = con.createStatement();
      ResultSet rs = smt.executeQuery("select*from studentt");
      while (rs.next()) {
        int id = rs.getInt("sid");
        String name = rs.getString("sname");
        System.out.println("student id:" + id);
        System.out.println("student name:" + name);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
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
