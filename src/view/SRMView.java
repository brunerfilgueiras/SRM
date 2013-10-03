/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Usuario;

/**
 *
 * @author secinfor-04
 */
public class SRMView extends javax.swing.JFrame {

    Usuario usuario;

   public SRMView(Usuario usuario){
       initComponents();
       this.usuario = usuario;
    
    
    permissao(usuario);
   
   
   }

    /**
     * Creates new form SRMVeiw
     */
    public SRMView() {
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

        menuBar = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        miLogout = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        miEntrada = new javax.swing.JMenuItem();
        miSaida = new javax.swing.JMenuItem();
        miOrdemDeServico = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        miEmpenho = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        miMecanico = new javax.swing.JMenuItem();
        miMontadora = new javax.swing.JMenuItem();
        miProduto = new javax.swing.JMenuItem();
        miUsuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miRelatorioEmpenhoDetalhado = new javax.swing.JMenuItem();
        miRelatorioProdutoB = new javax.swing.JMenuItem();
        miRelatorioEntrada = new javax.swing.JMenuItem();
        miRelatorioEstoque = new javax.swing.JMenuItem();
        miRelatorioEmpenho = new javax.swing.JMenuItem();
        miRelatorioFornecedor = new javax.swing.JMenuItem();
        miRelatorioMontadora = new javax.swing.JMenuItem();
        miRelatorioMecanico = new javax.swing.JMenuItem();
        miRelatorioOrdemDeServico = new javax.swing.JMenuItem();
        miRelatorioProdutoPeriodo = new javax.swing.JMenuItem();
        miRelatorioProdutoSaida = new javax.swing.JMenuItem();
        miRelatorioProdutoMontadora = new javax.swing.JMenuItem();
        miRelatorioSaida = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SRM Sistema de Reserva de Material");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setText("Arquivo");

        miLogout.setText("Logout");
        jMenu2.add(miLogout);

        miSair.setText("Sair");
        jMenu2.add(miSair);

        menuBar.add(jMenu2);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Movimentação");

        miEntrada.setMnemonic('e');
        miEntrada.setText("Entrada");
        miEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEntradaActionPerformed(evt);
            }
        });
        fileMenu.add(miEntrada);

        miSaida.setMnemonic('s');
        miSaida.setText("Saída");
        miSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaidaActionPerformed(evt);
            }
        });
        fileMenu.add(miSaida);

        miOrdemDeServico.setMnemonic('o');
        miOrdemDeServico.setText("Ordem de Serviço");
        miOrdemDeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOrdemDeServicoActionPerformed(evt);
            }
        });
        fileMenu.add(miOrdemDeServico);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Cadastro");

        miEmpenho.setMnemonic('p');
        miEmpenho.setText("Empenho");
        miEmpenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmpenhoActionPerformed(evt);
            }
        });
        editMenu.add(miEmpenho);

        miFornecedor.setMnemonic('d');
        miFornecedor.setText("Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        editMenu.add(miFornecedor);

        miMecanico.setText("Mecânico");
        miMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMecanicoActionPerformed(evt);
            }
        });
        editMenu.add(miMecanico);

        miMontadora.setText("Montadora");
        miMontadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMontadoraActionPerformed(evt);
            }
        });
        editMenu.add(miMontadora);

        miProduto.setMnemonic('y');
        miProduto.setText("Produto");
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        editMenu.add(miProduto);

        miUsuario.setMnemonic('t');
        miUsuario.setText("Usuário");
        editMenu.add(miUsuario);

        menuBar.add(editMenu);

        jMenu1.setText("Relatório");

        miRelatorioEmpenhoDetalhado.setText("Crédito Detalhado Empenho");
        jMenu1.add(miRelatorioEmpenhoDetalhado);

        miRelatorioProdutoB.setText("Entrada Produto 'B'");
        jMenu1.add(miRelatorioProdutoB);

        miRelatorioEntrada.setText("Entrada Por Período");
        jMenu1.add(miRelatorioEntrada);

        miRelatorioEstoque.setText("Estoque Geral");
        miRelatorioEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioEstoqueActionPerformed(evt);
            }
        });
        jMenu1.add(miRelatorioEstoque);

        miRelatorioEmpenho.setText("Empenho");
        jMenu1.add(miRelatorioEmpenho);

        miRelatorioFornecedor.setText("Fornecedores");
        jMenu1.add(miRelatorioFornecedor);

        miRelatorioMontadora.setText("Montadora");
        jMenu1.add(miRelatorioMontadora);

        miRelatorioMecanico.setText("Mecânico");
        jMenu1.add(miRelatorioMecanico);

        miRelatorioOrdemDeServico.setText("Ordem de Serviço");
        jMenu1.add(miRelatorioOrdemDeServico);

        miRelatorioProdutoPeriodo.setText("Produto Por Período");
        jMenu1.add(miRelatorioProdutoPeriodo);

        miRelatorioProdutoSaida.setText("Produtos Por Saída");
        jMenu1.add(miRelatorioProdutoSaida);

        miRelatorioProdutoMontadora.setText("Produtos Por Montadora");
        jMenu1.add(miRelatorioProdutoMontadora);

        miRelatorioSaida.setText("Saída Por Período");
        jMenu1.add(miRelatorioSaida);

        menuBar.add(jMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEntradaActionPerformed
EntradaSearchView janelaEntrada = new EntradaSearchView(usuario);
janelaEntrada.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_miEntradaActionPerformed

    private void miSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaidaActionPerformed
SaidaSearchView janelaSaida = new SaidaSearchView();
janelaSaida.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_miSaidaActionPerformed

    private void miOrdemDeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOrdemDeServicoActionPerformed
OrdemDeServicoSearchView janelaOrdemDeServico = new OrdemDeServicoSearchView();
janelaOrdemDeServico.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_miOrdemDeServicoActionPerformed

    private void miEmpenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpenhoActionPerformed
EmpenhoSearchView janelaEmpenho = new EmpenhoSearchView();
janelaEmpenho.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_miEmpenhoActionPerformed

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
      ProdutoSearchView janelaProduto = new ProdutoSearchView();
      janelaProduto.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
FornecedorSearchView janelaFornecedor = new FornecedorSearchView();
janelaFornecedor.setVisible(true);
    }//GEN-LAST:event_miFornecedorActionPerformed

    private void miMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMecanicoActionPerformed
