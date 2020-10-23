
package Entity;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConModelTEST {
    public static void main(String[] args){
     Connection con = null;
     try {
            Class.forName("org.postgresql.Driver"); 
            con = DriverManager.getConnection("jdbc:postgresql://motty.db.elephantsql.com:5432/bmfkrrne","bmfkrrne","QqHVEx3Ovha37eRxLFhDpwI12gGkHvyx");
    }
     catch(Exception e)
     {
     e.printStackTrace();
     System.err.println(e.getClass().getName()+": "+e.getMessage());
     System.exit(0);
     
     }
    System.out.println("conexion exitosa a la BD");
}
}

