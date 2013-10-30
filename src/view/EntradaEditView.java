/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EntradaController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empenho;
import model.Entrada;
import model.ItensEntrada;
import model.Produto;
import util.DateTimeUtil;

/**
 *
 * @author secinfor-04
 */
public class EntradaEditView extends javax.swing.JFrame {

    private List <ItensEntrada>  itensEntradaLista = new ArrayList();
    private Entrada entrada = Entrada.getInstacia();
    private Produto produtoAdd;
    private Empenho empenhoAdd;
    private Float VTotal = new Float(0) ;
    private int index = 0;
    
    
    
    static EntradaEditView instancia = null;  
      
     public static EntradaEditView getInstacia(){
       if(  instancia == null){
         return instancia = new EntradaEditView();
         } else{ 
         return instancia;
       }
     }
     
     
     
     public static EntradaEditView getInstacia(Entrada entrada){
       if(  instancia == null){
         return instancia = new EntradaEditView(entrada);
         } else{ 
         return instancia;
       }
     }
    /**
     * Creates new form EntradaEditView
     */
     
     
    public EntradaEditView(Entrada entrada) {
        
        initComponents();
   
    jtCNPJ.setEditable(false);
     jtEmpenho.setEditable(false);
    jtFornecedor.setEditable(false);
    
    jtfData.setEditable(false);
     jtfSaldo.setEditable(false);
    jtfValorTotal.setEditable(false);
    jtNumero.setEditable(false);
    
    } 
    
    
    
