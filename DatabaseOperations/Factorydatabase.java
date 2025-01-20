class Factorydatabase {
   
    public static databaseconnection getdatabasetype(String dbtype)
    {
        databaseconnection objDc=null;
      switch (dbtype)
       {
        case "mysql":objDc=new mysql();
        break;  
        case "sqlite":objDc=new sqlite();
        break;         
        case "postgresql":objDc=new postgresql();
        default:
        System.out.println("Database NotFound...! ");
            break;
       }
      return objDc;

    }
}
