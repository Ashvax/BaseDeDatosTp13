package basededatostp13;
import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BaseDeDatosTp13 {
    public static void main(String[] args){
        /*try {
            //Cargo Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión 
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            //Dar alta a un alumno. Insert
            String sql="INSERT INTO alumno (dni,apellido, nombre, fechaDeNacimiento, estado)"
            + "Values (45202852, 'Cuk', 'Gonzalo', '2005-10-03', true)";
            
            PreparedStatement ps =con.prepareStatement(sql);
            int filas= ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Alumno Agregado ");
            }
            System.out.println("Exito");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Driver ");
        } catch (SQLException ex) {
           int error=ex.getErrorCode();
           if(error==1146){
               JOptionPane.showMessageDialog(null, "Tabla Inexistente");
        }else if(error==1062){
              JOptionPane.showMessageDialog(null, "Dni Duplicado");
        }else if(error==1049){
            JOptionPane.showMessageDialog(null, "BD inexistente");
           }else {
            JOptionPane.showMessageDialog(null, "Error SQL");
        }
        }
        }
    }*/
 /*try {
    // Cargo Driver de conexión
    Class.forName("org.mariadb.jdbc.Driver");
    // Establecer la conexión
    String URL = "jdbc:mariadb://localhost:3306/universidad";
    String usuario = "root";
    String password = "";
    Connection con = DriverManager.getConnection(URL, usuario, password);
    
    // Dar alta a una materia (Insert)
    String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establecer los valores de los parámetros
    ps.setString(1, "Laboratorio 2"); // Reemplaza con el nombre de la materia que deseas agregar
    ps.setInt(2, 2024); // Reemplaza con el año en el que se imparte la materia
    ps.setBoolean(3, true); // Reemplaza con true si la materia está activa, false si no
    
    int filas = ps.executeUpdate();
    if (filas > 0) {
        JOptionPane.showMessageDialog(null, "Materia Agregada");
    }
    System.out.println("Exito");
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, "Error al cargar el Driver");
} catch (SQLException ex) {
    int error = ex.getErrorCode();
    if (error == 1146) {
        JOptionPane.showMessageDialog(null, "Tabla Inexistente");
    } else if (error == 1062) {
        JOptionPane.showMessageDialog(null, "Duplicado en la clave primaria");
    } else if (error == 1049) {
        JOptionPane.showMessageDialog(null, "Base de Datos Inexistente");
    } else {
        JOptionPane.showMessageDialog(null, "Error SQL");
    }
}
    }
    } */

    try {
    // Cargo Driver de conexión
    Class.forName("org.mariadb.jdbc.Driver");
    // Establecer la conexión
    String URL = "jdbc:mariadb://localhost:3306/universidad";
    String usuario = "root";
    String password = "";
    Connection con = DriverManager.getConnection(URL, usuario, password);
    
    // Inscribir Alumnos a Materias (Insert)
    String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establecer los valores de los parámetros
    ps.setDouble(1, 6.5); // Nota del alumno
    ps.setInt(2, 7); // ID Del alumno
    ps.setInt(3, 2); // Id de la materia 
    
    int filas = ps.executeUpdate();
    if (filas > 0) {
        JOptionPane.showMessageDialog(null, "Inscripcion Agregada");
    }
    System.out.println("Exito");
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, "Error al cargar el Driver");
} catch (SQLException ex) {
    int error = ex.getErrorCode();
    if (error == 1146) {
        JOptionPane.showMessageDialog(null, "Tabla Inexistente");
    } else if (error == 1062) {
        JOptionPane.showMessageDialog(null, "Duplicado en la clave primaria");
    } else if (error == 1049) {
        JOptionPane.showMessageDialog(null, "Base de Datos Inexistente");
    } else {
        JOptionPane.showMessageDialog(null, "Error SQL");
    }
}
    }
    }
*/
    /*try {
              //Cargo Driver de conexión
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión 
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
    
        //Obtener los datos de los alumnos activos.
             String sql="SELECT * FROM alumno WHERE estado=true";
             PreparedStatement ps=con.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
             
                 int id=rs.getInt("idAlumno");
                 int dni=rs.getInt("dni");
                 String apellido=rs.getString("apellido");
                 String nombre=rs.getString("nombre");
                 LocalDate fechaN=rs.getDate("fechaDeNacimiento").toLocalDate();
                 boolean estado=rs.getBoolean("estado");
                 
                 System.out.println("-----------------------------");
                 System.out.println("Dni "+dni);
                 System.out.println("Apellido "+apellido);
                 System.out.println("Fecha"+fechaN.toString());
             }
             
             con.close();

            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver");
        } catch (SQLException ex) {
            int error=ex.getErrorCode();
            if(error==1146){
                JOptionPane.showMessageDialog(null,"Tabla inexistente");
            }else if(error==1062){
            
                JOptionPane.showMessageDialog(null,"Dni duplicado");
            }else if(error==1049){
            
                JOptionPane.showMessageDialog(null,"BD inexistente");
            }else {
            
                JOptionPane.showMessageDialog(null,"Error SQL");
                
            }
        }
    }
}*/