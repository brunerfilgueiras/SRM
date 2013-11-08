/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Bruner
 */
public class Imprimir {
    
    public void imprimeRelatorioMontadoras() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/RelatorioMontadoras.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioEmpenhos() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/Empenhos.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
}
