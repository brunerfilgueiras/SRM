/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FornecedorController;
import dao.FornecedorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;
import model.Usuario;

/**
 *
 * @author secinfor-04
 */
public class FornecedorSearchView extends javax.swing.JFrame {
private Fornecedor fornecedor;
private List<Fornecedor> fornecedores;

static FornecedorSearchView instancia = null;  
   
     public static FornecedorSearchView getInstacia(){
       if(  instancia == null){
         return instancia = new FornecedorSearchView();
         } else{ 
         return instancia;
       }
     }

/**
     * Creates new form FornecedorSearchView
     */
    public FornecedorSearchView(Usuario usuario){
        initComponents();
        permissao(usuario);
        jbAdicionar.setVisible(false);
        carregaTabela();
        
        
    }
    
    public FornecedorSearchView(String args){
        initComponents();
        jbExcluir.setVisible(false);
        jbIncluir.setVisible(false);
        jbAlterar.setVisible(false);
        carregaTabela();
        
        
    }
    
    
    public FornecedorSearchView() {
        initComponents();
        jbAdicionar.setVisible(false);

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbIncluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jtParametro = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFornecedores = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jcbParametro = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jbSair = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jbAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Fornecedor");
        setResizable(false);

        jbIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add (2).png"))); // NOI18N
        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Admin.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete (2).png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jtFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CNPJ", "Contato", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtFornecedores);

        jcbParametro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CNPJ", "Nome" }));

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logout.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Pesquisa de Fornecedor");

        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add (2).png"))); // NOI18N
        jbAdicionar.setText("Adicionar");
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbAdicionar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConsultar)
                    .addComponent(jbIncluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSair)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(764, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed

        FornecedorEditView janelaFornecedor = new FornecedorEditView();
        janelaFornecedor.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed

        FornecedorEditView janelaFornecedor = new FornecedorEditView(seleciona());
        janelaFornecedor.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
       FornecedorController fornecedorController = FornecedorController.getInstacia();
        
        if(seleciona() != null){
        
        if(fornecedorController.deletar(seleciona())){
            JOptionPane.showMessageDialog(rootPane, "Fornecedor Excluido com sucesso!");
                        
            carregaTabela();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha ao Excluir o Fornecedor!");
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Fornecedor Não selecionada!");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
        if(!jtParametro.getText().equals("")){
     if(jcbParametro.getSelectedItem().equals("Nome")){
                   fornecedor = Fornecedor.getInstacia();
                   fornecedor.setCnpj(null);
                    fornecedor.setNome(jtParametro.getText());
                    carregaConsulta(fornecedor);  
                   
                }else{
                     fornecedor = fornecedor.getInstacia();
                     fornecedor.setNome(null);
                    fornecedor.setCnpj(jtParametro.getText());
                    carregaConsulta(fornecedor);  
                     
                  }
  }else{carregaTabela();}
        
        
        
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        // TODO add your handling code here:
        
        EmpenhoEditView janela = EmpenhoEditView.getInstacia();
               
        janela.adicionarFornecedor(seleciona());
        janela.setVisible(true);
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
            java.util.logging.Logger.getLogger(FornecedorSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedorSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedorSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedorSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedorSearchView().setVisible(true);
            }
        });
    }
    private void permissao(Usuario usuario){
      if (!usuario.getPerfil().equals("Administrador")){
        jbExcluir.setVisible(false);
    }
    }
    
    
    //carrega dados na tabela
    private void carregaTabela(){
       FornecedorDAO fornecedorDAO = FornecedorDAO.getInstacia();
        fornecedores = fornecedorDAO.listaTodos();
    
       DefaultTableModel modelo = (DefaultTableModel) jtFornecedores.getModel();
       modelo.setNumRows(0);
       
       for(int i = 0; i<fornecedores.size();i++){
         
         fornecedor = fornecedores.get(i);
        
         modelo.addRow(new String[]{fornecedor.getId().toString(), fornecedor.getNome(), fornecedor.getCnpj(),
         fornecedor.getContato(), fornecedor.getTelefone()});
    
       }
      
    }
     // seleciona linha da tabela
     private Fornecedor seleciona(){
         fornecedor = null;
       int linha = jtFornecedores.getSelectedRow();
       if(linha != -1){
       fornecedor = fornecedores.get(linha);
       return fornecedor;
       }else{
        return fornecedor = null;
       }
    }     
    
    
     //carraga consulta
     private void carregaConsulta(Fornecedor fornecedor){
        FornecedorDAO fornecedorDAO = FornecedorDAO.getInstacia();
        fornecedores = fornecedorDAO.consulta(fornecedor);
    
        
       DefaultTableModel modelo = (DefaultTableModel) jtFornecedores.getModel();
       modelo.setNumRows(0);
       
       for(int i = 0; i<fornecedores.size();i++){
         
           fornecedor = fornecedores.get(i);
         modelo.addRow(new String[]{fornecedor.getId().toString(), fornecedor.getNome(), fornecedor.getCnpj(),
                                    fornecedor.getContato(), fornecedor.getTelefone()});
    
       }
      
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JComboBox jcbParametro;
    private javax.swing.JTable jtFornecedores;
    private javax.swing.JTextField jtParametro;
    // End of variables declaration//GEN-END:variables
}
