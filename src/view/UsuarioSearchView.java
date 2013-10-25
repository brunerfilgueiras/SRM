/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import dao.UsuarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

/**
 *
 * @author secinfor-04
 */
public class UsuarioSearchView extends javax.swing.JFrame {

     private List<Usuario> usuarios;
     private Usuario usuario;
    /**
     * Creates new form UsuarioSearchView
     */
    public UsuarioSearchView(Usuario logado){
        initComponents();
        permissao(logado);
        carregaTabela();
        
    }
    
    public UsuarioSearchView() {
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

        jcbParametro = new javax.swing.JComboBox();
        jtParametro = new javax.swing.JTextField();
        jbConsultar = new javax.swing.JButton();
        jbIncluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jcbParametro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Login", "Nome de Guerra", "Nome Completo", "" }));

        jtParametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtParametroActionPerformed(evt);
            }
        });

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.setMaximumSize(new java.awt.Dimension(85, 25));
        jbConsultar.setMinimumSize(new java.awt.Dimension(85, 25));
        jbConsultar.setPreferredSize(new java.awt.Dimension(85, 25));
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jbIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add (2).png"))); // NOI18N
        jbIncluir.setText("Incluir");
        jbIncluir.setMaximumSize(new java.awt.Dimension(85, 25));
        jbIncluir.setMinimumSize(new java.awt.Dimension(85, 25));
        jbIncluir.setPreferredSize(new java.awt.Dimension(85, 25));
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
        jbExcluir.setMaximumSize(new java.awt.Dimension(85, 25));
        jbExcluir.setMinimumSize(new java.awt.Dimension(85, 25));
        jbExcluir.setPreferredSize(new java.awt.Dimension(85, 25));
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome Completo", "Nome Guerra", "Posto / Graduação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtUsuarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Pesquisa de Usuários");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logout.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbParametro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbParametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-548)/2, (screenSize.height-394)/2, 548, 394);
    }// </editor-fold>//GEN-END:initComponents

    private void jtParametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtParametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtParametroActionPerformed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed

        UsuarioEditView janelaUsuario = new UsuarioEditView();
        janelaUsuario.setVisible(true);// TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
      
 
        UsuarioEditView janelaUsuario = new UsuarioEditView(seleciona());
        janelaUsuario.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed

        
       UsuarioController usuarioController =  UsuarioController.getInstacia();
       
       if(seleciona() != null){
        
        if(usuarioController.deletar(seleciona())){
            JOptionPane.showMessageDialog(rootPane, "Usuario Excluido com sucesso!");
                        
            carregaTabela();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falha ao Excluir  Usuario!", null, 2);
        }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Usuario Não selecionado!",null , 2);
        }
       
       
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed

        
             if(jcbParametro.getSelectedItem().equals("Login")) {  
                usuario = Usuario.getInstacia();
                usuario.setNomeCompleto(null);
                usuario.setNomeGuerra(null);
                usuario.setLogin(jtParametro.getText());
                carregaConsulta(usuario);       
            }else{
                 if(jcbParametro.getSelectedItem().equals("Nome Completo")){
                   usuario = Usuario.getInstacia();
                   usuario.setLogin(null);
                   usuario.setNomeGuerra(null);
                    usuario.setNomeCompleto(jtParametro.getText());
                    carregaConsulta(usuario);  
                   
                }else{
                     usuario = Usuario.getInstacia();
                     usuario.setLogin(null);
                     usuario.setNomeCompleto(null);
                    usuario.setNomeGuerra(jtParametro.getText());
                    carregaConsulta(usuario);  
                     
                 }
             } 
                
        
      
   
       
        
        
        
          
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioSearchView().setVisible(true);
            }
        });
    }
    
    private void permissao(Usuario logado){
      if (!logado.getPerfil().equals("Administrador")){
        jbExcluir.setVisible(false);
    }
    }
    
    //metodos 
    
    
    private void carregaConsulta(Usuario usuario){
        UsuarioDAO usuarioDAO = UsuarioDAO.getInstacia();
        usuarios = usuarioDAO.consulta(usuario);
    
        
       DefaultTableModel modelo = (DefaultTableModel) jtUsuarios.getModel();
       modelo.setNumRows(0);
       
       for(int i = 0; i<usuarios.size();i++){
                        
         modelo.addRow(new String[]{usuarios.get(i).getId().toString(), usuarios.get(i).getNomeCompleto(),
             usuarios.get(i).getNomeGuerra(),usuarios.get(i).getPosto()});
    
       }
      
    }
    
    
    
    //caregadados na tabela
    private void carregaTabela(){
        UsuarioDAO usuarioDAO = UsuarioDAO.getInstacia();
        usuarios = usuarioDAO.listaTodos();
    
       DefaultTableModel modelo = (DefaultTableModel) jtUsuarios.getModel();
       modelo.setNumRows(0);
       
      
       for(int i = 0; i<usuarios.size();i++){
         
         usuario = usuarios.get(i);
        
         modelo.addRow(new String[]{usuario.getId().toString(), usuario.getNomeCompleto(), usuario.getNomeGuerra(),usuario.getPosto()});
    
       }
       
       
       
       
    }
    
    //seleciona linha e retorna um usuario
    private Usuario seleciona(){
    
       int linha = jtUsuarios.getSelectedRow();
       if(linha != -1){
       usuario = usuarios.get(linha);
       return usuario;
       }else{
        return usuario = null;
       }
    }     
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JComboBox jcbParametro;
    private javax.swing.JTextField jtParametro;
    private javax.swing.JTable jtUsuarios;
    // End of variables declaration//GEN-END:variables
}
