/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class ConnectDB {
    Connection con = null;
    
    public static Connection dbProcess(){
        try {
            Class.forName("org.sqlite.JDBC");
            //Jangan lupa untuk mengganti alamat sqlite berada, sesuai dengan letak file masing-masing
            Connection con = DriverManager.getConnection("jdbc:sqlite:E:\\Coding Stuff\\Java\\TubesBank\\bankdb.sqlite");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
