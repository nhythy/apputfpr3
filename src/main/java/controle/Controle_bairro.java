/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Modelo_bairro;

/**
 *
 * @author nhyth
 */
public class Controle_bairro {
    
    conectaBanco conex = new conectaBanco();
    conectaBanco conexPesq = new conectaBanco();
    int codCid;
    String cidade;
     public void Gravar (Modelo_bairro mod){
         
         conex.conexao();
         try{
             
            conex.executaSQL("select * from cidades where nome_cidade='"+ mod.getCidade()+ "'") ;
            conex.rs.first();
            codCid = conex.rs.getInt("id_cidade");
             PreparedStatement pst = conex.conn.prepareStatement("insert into bairro(nome_bairro , id_cidade)values(?,?) ");
             pst.setString(1, mod.getNome());
             pst.setInt(2, codCid);
             pst.execute();
             JOptionPane.showMessageDialog(null, "dados inseridos");
         }catch(SQLException ex){
             
          JOptionPane.showMessageDialog(null, "erro ao inseridos dados"+ex);   
             
         }
         conex.desconecta();
     }
     public Modelo_bairro Primeiro(){
         
      Modelo_bairro mod = new Modelo_bairro();
      conex.conexao();
      conexPesq.conexao();
      conex.executaSQL("Select * from bairro");
      try{
          conex.rs.first();
          conexPesq.executaSQL("select * from cidades where id_cidade=?" + conex.rs.getInt("id_cidade"));
          conexPesq.rs.first();
          mod.setCod(conex.rs.getInt("id_bairro"));
          mod.setNome(conex.rs.getString("nome_bairro"));
          mod.setCidade(cidade);
      }catch(SQLException ex ){
          
      JOptionPane.showMessageDialog(null, "erro ao mostrar dados"+ex); 
      }
          
       conex.desconecta();
       conexPesq.desconecta();
       return mod;
      
     }
     public Modelo_bairro Ant(){
         
     Modelo_bairro mod = new Modelo_bairro();
      conex.conexao();
      conexPesq.conexao();
      conex.executaSQL("Select * from bairro");
      try{
          conex.rs.first();
          conexPesq.executaSQL("select * from cidades where id_cidade=?" + conex.rs.getInt("id_cidade"));
          conexPesq.rs.first();
          cidade = conexPesq.rs.getString("nome_cidade");
          mod.setCod(conex.rs.getInt("id_bairro"));
          mod.setNome(conex.rs.getString("nome_bairro"));
          mod.setCidade(cidade);
      }catch(SQLException ex ){
          
      JOptionPane.showMessageDialog(null, "erro ao mostrar dados"+ex); 
      }
          
       conex.desconecta();
       conexPesq.desconecta();
       return mod;    
          
         
     }
     
     
     public Modelo_bairro Prox(){
         
         Modelo_bairro mod = new Modelo_bairro();
      conex.conexao();
      conexPesq.conexao();
      conex.executaSQL("Select * from bairro");
      try{
          conex.rs.first();
          conexPesq.executaSQL("select * from cidades where id_cidade=?" + conex.rs.getInt("id_cidade"));
          conexPesq.rs.first();
          cidade = conexPesq.rs.getString("nome_cidade");
          mod.setCod(conex.rs.getInt("id_bairro"));
          mod.setNome(conex.rs.getString("nome_bairro"));
          mod.setCidade(cidade);
      }catch(SQLException ex ){
          
      JOptionPane.showMessageDialog(null, "erro ao mostrar dados"+ex); 
      }
          
       conex.desconecta();
       conexPesq.desconecta();
       return mod;
         
  
         
         
     }
     
     

     
     public Modelo_bairro Ult(){
         
         
         Modelo_bairro mod = new Modelo_bairro();
      conex.conexao();
      conexPesq.conexao();
      conex.executaSQL("Select * from bairro");
      try{
          conex.rs.last();
          conexPesq.executaSQL("select * from cidades where id_cidade=?" + conex.rs.getInt("id_cidade"));
          conexPesq.rs.first();
          cidade = conexPesq.rs.getString("nome_cidade");
          mod.setCod(conex.rs.getInt("id_bairro"));
          mod.setNome(conex.rs.getString("nome_bairro"));
          mod.setCidade(cidade);
      }catch(SQLException ex ){
          
      JOptionPane.showMessageDialog(null, "erro ao mostrar dados"+ex); 
      }
          
       conex.desconecta();
       conexPesq.desconecta();
       return mod;
         
     
     }
     
     public void Editar (Modelo_bairro mod){
         
       conex.conexao();
       conexPesq.conexao();
       try{
          conexPesq.executaSQL("select * from cidades where nome_cidade=?" +mod.getNome());
          conexPesq.rs.first();
          codCid = conex.rs.getInt("id_cidade");
          PreparedStatement pst = conex.conn.prepareStatement("update bairro set nome_bairro=?, id_cidade=? where id_bairro");
           pst.setString(1,mod.getNome());
           pst.setInt(2, codCid);
           pst.setInt(3, mod.getCod());
           pst.execute();
           JOptionPane.showMessageDialog(null,"dados alterados com sucesso");
        
       }catch(SQLException ex){
           
          JOptionPane.showMessageDialog(null,"erro ao  alterados dados"); 
           
       }
         
       conex.desconecta();
       conexPesq.desconecta();
         
         
     }
     public void Excluir(Modelo_bairro mod){
       conex.conexao();
       
       try{
       PreparedStatement pst = conex.conn.prepareStatement("delete from bairro where id_bairro");  
        pst.setInt(1,mod.getCod());
        pst.execute();
        JOptionPane.showMessageDialog(null,"dados excluidos com sucesso");
         
       }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"erro ao  excluir dados"); 
     }
    
    conex.desconecta();

}}
