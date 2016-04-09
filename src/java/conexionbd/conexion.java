/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

/**
 *
 * @author jeferson
 */
public class conexion {
    private static Connection con;
    public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
       PreparedStatement ps = null;
        try{
            
        
            
        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:sqlservert://localhost:1527;databaseName=registro";
//        String user="root";
//        String  pass="";
         con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/registro","root","");
        ps= con.prepareStatement(sql);
               
        }catch(ClassNotFoundException e){
             System.out.println("error"+ e);
            
        }catch(SQLException e){
            System.out.println("error"+ e);
        }
        return ps; 
    }
    public Connection getConection(){
        return con;
    }
//    public static void main(String[] args) throws ClassNotFoundException, SQLException{
//        conexion con= new conexion();
//    }
}
