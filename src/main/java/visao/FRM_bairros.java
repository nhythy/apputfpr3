/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import controle.Controle_bairro;
import controle.ModeloTabela;
import controle.conectaBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import modelo.Modelo_bairro;

/**
 *
 * @author nhyth
 */
public final class FRM_bairros extends javax.swing.JFrame {

   Modelo_bairro mod = new Modelo_bairro();
   Controle_bairro control = new Controle_bairro();
   conectaBanco connBairro = new conectaBanco();
   conectaBanco connEstado = new conectaBanco();
   conectaBanco connCidade = new conectaBanco();
   int flag = 1;
   
   
   
   
   
    public FRM_bairros() {
        
        
        initComponents();
       
        connBairro.conexao();
        Preenchertabela("select * from bairro inner join cidades on bairro.id_cidade = cidades.id_cidade");
        
        AtualizaCombo();
        connEstado.conexao();
        connCidade.conexao();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        btn_proximo = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_primeiro = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBairro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboCidade = new javax.swing.JComboBox<>();
        jtf_nomeBairro = new javax.swing.JTextField();
        jtf_codigoBairro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_proximo.setText("Proximo");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_novo.setText("Novo");
        btn_novo.setToolTipText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.setToolTipText("salva");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.setToolTipText("edita");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.setToolTipText("excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText("cancela");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_primeiro.setText("Primeiro");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_ultimo.setText("Ultimo");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_add.setText("Add");
        btn_add.setToolTipText("adiciona item");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.setToolTipText("sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        tabelaBairro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaBairro);

        jLabel1.setText("Cidade");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nome Bairro");

        jComboCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_nomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_add))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(btn_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_primeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ultimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_proximo))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jtf_codigoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_sair)
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_sair)
                .addGap(53, 53, 53)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_codigoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_nomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add))
                .addGap(37, 37, 37)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_anterior)
                    .addComponent(btn_ultimo)
                    .addComponent(btn_primeiro)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_excluir)
                    .addComponent(btn_editar)
                    .addComponent(btn_salvar)
                    .addComponent(btn_novo)
                    .addComponent(btn_proximo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
   btn_salvar.setEnabled(true);
   btn_novo.setEnabled(false);
   btn_cancelar.setEnabled(true);
   jtf_nomeBairro.setText("");
   jtf_codigoBairro.setText("");
   jtf_nomeBairro.setEnabled(true);
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
       mod.setCod(Integer.parseInt(jtf_codigoBairro.getText()));
       control.Excluir(mod);
       btn_salvar.setEnabled(true);
   btn_novo.setEnabled(false);
   btn_cancelar.setEnabled(true);
   jtf_nomeBairro.setText("");
   jtf_codigoBairro.setText("");
   jtf_nomeBairro.setEnabled(true);
   Preenchertabela("select * from bairro inner join cidades on bairro.id_cidade = cidades.id_cidade");
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
       if (flag == 1){
         mod.setNome(jtf_nomeBairro.getText());
         mod.setCidade("" + jComboCidade.getSelectedItem());
         control.Gravar(mod);
         Preenchertabela("select * from bairro inner join cidades on bairro.id_cidade = cidades.id_cidade");
       
       }else{
        mod.setNome(jtf_nomeBairro.getText());
         mod.setCidade("" + jComboCidade.getSelectedItem());
         control.Editar(mod);   
         Preenchertabela("select * from bairro inner join cidades on bairro.id_cidade = cidades.id_cidade");
       }
       
       btn_salvar.setEnabled(!true);
       btn_novo.setEnabled(!false);
       jtf_nomeBairro.setEnabled(!true);
       btn_cancelar.setEnabled(!true);
       btn_editar.setEnabled(false);
       jtf_nomeBairro.setText("");
       jtf_codigoBairro.setText("");
       btn_excluir.setEnabled(false);
       
       
       
       
       
       
       
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
      
       flag=2;
       jtf_nomeBairro.setEnabled(true);
       btn_salvar.setEnabled(true);
       btn_editar.setEnabled(false);
       btn_novo.setEnabled(false);
        
        
        
        
        
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
       dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
        
       mod = control.Prox();
       jtf_codigoBairro.setText(String.valueOf(mod.getCod()));
       jtf_nomeBairro.setText(mod.getNome());
       jComboCidade.setSelectedItem(mod.getCidade());
       btn_editar.setEnabled(true);
       btn_excluir.setEnabled(true);
       btn_cancelar.setEnabled(true);
        
        
        
        
        
    }//GEN-LAST:event_btn_proximoActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        
        mod = control.Ult();
        jtf_codigoBairro.setText(String.valueOf(mod.getCod()));
       jtf_nomeBairro.setText(mod.getNome());
       jComboCidade.setSelectedItem(mod.getCidade());
       btn_editar.setEnabled(true);
       btn_excluir.setEnabled(true);
       btn_cancelar.setEnabled(true);
        
  
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        
        mod = control.Ant();
        jtf_codigoBairro.setText(String.valueOf(mod.getCod()));
       jtf_nomeBairro.setText(mod.getNome());
       jComboCidade.setSelectedItem(mod.getCidade());
       btn_editar.setEnabled(true);
       btn_excluir.setEnabled(true);
       btn_cancelar.setEnabled(true);
        
        
        
        
        
        
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        
       btn_salvar.setEnabled(!true);
       btn_novo.setEnabled(!false);
       jtf_codigoBairro.setText("");
       jtf_nomeBairro.setText("");
       jtf_nomeBairro.setEnabled(!true);
       btn_editar.setEnabled(true);
       btn_excluir.setEnabled(true);
       btn_cancelar.setEnabled(true);
        
       
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       
     FRM_cidade frm = new FRM_cidade();
     frm.setVisible(true);
     AtualizaCombo();
        
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
       mod = control.Primeiro();
      jtf_codigoBairro.setText(String.valueOf(mod.getCod()));
       jtf_nomeBairro.setText(mod.getNome());
       jComboCidade.setSelectedItem(mod.getCidade());
       btn_editar.setEnabled(true);
       btn_excluir.setEnabled(true);
       btn_cancelar.setEnabled(true);
         
    
       
    }//GEN-LAST:event_btn_primeiroActionPerformed

    private void jComboCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCidadeActionPerformed

    
    
    
    
    
    public void Preenchertabela(String SQL){
    ArrayList dados = new ArrayList();
    String[] Colunas = new String[]{"ID","Bairro","Cidade"};
    connBairro.executaSQL(SQL);
    
        try {
            connBairro.rs.first();
            do{
                dados.add(new Object[]{connBairro.rs.getInt("id_cidade"),connBairro.rs.getString("nome_bairro"), connBairro.rs.getString("nome_cidade")});
                
            
            }while(connBairro.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher o Array talela");
        }
        ModeloTabela modelo = new ModeloTabela (dados , Colunas);
        tabelaBairro.setModel(modelo);
        tabelaBairro.getColumnModel().getColumn(0).setPreferredWidth(250);
        tabelaBairro.getColumnModel().getColumn(0).setResizable(false);
        tabelaBairro.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabelaBairro.getColumnModel().getColumn(1).setResizable(false);
        tabelaBairro.getColumnModel().getColumn(2).setPreferredWidth(120);
        tabelaBairro.getColumnModel().getColumn(2).setResizable(false);
        tabelaBairro.getTableHeader().setReorderingAllowed(false);
        tabelaBairro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelaBairro.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       
}
    public void AtualizaCombo(){
        
      jComboCidade.removeAllItems();
      try{
          connBairro.executaSQL("select * from cidades order by nome_cidade");
          connBairro.rs.first();
          do{
              jComboCidade.addItem(connBairro.rs.getString("nome_cidade"));
              
          }while(connBairro.rs.next());
        
      }catch (SQLException ex){
          JOptionPane.showMessageDialog(null, "erro atualizar combo"+ ex);
      }
        
        
        
    }
    
    
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
            java.util.logging.Logger.getLogger(FRM_bairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_bairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_bairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_bairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_bairros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JComboBox<String> jComboCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtf_codigoBairro;
    private javax.swing.JTextField jtf_nomeBairro;
    private javax.swing.JTable tabelaBairro;
    // End of variables declaration//GEN-END:variables
}