    public EntradaEditView() {
        initComponents();
        jtCNPJ.setEditable(false);
     jtEmpenho.setEditable(false);
    jtFornecedor.setEditable(false);
    
    jtfData.setEditable(false);
     jtfSaldo.setEditable(false);
    jtfValorTotal.setEditable(false);
    jtNumero.setEditable(false);
    DateTimeUtil dataUtil = DateTimeUtil.getInstancia();    
    jtfData.setText(dataUtil.parse("dd/MM/YYYY", dataUtil.getCurrentDateTime()));
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jtEmpenho = new javax.swing.JTextField();
        jtFornecedor = new javax.swing.JTextField();
        jtCNPJ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfSaldo = new javax.swing.JFormattedTextField();
        jbIncluirItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItensEntrada = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jtfValorTotal = new javax.swing.JFormattedTextField();
        jbGravar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jbIncluirEmpenho = new javax.swing.JButton();
        jtfData = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtNumeroNota = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de entrada");
        setResizable(false);

        jLabel2.setText("Número:");

        jLabel3.setText("Empenho:");

        jLabel4.setText("Fornecedor:");

        jLabel5.setText("CNPJ:");

        jLabel6.setText("Data:");

        jLabel7.setText("Saldo:");

        jbIncluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add (2).png"))); // NOI18N
        jbIncluirItem.setText("Incluir Item");
        jbIncluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirItemActionPerformed(evt);
            }
        });

        jtItensEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Peça", "Descrição", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtItensEntrada.setColumnSelectionAllowed(true);
        jtItensEntrada.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtItensEntrada);
        jtItensEntrada.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtItensEntrada.getColumnModel().getColumn(0).setResizable(false);
        jtItensEntrada.getColumnModel().getColumn(0).setPreferredWidth(10);
        jtItensEntrada.getColumnModel().getColumn(1).setResizable(false);
        jtItensEntrada.getColumnModel().getColumn(1).setPreferredWidth(50);
        jtItensEntrada.getColumnModel().getColumn(2).setResizable(false);
        jtItensEntrada.getColumnModel().getColumn(2).setPreferredWidth(5);
        jtItensEntrada.getColumnModel().getColumn(3).setResizable(false);
        jtItensEntrada.getColumnModel().getColumn(3).setPreferredWidth(10);

        jLabel9.setText("ValorTotal:");

        jbGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Success.png"))); // NOI18N
        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logout.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cadastro de Entrada");

        jbIncluirEmpenho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add (2).png"))); // NOI18N
        jbIncluirEmpenho.setText("Incluir Empenho");
        jbIncluirEmpenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirEmpenhoActionPerformed(evt);
            }
        });

        jLabel8.setText("Nota Fiscal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                            .addComponent(jtEmpenho))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbIncluirEmpenho))
                                            .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jbIncluirItem)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtNumeroNota))
                                        .addComponent(jtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtEmpenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbIncluirEmpenho)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtNumeroNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbIncluirItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGravar)
                    .addComponent(Sair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(561, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void jbIncluirEmpenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirEmpenhoActionPerformed
        // TODO add your handling code here:
        EmpenhoSearchView janelaEmpenho = new EmpenhoSearchView("");
        janelaEmpenho.setVisible(true);
        
        
        
        
        
    }//GEN-LAST:event_jbIncluirEmpenhoActionPerformed

    private void jbIncluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirItemActionPerformed
        // TODO add your handling code here:
    
    
     ProdutoSearchView janelaProduto = new ProdutoSearchView("");   
     janelaProduto.setVisible(true);   
        
        
        
        
        
    }//GEN-LAST:event_jbIncluirItemActionPerformed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        // TODO add your handling code here:
        EntradaController entradaController = EntradaController.getInstacia();
        DateTimeUtil dataUtil = DateTimeUtil.getInstancia();
        
        entrada.setIdEmpenho(empenhoAdd);
        entrada.setData(dataUtil.parseDate(jtfData.getText()));
        entrada.setValorTotal(Float.parseFloat(jtfValorTotal.getText()));
        entrada.setNumeroNota(jtNumeroNota.getText());
        
       List gravar = entradaController.persistir(entrada);
      if(gravar.get(0)== true){
         if(jtNumero.getText().equals("")){
          entrada = (Entrada) gravar.get(1);
          jtNumero.setText(Long.toString(entrada.getId()));
         }
      
       for(int i = 0 ; i <= itensEntradaLista.size()-1; i++)  {
         ItensEntrada itensEntrada = itensEntradaLista.get(i);
           itensEntrada.setIdEntrada(entrada);
         itensEntradaLista.set(i, itensEntrada);
         
      
         
       } 
          
          
          
          
       JOptionPane.showMessageDialog(null, "Entrada Gravado Com sucesso!", null, 1);
          
          this.dispose();
      }else{
          
          JOptionPane.showMessageDialog(null, "Falha ao Salvar Entrada!!", null, 2);
      }
        
        
        
        
        
        
        
    }//GEN-LAST:event_jbGravarActionPerformed

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
            java.util.logging.Logger.getLogger(EntradaEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaEditView().setVisible(true);
            }
        });
    }
    //adiciona empenho a entrada
    public void adicionarEmpenho(Empenho empenho){
        
       empenhoAdd = empenho; 
        jtFornecedor.setText(empenhoAdd.getIdFornecedor().getNome());
        jtCNPJ.setText(empenhoAdd.getIdFornecedor().getCnpj());
        jtEmpenho.setText(empenhoAdd.getNumero());
        jtfSaldo.setText(Float.toString(empenhoAdd.getSaldo()));
    
          }
    
    public void adicionarProduto(Produto produto){
     
   
        
      ItensEntrada itensEntrada = ItensEntrada.getInstacia();
      
      produtoAdd = produto; 
      String dado = JOptionPane.showInputDialog(rootPane, "informe a Quantidade", null);
      itensEntrada.setQuantidade(Integer.parseInt(dado));
      dado = JOptionPane.showInputDialog(rootPane, "informe o Valor", null);
      itensEntrada.setValor(Float.parseFloat(dado));
      VTotal = VTotal + (itensEntrada.getValor() * itensEntrada.getQuantidade());
      itensEntrada.setIdProduto(produto);
      DefaultTableModel modelo = (DefaultTableModel) jtItensEntrada.getModel();
      jtfValorTotal.setText(Float.toString(VTotal));   
     modelo.addRow(new String[]{produto.getNumeroPeca(), produto.getDescricao(), Integer.toString(itensEntrada.getQuantidade()), Float.toString(itensEntrada.getValor())});
     
     itensEntradaLista.add(modelo.getRowCount()-1, itensEntrada);
     
     
    
    }
   
      /*  
    private void carregaTabela(){
     
                       
       DefaultTableModel modelo = (DefaultTableModel) jtItensEntrada.getModel();
       modelo.setNumRows(0);
       
       for(int i = 0; i<empenhos.size();i++){
         
         empenho = empenhos.get(i);
        
        modelo.addRow(new String[]{empenho.getId().toString(), empenho.getNumero(), Float.toString(empenho.getValor()),
         Float.toString(empenho.getSaldo()), dataUtil.parse("dd/MM/YYYY", empenho.getData()), empenho.getIdFornecedor().getNome(), empenho.getIdFornecedor().getCnpj()});
    
    
       }
      
    }
    
    */
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbIncluirEmpenho;
    private javax.swing.JButton jbIncluirItem;
    private javax.swing.JTextField jtCNPJ;
    private javax.swing.JTextField jtEmpenho;
    private javax.swing.JTextField jtFornecedor;
    private javax.swing.JTable jtItensEntrada;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtNumeroNota;
    private javax.swing.JTextField jtfData;
    private javax.swing.JFormattedTextField jtfSaldo;
    private javax.swing.JFormattedTextField jtfValorTotal;
    // End of variables declaration//GEN-END:variables
}
