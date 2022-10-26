/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Modelo_telefone;

/**
 *
 * @author nhyth
 */
public class Controle_telefone {
    
    
    
    
    conectaBanco connex = new conectaBanco();
    Modelo_telefone mod = new Modelo_telefone();
    
 public void inserir(Modelo_telefone mod){
   connex.conexao();
   try{
       PreparedStatement pst = connex.conn.prepareStatement(" insert into telefones(numero_tel)values(?)");
       pst.setString(1,mod.getTel());
       pst.execute();
       JOptionPane.showMessageDialog(null,"dados inseridos com sucesso");
       
   }catch(SQLException ex){
     JOptionPane.showMessageDialog(null,"erro ao inserir dados" + ex);  
   }
   
   connex.desconecta();
 } 
   
   
    public void alterar(Modelo_telefone mod){
      connex.conexao();
      PreparedStatement pst;
      
      try{
          pst = connex.conn.prepareStatement("update telefones set numero_tel = ? where id_telefone = ?");
          pst.setString(1,mod.getTel());
          pst.setInt(2,mod.getCod());
          pst.execute();
          JOptionPane.showMessageDialog(null,"dados alterados com sucesso"); 
      }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao alterar dados" + ex);   
      } 
          
      connex.desconecta();  
        
    } 
    public void Excluir(Modelo_telefone mod){
       connex.conexao();
       PreparedStatement pst;
       try{
       pst = connex.conn.prepareStatement("delete from telefones where id_telefone = ?");
       pst.setInt(1,mod.getCod());
       pst.execute();
       JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
       
   }catch(SQLException ex){
     JOptionPane.showMessageDialog(null,"erro ao excluir dados" + ex);  
   }
   
   connex.desconecta();
 } 
  
    public Modelo_telefone primeiro(){
       connex.conexao();
       connex.executaSQL("select * from telefones");
       try{
        connex.rs.first();
        mod.setCod(connex.rs.getInt("id_telefone"));
        mod.setTel(connex.rs.getString("numero_tel"));
    
       }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro " + ex);   
           
       }
        
        connex.desconecta();
        return mod;
        
        
        
        
    }
    public Modelo_telefone ultimo(){
       connex.conexao();
       connex.executaSQL("select * from telefones");
       try{
        connex.rs.last();
        mod.setCod(connex.rs.getInt("id_telefone"));
        mod.setTel(connex.rs.getString("numero_tel"));
    
       }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro " + ex);   
           
       }
        
        connex.desconecta();
        return mod;
    
    
    
       }
public Modelo_telefone anterior(){
       connex.conexao();
       connex.executaSQL("select * from telefones");
       try{
        connex.rs.previous();
        mod.setCod(connex.rs.getInt("id_telefone"));
        mod.setTel(connex.rs.getString("numero_tel"));
    
       }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro " + ex);   
           
       }
        
        connex.desconecta();
        return mod;
    
    
    
       }

public Modelo_telefone proximo(){
       connex.conexao();
       connex.executaSQL("select * from telefones");
       try{
        connex.rs.next();
        mod.setCod(connex.rs.getInt("id_telefone"));
        mod.setTel(connex.rs.getString("numero_tel"));
    
       }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro " + ex);   
           
       }
        
        connex.desconecta();
        return mod;
    
    
    
       }







}
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    


