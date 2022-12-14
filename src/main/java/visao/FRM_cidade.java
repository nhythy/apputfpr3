/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import controle.Controle_cidade;
import controle.ModeloTabela;
import controle.conectaBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modelo.Modelo_cidades;

/**
 *
 * @author nhyth
 */
public class FRM_cidade extends javax.swing.JFrame {

   conectaBanco connEstado = new conectaBanco();
   conectaBanco connCidade = new conectaBanco();
   Modelo_cidades mod = new Modelo_cidades();
   Controle_cidade control = new  Controle_cidade();
   
   
   
   
    public FRM_cidade() {
        initComponents();
      connEstado.conexao();
      connCidade.conexao();
        Preenchertabela("select * from cidades inner join estados on cidades.id_estado = estados.id_estado");
      
      connEstado.executaSQL("select * from estados order by nome_estado");
      jComboEstado.removeAllItems();
      try{
          connEstado.rs.first();
      do{
          jComboEstado.addItem(connEstado.rs.getString("nome_estado"));
      
      }while(connEstado.rs.next());
    }catch (SQLException ex){
    JOptionPane.showMessageDialog(rootPane, "Erro ao preencher" + ex);
        
}
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_cidade = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtf_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboEstado = new javax.swing.JComboBox<>();
        btn_adicionar = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        btn_deletar = new javax.swing.JButton();
        btn_primeiro = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCidade = new javax.swing.JTable();
        btn_cancelar = new javax.swing.JButton();

        tabela_cidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela_cidade);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de cadastro de cidades");
        setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        setForeground(new java.awt.Color(102, 102, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Codigo:");

        jtf_codigo.setToolTipText("Codigo cidade");
        jtf_codigo.setEnabled(false);

        jLabel3.setText("Nome :");

        jtf_nome.setToolTipText("Nome da cidade ");
        jtf_nome.setEnabled(false);
        jtf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_nomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Estados :");

        jComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEstadoActionPerformed(evt);
            }
        });

        btn_adicionar.setText("Adicionar");
        btn_adicionar.setToolTipText("Adiciona cidade");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.setToolTipText("Salva cidade ");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_alterar.setText("Alterar");
        btn_alterar.setToolTipText("Altera as informa??oes da cidade");
        btn_alterar.setEnabled(false);
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_deletar.setText("Deletar");
        btn_deletar.setToolTipText("Deleta cidade");
        btn_deletar.setEnabled(false);
        btn_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarActionPerformed(evt);
            }
        });

        btn_primeiro.setText("Primeiro");
        btn_primeiro.setToolTipText("Primeira cidade da rela????o");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_ultimo.setText("Ultimo");
        btn_ultimo.setToolTipText("Ultima cidade da rela????o");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_anterior.setText("Anterior");
        btn_anterior.setToolTipText("Volta a cidade anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_proximo.setText("Proximo");
        btn_proximo.setToolTipText("Exibe proxima cidade");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.setToolTipText("Saida");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        tabelaCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tabelaCidade);

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText("cancela opera??oes");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_nome))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_primeiro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_salvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_deletar))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(603, 603, 603)
                                .addComponent(btn_cancelar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_sair))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_adicionar)))
                        .addGap(17, 17, 17)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_sair)
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_adicionar)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_primeiro)
                    .addComponent(btn_anterior)
                    .addComponent(btn_proximo)
                    .addComponent(btn_deletar)
                    .addComponent(btn_alterar)
                    .addComponent(btn_salvar)
                    .addComponent(btn_ultimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nomeActionPerformed

    private void jComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEstadoActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
      dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
    
     try{   
     
     mod.setNome(jtf_nome.getText());
     connEstado.executaSQL(" select * from estados where nome_estado = '"+ jComboEstado.getSelectedItem()+ "'");
     
     connEstado.rs.first();
     mod.setCod_estado(connEstado.rs.getInt("id_estado"));
     Controle_cidade control = new Controle_cidade();
     control.Inserir_Cidade(mod);
     Preenchertabela("select * from cidades inner join estados on cidades.id_estado = estados.id_estado");
     jtf_nome.setEnabled(false);
      btn_salvar.setEnabled(false);
      btn_alterar.setEnabled(false);
      btn_cancelar.setEnabled(false);
      btn_deletar.setEnabled(false);
      btn_adicionar.setEnabled(true);
     
      jtf_nome.setText("");
      jtf_codigo.setText("");
     
     
     
     }catch(SQLException ex) {
         JOptionPane.showMessageDialog(rootPane,"erro ao cadastrar"+ ex);
     }
   
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
        
      btn_salvar.setEnabled(true);
      btn_alterar.setEnabled(true);
      btn_cancelar.setEnabled(true);
      btn_adicionar.setEnabled(false);
      btn_deletar.setEnabled(true);
      jtf_nome.setEnabled(true);
        
        
        try {
           connCidade.executaSQL("select * from cidades order by id_cidade");
           connCidade.rs.first();
           jtf_codigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
           jtf_nome.setText(connCidade.rs.getString("nome_cidade"));
           connEstado.executaSQL("select * from estados where id_estado =" + connCidade.rs.getInt("id_estado"));
           connEstado.rs.first();
           jComboEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
       } catch (SQLException ex) {
           //JOptionPane.showMessageDialog(rootPane,"erro ao setar o primeiro registro"+ ex);
       }
     
    }//GEN-LAST:event_btn_primeiroActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
      jtf_nome.setEnabled(true);
      btn_salvar.setEnabled(true);
      btn_alterar.setEnabled(true);
      btn_deletar.setEnabled(true);
      jtf_nome.setText("");
      jtf_codigo.setText("");
      btn_adicionar.setEnabled(false);
      btn_cancelar.setEnabled(true);
      
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
      
      btn_salvar.setEnabled(true);
      btn_alterar.setEnabled(true);
      btn_cancelar.setEnabled(true);
      btn_adicionar.setEnabled(false);
      btn_deletar.setEnabled(true);
       jtf_nome.setEnabled(true);
        
        
        
        try {
           connCidade.executaSQL("select * from cidades order by id_cidade");
           connCidade.rs.last();
           jtf_codigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
           jtf_nome.setText(connCidade.rs.getString("nome_cidade"));
           connEstado.executaSQL("select * from estados where id_estado =" + connCidade.rs.getInt("id_estado"));
           connEstado.rs.last();
           jComboEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
       } catch (SQLException ex) {
           //JOptionPane.showMessageDialog(rootPane,"erro ao setar o ultimo registro"+ ex);
       }
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
      
        
      btn_salvar.setEnabled(true);
      btn_alterar.setEnabled(true);
      btn_cancelar.setEnabled(true);
      btn_deletar.setEnabled(true);
      btn_adicionar.setEnabled(false);
    
      jtf_nome.setEnabled(true);
        
        
        
        
        
        
        
        try {
           //connCidade.executaSQL("select * from cidades order by id_cidade");
           connCidade.rs.next();
           jtf_codigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
           jtf_nome.setText(connCidade.rs.getString("nome_cidade"));
           connEstado.executaSQL("select * from estados where id_estado =" + connCidade.rs.getInt("id_estado"));
           connEstado.rs.next();
           jComboEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
       } catch (SQLException ex) {
           //JOptionPane.showMessageDialog(rootPane,"erro ao setar o proximo registro"+ ex);
       }
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
     
       btn_salvar.setEnabled(true);
      btn_alterar.setEnabled(true);
      btn_cancelar.setEnabled(true);
      btn_adicionar.setEnabled(false); 
      btn_deletar.setEnabled(true);
       jtf_nome.setEnabled(true);
      
        
        
        
        
        try {
           //connCidade.executaSQL("select * from cidades order by id_cidade");
           connCidade.rs.previous();
           jtf_codigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
           jtf_nome.setText(connCidade.rs.getString("nome_cidade"));
           connEstado.executaSQL("select * from estados where id_estado =" + connCidade.rs.getInt("id_estado"));
           connEstado.rs.previous();
           jComboEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
       } catch (SQLException ex) {
           //JOptionPane.showMessageDialog(rootPane,"erro ao setar o anterior registro"+ ex);
       }
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarActionPerformed
       try {
           mod.setCodigo(Integer.parseInt(jtf_codigo.getText()));
           mod.setNome(jtf_nome.getText());
          mod.setCod_estado( connCidade.rs.getInt("id_estado"));
    control.exclui_cidade(mod);
    Preenchertabela("select * from cidades inner join estados on cidades.id_estado = estados.id_estado");
     
    jtf_nome.setEnabled(false);
      btn_salvar.setEnabled(false);
      btn_alterar.setEnabled(false);
      btn_cancelar.setEnabled(false);
      btn_deletar.setEnabled(false);
      btn_adicionar.setEnabled(true);
     
      jtf_nome.setText("");
      jtf_codigo.setText("");
    
    
    
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"erro ao excluir"+ ex);
       }
      
    }//GEN-LAST:event_btn_deletarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
       
       try {
          mod.setCodigo(Integer.parseInt(jtf_codigo.getText()));
          mod.setNome(jtf_nome.getText());
          connCidade.executaSQL("select * from estados where nome_estado = '" + jComboEstado.getSelectedItem()+"'");
          connCidade.rs.first();
          mod.setCod_estado( connCidade.rs.getInt("id_estado"));
   control.Altera_cidade(mod);
   Preenchertabela("select * from cidades inner join estados on cidades.id_estado = estados.id_estado");
   
   jtf_nome.setEnabled(false);
      btn_salvar.setEnabled(false);
      btn_alterar.setEnabled(false);
      btn_cancelar.setEnabled(false);
      btn_deletar.setEnabled(false);
      btn_adicionar.setEnabled(true);
     
      jtf_nome.setText("");
      jtf_codigo.setText("");
     
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,"alterar o registro"+ ex);
       }
      
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
      jtf_nome.setEnabled(false);
      btn_salvar.setEnabled(false);
      btn_alterar.setEnabled(false);
      btn_cancelar.setEnabled(false);
      btn_deletar.setEnabled(false);
      btn_adicionar.setEnabled(true);
     
      jtf_nome.setText("");
      jtf_codigo.setText("");
      
      
    }//GEN-LAST:event_btn_cancelarActionPerformed

    
    public void Preenchertabela(String SQL){
    ArrayList dados = new ArrayList();
    String[] Colunas = new String[]{"ID","Cidade","Estado"};
    connCidade.executaSQL(SQL);
    
        try {
            connCidade.rs.first();
            do{
                dados.add(new Object[]{connCidade.rs.getInt("id_cidade"),connCidade.rs.getString("nome_cidade"), connCidade.rs.getString("sigla_estado")});
            
            }while(connCidade.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro");
        }
        ModeloTabela modelo = new ModeloTabela (dados , Colunas);
        tabelaCidade.setModel(modelo);
        tabelaCidade.getColumnModel().getColumn(0).setPreferredWidth(250);
        tabelaCidade.getColumnModel().getColumn(0).setResizable(false);
        tabelaCidade.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabelaCidade.getColumnModel().getColumn(1).setResizable(false);
        tabelaCidade.getColumnModel().getColumn(2).setPreferredWidth(120);
        tabelaCidade.getColumnModel().getColumn(2).setResizable(false);
        tabelaCidade.getTableHeader().setReorderingAllowed(false);
        tabelaCidade.setAutoResizeMode(tabelaCidade.AUTO_RESIZE_OFF);
        tabelaCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        
}      
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_cidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_deletar;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextField jtf_nome;
    private javax.swing.JTable tabelaCidade;
    private javax.swing.JTable tabela_cidade;
    // End of variables declaration//GEN-END:variables
}
