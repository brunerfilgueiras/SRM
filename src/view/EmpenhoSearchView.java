/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EmpenhoController;
import dao.EmpenhoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empenho;
import model.Usuario;
import util.DateTimeUtil;

/**
 *
 * @author secinfor-04
 */
public class EmpenhoSearchView extends javax.swing.JFrame {

    private List<Empenho> empenhos;
    private Empenho empenho = Empenho.getInstacia();
    
    
    /**
     * Creates new form EmpenhoSearchView
     */
    public EmpenhoSearchView(Usuario usuario) {
       initComponents();
    permissao(usuario);
    carregaTabela();
    jbAdicionar.setVisible(false);
   
    }
     public EmpenhoSearchView(String arg) {
       initComponents();
    jbIncluir.setVisible(false);
       jbAlterar.setVisible(false);
       jbExcluir.setVisible(false);
       carregaTabela();
    
    
    
    
   
    }
    
    
    public EmpenhoSearchView() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNum = new javax.swing.JLabel();
        jtParametro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbConsultar = new javax.swing.JButton();
        jbIncluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEmpenhos = new javax.swing.JTable();
        jbSair = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jlTitulo = new javax.swing.JLabel();
        jbAdicionar = new javax.swing.JButton();
        jPBbarra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de empenho");
        setResizable(false);

