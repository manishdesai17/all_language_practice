import java.sql.Connection;

public interface databaseconnection {

    public Connection connect();
    public Connection disconnect();
   
}
