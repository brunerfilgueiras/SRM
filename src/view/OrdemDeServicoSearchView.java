/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OrdemDeServicoController;
import dao.OrdemDeServicoDAO;
import java.math.BigInteger;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.OrdemDeServico;
import model.Usuario;
import util.DateTimeUtil;

/**
 *
 * @author secinfor-04
 */
public class OrdemDeServicoSearchView extends javax.swing.JFrame {

    private List<OrdemDeServico> ordensDeServico;
    private OrdemDeServico ordemDeServico;
    
    
    
    /**
     * Creates new form OrdemDeServicoSearchView
     */
    public OrdemDeServicoSearchView(String arg){
        initComponents();
       jbIncluir.setVisible(false);
       jbAlterar.setVisible(false);
       jbExcluir.setVisible(false);
       carregaTabela();
    } 
    
    
    public OrdemDeServicoSearchView(Usuario usuario){
      initComponents();
      permissao(usuario);
      carregaTabela();
      jbAdicionar.setVisible(false);
    }
    
    public OrdemDeServicoSearchView() {
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

        jtParametro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbConsultar = new javax.swing.JButton();
        jbIncluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrdensDeServico = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbSair = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jbAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de ordem de Serviço");
        setResizable(false);

        jtParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtParametroActionPerformed(evt);
            }
        });

        jLabel1.setText("Número:");

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

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

        jtOrdensDeServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OS", "OM", "Viatura", "Data Saida", "Data Entrada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtOrdensDeServico);
        jtOrdensDeServico.getColumnModel().getColumn(2).setResizable(false);
        jtOrdensDeServico.getColumnModel().getColumn(3).setResizable(false);

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logout.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pesquisa de ordem de Serviço");

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
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAdicionar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConsultar)
                    .addComponent(jbIncluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbAdicionar))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSair)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(548, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtParametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtParametroActionPerformed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed

        OrdemDeServicoEditView janelaOrdemDeServico = new OrdemDeServicoEditView();
        janelaOrdemDeServico.setVisible(true);// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
       OrdemDeServicoEditView janelaOrdemDeServico = new OrdemDeServicoEditView(seleciona());
        janelaOrdemDeServico.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        // TODO add your handling code here:
      if(jtParametro.getText().equals("")){
       
          
          
          
          
      }else{
                 
                    ordemDeServico.setId(Long.parseLong(jtParametro.getText()));
                    carregaConsulta(ordemDeServico);  
      }         
        
        
        
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        OrdemDeServicoController ordemDeServicoController =  OrdemDeServicoController.getInstacia();
       
       if(seleciona() != null){
        
        if(ordemDeServicoController.deletar(seleciona())){
            JOptionPane.showMessageDialog(rootPane, "Ordem De Servico Excluida com sucesso!");
                        
            carregaTabela();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha ao Excluir  Ordem De Servico!", null, 2);
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ordem De Servico Não selecionada!",null , 2);
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        // TODO add your handling code here:
        SaidaEditView janelaSaida = SaidaEditView.getInstacia();
        janelaSaida.adicionarOrdemDeServico(seleciona());
        janelaSaida.setVisible(true);
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
            java.util.logging.Logger.getLogger(OrdemDeServicoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdemDeServicoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdemDeServicoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdemDeServicoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdemDeServicoSearchView().setVisible(true);
            }
        });
    }
    
    private void permissao(Usuario usuario){
      if (!usuario.getPerfil().equals("Administrador")){
        jbExcluir.setVisible(false);
    }
    }
    //carraga consulta
     private void carregaConsulta(OrdemDeServico ordemDeServico){
        OrdemDeServicoDAO ordemDeServicoDAO = OrdemDeServicoDAO.getInstacia();
        ordensDeServico = ordemDeServicoDAO.consulta(ordemDeServico);
    DateTimeUtil dataUtil = DateTimeUtil.getInstancia();
        
       DefaultTableModel modelo = (DefaultTableModel) jtOrdensDeServico.getModel();
       modelo.setNumRows(0);
       
       for(int i = 0; i<ordensDeServico.size();i++){
       
           ordemDeServico = ordensDeServico.get(i);
           
           
        modelo.addRow(new String[]{ordemDeServico.getId().toString(), ordemDeServico.getOm(), ordemDeServico.getViatura(),dataUtil.parseDate(ordemDeServico.getDataSaida()), dataUtil.parseDate(ordemDeServico.getDataEntrada())});
     
    
       }
      
    }
    
    
    
     //caregadados na tabela
    private void carregaTabela(){
        OrdemDeServicoDAO ordemDeServicoDAO = OrdemDeServicoDAO.getInstacia();
        ordensDeServico = ordemDeServicoDAO.listaTodas();
    
        DateTimeUtil dataUtil = DateTimeUtil.getInstancia();
        
       DefaultTableModel modelo = (DefaultTableModel) jtOrdensDeServico.getModel();
       modelo.setNumRows(0);
       
       for(int i = 0; i<ordensDeServico.size();i++){
         
         ordemDeServico = ordensDeServico.get(i);
        
         
             modelo.addRow(new String[]{ordemDeServico.getId().toString(), ordemDeServico.getOm(), ordemDeServico.getViatura(),dataUtil.parseDate(ordemDeServico.getDataSaida()), dataUtil.parseDate(ordemDeServico.getDataEntrada())});
     
       }
             
    }
    
    private OrdemDeServico seleciona(){
    
       int linha = jtOrdensDeServico.getSelectedRow();
       if(linha != -1){
       ordemDeServico = ordensDeServico.get(linha);
       return ordemDeServico;
       }else{
        return ordemDeServico = null;
       }
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTable jtOrdensDeServico;
    private javax.swing.JTextField jtParametro;
    // End of variables declaration//GEN-END:variables
}
