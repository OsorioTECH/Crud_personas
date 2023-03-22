
package Clases;

import java.sql.*;

public class Conexion {
    
    Connection con;
    
    public Connection conexion(){
        try {
            //Class.forName("con.mysql.jdbc.Driver");
            String myBD = "jdbc:mysql://localhost:3306/crud_bd?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "");
            
            System.out.println("conectado");
            return con;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
