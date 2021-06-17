package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion{
    public Connection BDE(){
        Connection conexion = null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo hacer la conexion" +e);
        }
        return conexion;
    }
}
