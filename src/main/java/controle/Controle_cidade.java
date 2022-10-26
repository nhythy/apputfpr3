/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Modelo_cidades;

/**
 *
 * @author nhyth
 */
public class Controle_cidade {
    conectaBanco connCidade = new conectaBanco();
    
    public void Inserir_Cidade(Modelo_cidades mod) {
        connCidade.conexao();
        try {
  
            PreparedStatement pst = connCidade.conn.prepareStatement("insert into cidades(nome_cidade , id_estado)values(?,?) ");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getCod_estado());
            pst.execute();
            JOptionPane.showMessageDialog(null,"correto armazenamento" );
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao  armazenar"+ ex );
        }
        connCidade.desconecta();
    
}
    public void exclui_cidade(Modelo_cidades mod){
        try {
            connCidade.conexao();
            PreparedStatement pst = connCidade.conn.prepareStatement("delete from cidades where id_cidade=?");
            pst.setInt(1,mod.getCodigo());
            pst.execute();
            JOptionPane.showInternalMessageDialog(null, "excluido com sucesso" );
            
                    } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "erro ao excluir" + ex);
        }
        connCidade.desconecta();
    }
    public void Altera_cidade(Modelo_cidades mod){
       
        connCidade.conexao();
        try {
            
            PreparedStatement pst = connCidade.conn.prepareStatement("update  cidades set nome_cidade = ? , id_estado = ? where id_cidade= ?");
            pst.setString(1, mod.getNome());
            pst.setInt(2, mod.getCod_estado());
            pst.setInt(3, mod.getCodigo());
            pst.execute();
            JOptionPane.showInternalMessageDialog(null, "Alterado com sucesso" );
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "erro ao alterar" + ex);
        }
        
    }
    
    
    
}