MecanicoSearchView janelaMecanico = new MecanicoSearchView();
janelaMecanico.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_miMecanicoActionPerformed

    private void miMontadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMontadoraActionPerformed
  MontadoraSearchView janelaMontadora = new MontadoraSearchView();
  janelaMontadora.setVisible(true);// TODO addm your handling code here:
    }//GEN-LAST:event_miMontadoraActionPerformed

    private void miRelatorioEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miRelatorioEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(SRMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SRMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SRMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SRMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
  
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SRMView().setVisible(true);
            }
        });
    }
    private void permissao(Usuario usuario){      
        switch (usuario.getPerfil()){
       case "Garagem"   :{
       
       miEntrada.setVisible(false);
       miSaida.setVisible(false);    
       miEmpenho.setVisible(false);
       miMontadora.setVisible(false);
       miProduto.setVisible(false);
       miFornecedor.setVisible(false);
       miRelatorioEmpenho.setVisible(false);
       miRelatorioEmpenhoDetalhado.setVisible(false);
       miRelatorioEntrada.setVisible(false);
       miRelatorioEstoque.setVisible(false);    
       miRelatorioFornecedor.setVisible(false);       
       miRelatorioMontadora.setVisible(false);       
       miRelatorioProdutoB.setVisible(false);       
       miRelatorioProdutoMontadora .setVisible(false);       
       miRelatorioProdutoPeriodo.setVisible(false);        
       miRelatorioProdutoSaida.setVisible(false);
       miRelatorioSaida.setVisible(false); 
               
       break;} 
       case "Estoquista" : {
       
           
       
       miOrdemDeServico.setVisible(false);
       miMecanico.setVisible(false);
       miRelatorioEmpenho.setVisible(false);
       miRelatorioEmpenhoDetalhado.setVisible(false);
       miRelatorioFornecedor.setVisible(false);       
       miRelatorioProdutoB.setVisible(false);       
       miRelatorioOrdemDeServico.setVisible(false);
       miRelatorioMecanico.setVisible(false);
       miFornecedor.setVisible(false);
       miEmpenho.setVisible(false);       
      
           
           
       
       break;}
       default :{
       
       
       }    
   }
  } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem miEmpenho;
    private javax.swing.JMenuItem miEntrada;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JMenuItem miMecanico;
    private javax.swing.JMenuItem miMontadora;
    private javax.swing.JMenuItem miOrdemDeServico;
    private javax.swing.JMenuItem miProduto;
    private javax.swing.JMenuItem miRelatorioEmpenho;
    private javax.swing.JMenuItem miRelatorioEmpenhoDetalhado;
    private javax.swing.JMenuItem miRelatorioEntrada;
    private javax.swing.JMenuItem miRelatorioEstoque;
    private javax.swing.JMenuItem miRelatorioFornecedor;
    private javax.swing.JMenuItem miRelatorioMecanico;
    private javax.swing.JMenuItem miRelatorioMontadora;
    private javax.swing.JMenuItem miRelatorioOrdemDeServico;
    private javax.swing.JMenuItem miRelatorioProdutoB;
    private javax.swing.JMenuItem miRelatorioProdutoMontadora;
    private javax.swing.JMenuItem miRelatorioProdutoPeriodo;
    private javax.swing.JMenuItem miRelatorioProdutoSaida;
    private javax.swing.JMenuItem miRelatorioSaida;
    private javax.swing.JMenuItem miSaida;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miUsuario;
    // End of variables declaration//GEN-END:variables
}
