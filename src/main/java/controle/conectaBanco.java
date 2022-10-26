/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conectaBanco {
    
    Statement stm ;
     public ResultSet rs;
     public String driver = "org.postgresql.Driver";
     public String caminho = "jdbc:postgresql://localhost:5432/sistema";
     public String usuario ="postgres";
     public  String senha = "1234";
     public  Connection conn;
    
    public void conexao(){
        
        try {
            System.setProperty("jdbc.Drivers" , driver);
            
            conn = DriverManager.getConnection(caminho, usuario, senha);
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO DE CONEXÃO \n:"+ ex.getMessage());
        }
    
}
    public void executaSQL(String sql){
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO DE CONEXÃO EXECUTA SQL \n:"+ ex.getMessage());
        }
        
    }
    
    public void desconecta(){
        
        try {    
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Conexão Encerrada\n:"+ ex.getMessage());
        }
    }

}