        jlNum.setText("Número do empenho:");

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.setMaximumSize(new java.awt.Dimension(105, 25));
        jbConsultar.setMinimumSize(new java.awt.Dimension(105, 25));
        jbConsultar.setPreferredSize(new java.awt.Dimension(105, 25));
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jbIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add (2).png"))); // NOI18N
        jbIncluir.setText("Incluir");
        jbIncluir.setMaximumSize(new java.awt.Dimension(95, 25));
        jbIncluir.setMinimumSize(new java.awt.Dimension(95, 25));
        jbIncluir.setPreferredSize(new java.awt.Dimension(95, 25));
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Admin.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.setMaximumSize(new java.awt.Dimension(95, 25));
        jbAlterar.setMinimumSize(new java.awt.Dimension(95, 25));
        jbAlterar.setPreferredSize(new java.awt.Dimension(95, 25));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete (2).png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setMaximumSize(new java.awt.Dimension(95, 25));
        jbExcluir.setMinimumSize(new java.awt.Dimension(95, 25));
        jbExcluir.setPreferredSize(new java.awt.Dimension(95, 25));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jtbEmpenhos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Empenho", "Valor", "Saldo", "Data", "Fornecedor", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbEmpenhos);
        jtbEmpenhos.getColumnModel().getColumn(0).setResizable(false);
        jtbEmpenhos.getColumnModel().getColumn(1).setResizable(false);
        jtbEmpenhos.getColumnModel().getColumn(2).setResizable(false);
        jtbEmpenhos.getColumnModel().getColumn(3).setResizable(false);
        jtbEmpenhos.getColumnModel().getColumn(4).setResizable(false);
        jtbEmpenhos.getColumnModel().getColumn(5).setResizable(false);

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logout.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlTitulo.setText("Pesquisa de Empenho");

        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add (2).png"))); // NOI18N
        jbAdicionar.setText("OK");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlNum)
                                .addGap(4, 4, 4)
                                .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSair)))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPBbarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlNum))
                    .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdicionar)
                    .addComponent(jbSair))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPBbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(766, 406));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed
       
        EmpenhoEditView janelaEmpenho = EmpenhoEditView.Instacia();
        janelaEmpenho.setVisible(true);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
    if(seleciona() != null){
         EmpenhoEditView janelaEmpenho = new EmpenhoEditView(seleciona());
        janelaEmpenho.setVisible(true);
        
     }else{
            JOptionPane.showMessageDialog(rootPane, "Empenho Não selecionada!");
        }    
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
       EmpenhoController empenhoController = EmpenhoController.getInstacia();
        
        if(seleciona() != null){
        if(JOptionPane.showConfirmDialog(null, "Deseja excluir este registro?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0){
        if(empenhoController.deletar(seleciona())){
            JOptionPane.showMessageDialog(rootPane, "Empenho Excluido com sucesso!");
                        
            carregaTabela();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha ao Excluir o Empenho!");
        }
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Empenho Não selecionada!");
        }  
        
        
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
        
        
        
      if(!jtParametro.getText().equals("")){
     
                     empenho = Empenho.getInstacia();
                     
                    empenho.setNumero(jtParametro.getText());
                    carregaConsulta(empenho);  
                     
                  
  }else{carregaTabela();} 
        
        
 
        
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        // TODO add your handling code here:
    EntradaEditView janelaEntrada = EntradaEditView.getInstacia();
    janelaEntrada.adicionarEmpenho(seleciona());
    janelaEntrada.setVisible(true);
     this.dispose();
        
        
        
        
    }//GEN-LAST:event_jbAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(EmpenhoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpenhoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpenhoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpenhoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpenhoSearchView().setVisible(true);
            }
        });
    }
    
     //carrega dados na tabela
    private void carregaTabela(){
      
        EmpenhoDAO empenhoDAO = EmpenhoDAO.getInstacia();
        empenhos = empenhoDAO.listaTodos();
        DateTimeUtil dataUtil = DateTimeUtil.getInstancia();
                
       DefaultTableModel modelo = (DefaultTableModel) jtbEmpenhos.getModel();
       modelo.setNumRows(0);
       jPBbarra.setMinimum(0);
       jPBbarra.setMaximum(empenhos.size());
       jPBbarra.setValue(0);
       if(empenhos.isEmpty())
           JOptionPane.showMessageDialog(rootPane, "Nenhum empenho encontrado!!", null, 2);
       for(int i = 0; i<empenhos.size();i++){
         
         empenho = empenhos.get(i);
        
        modelo.addRow(new String[]{empenho.getNumero(), Float.toString(empenho.getValor()),
         Float.toString(empenho.getSaldo()), dataUtil.parse("dd/MM/YYYY", empenho.getData()), empenho.getIdFornecedor().getNome(), empenho.getIdFornecedor().getCnpj()});
    
    jPBbarra.setValue(i+1);
       }
      
    }
    
    
     // seleciona linha da tabela
     private Empenho seleciona(){
         empenho = null;
       int linha = jtbEmpenhos.getSelectedRow();
       if(linha != -1){
       empenho = empenhos.get(linha);
       return empenho;
       }else{
        return empenho = null;
       }
    }     
    
    
     //carraga consulta
     private void carregaConsulta(Empenho empenho){
        EmpenhoDAO empenhoDAO = EmpenhoDAO.getInstacia();
       empenhos = empenhoDAO.consulta(empenho);
    DateTimeUtil dataUtil = DateTimeUtil.getInstancia();
        
       DefaultTableModel modelo = (DefaultTableModel) jtbEmpenhos.getModel();
       modelo.setNumRows(0);
       jPBbarra.setMinimum(0);
       jPBbarra.setMaximum(empenhos.size());
       jPBbarra.setValue(0);
       if(empenhos.isEmpty())
           JOptionPane.showMessageDialog(rootPane, "Nenhum empenho encontrado!!", null, 2);
       for(int i = 0; i<empenhos.size();i++){
         
           empenho = empenhos.get(i);
         modelo.addRow(new String[]{empenho.getNumero(), Float.toString(empenho.getValor()),
         Float.toString(empenho.getSaldo()), dataUtil.parse("dd/MM/YYYY", empenho.getData()), empenho.getIdFornecedor().getNome(), empenho.getIdFornecedor().getCnpj()});
    jPBbarra.setValue(i+1);
    
       }
      
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jPBbarra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlNum;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtParametro;
    private javax.swing.JTable jtbEmpenhos;
    // End of variables declaration//GEN-END:variables

    private void permissao(Usuario usuario){
      if (!usuario.getPerfil().equals("Administrador")){
        jbExcluir.setVisible(false);
    }
    }
}
