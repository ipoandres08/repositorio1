
package Entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConModel {
    public static void main(String[] args){
    
        ConModel con = new ConModel();
        con.getConnection();
    }
public ConModel(){
      try {
            Class.forName("com.microsoft.sqlserver.jbdc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
}
    
public Connection getConnection(){
        Connection con = null;
        
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://LENOVO-PC:1433;databasename=Recetario","AdminDAN","SODACORP");
            System.out.println("Conexion Con Exito" + con);
}catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
}
}

