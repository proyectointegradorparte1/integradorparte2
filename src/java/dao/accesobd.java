/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexionbd.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.modelo1;

/**
 *
 * @author jeferson
 */
public class accesobd extends conexionbd.conexion{
    
public void addNew(modelo1 n){
        try {
            PreparedStatement ps = conexion.getPreparedStatement("INSERT INTO datos (id,nombre,apellido,correo,telefono,usuario,pass) VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, n.getId());
            ps.setString(2,n.getNombre());
            ps.setString(3,n.getApellido());
            ps.setString(4,n.getCorreo());
            ps.setString(5,n.getTelefono());
            ps.setString(6,n.getUsuario());
            ps.setString(7,n.getPass());
            ps.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(accesobd.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    public static List<modelo1> getAll(){
      List<modelo1> ls = new LinkedList<>();
        try {
            ResultSet rs= conexion.getPreparedStatement(" SELECT * FROM datos").executeQuery();
            while (rs.next()){
            modelo1 n= new modelo1(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(accesobd.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
              
            
      return ls;
    }
    public static List<modelo1> getNewById(int id){
      List<modelo1> ls = new LinkedList<>();
      String sql= "select * from datos where id = " +id;
        try {
            ResultSet rs= conexion.getPreparedStatement(sql).executeQuery();
            while (rs.next()){
            modelo1 n= new modelo1(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            ls.add(n);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(accesobd.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
              
            
      return ls;
    }
    
//    public static List<modelo1> Nombre(String nombre){
//      List<modelo1> ls = new LinkedList<>();
//      String sql= "select * from datos where nombre = " +nombre;
//        try {
//            ResultSet rs= conexion.getPreparedStatement(sql).executeQuery();
//            while (rs.next()){
//            modelo1 n= new modelo1(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//            ls.add(n);
//            }
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      
//        
//              
//            
//      return ls;
//    }
//    
    public void editar( int id, String nombre, String apellido, String correo, String telefono, String usuario, String pass ){
         
        try {
           String sql= "update datos set nombre = ?,apellido=?,correo=?,telefono=?,usuario=?,pass=?" + " where id = ?";
            PreparedStatement ps;
            ps = conexion.getPreparedStatement(sql);
              ps.setString(1, nombre);
              ps.setString(2, apellido);
              ps.setString(3, correo);
              ps.setString(4, telefono);
              ps.setString(5, usuario);
              ps.setString(6, pass);
              ps.setInt(7, id);
              ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(accesobd.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }
    
    public void eliminar(int id){
        try {
            String sql = "delete FROM datos where id = ?";
            PreparedStatement ps = conexion.getPreparedStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(accesobd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean autenticar(  String usuario, String pass){
         PreparedStatement ps = null;
            ResultSet rs = null;
        try {
           String sql= "select * from datos where usuario = ? and pass=? ";
            
            ps = conexion.getPreparedStatement(sql);
              ps.setString(1, usuario);
              ps.setString(2, pass);
              rs= ps.executeQuery();
           
             if(rs.absolute(1)){
                 return true;
             }
              
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }finally{
            try{
              if(getConection() != null ) getConection().close();
              if(ps!= null ) ps.close();
              if(rs != null ) rs.close();
            }catch( Exception e){
              System.out.println("Error "+ e);  
                
            }
           
        }
      
        return false;
    }
     public boolean autenticarroot(  String usuario, String pass, String codpermiso){
         PreparedStatement ps = null;
            ResultSet rs = null;
        try {
           String sql= "select * from datos where usuario = ? and pass=? and codpermiso=?  ";
            
            ps = conexion.getPreparedStatement(sql);
              ps.setString(1, usuario);
              ps.setString(2, pass);
              ps.setString(3, codpermiso);
              rs= ps.executeQuery();
           
             if(rs.absolute(1)){
                 return true;
             }
              
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }finally{
            try{
              if(getConection() != null ) getConection().close();
              if(ps!= null ) ps.close();
              if(rs != null ) rs.close();
            }catch( Exception e){
              System.out.println("Error "+ e);  
                
            }
           
        }
      
        return false;
    }
    
    public boolean consultausuario (  String nombre ){
         PreparedStatement ps = null;
            ResultSet rs = null;
        try {
           String sql= "select * from datos where nombre =? ";
            
            ps = conexion.getPreparedStatement(sql);
              ps.setString(1, nombre);
             
              rs= ps.executeQuery();
           
             if(rs.absolute(1)){
                 return true;
             }
              
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }finally{
            try{
              
              if(ps!= null ) ps.close();
              if(rs != null ) rs.close();
            }catch( Exception e){
              System.out.println("Error "+ e);  
                
            }
           
        }
      
        return false;
    }
    
//    public static void main(String[] args) {
//        DataAccess da= new DataAccess();
//        System.out.println(da.autenticarroot("jjborda", "jefersonjose", "92120322186"));
//    }
}

