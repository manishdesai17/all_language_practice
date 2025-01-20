import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Connection con = null;
        while (true) {
            System.out.println("Enter Database Name:");
            String dbtype = sc.next();
            databaseconnection data = Factorydatabase.getdatabasetype(dbtype);
            con = data.connect();
            if (con != null) {
                System.out.println(dbtype + " connection successfully.....");
            }
            data.selectQuery();
            con = data.disconnect();
            if (con == null) {
                System.out.println(dbtype+" disconnection successfully....");
            }
        }
    }
}