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
            view.setTitle("Relatório de Empenhos");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    public void imprimeRelatorioProdutos() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/Produtos.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Estoque Geral De Produtos");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioFornecedores() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/Fornecedores.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Relatório de Fornecedores");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioMecanicos() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/RelatorioMecanicos.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Relatório de Mecanicos");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioOrdensDeServico() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/OrdemDeServico.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Relatório de Ordens de Serviço");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioEntradaProdutosB() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            Map Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/Entrada Produto 'B'.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Estoque Geral De Produtos");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioCreditoDetalhado(HashMap Map) throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/CreditoEmpenhoDetalhado.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Estoque Geral De Produtos");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioEntradaPorPeriodo(HashMap Map) throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/EntradaPorPeriodo.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Relatório Entrada Por Período");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
    
    public void imprimeRelatorioProdutoPorPeriodo(HashMap Map) throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/ProdutoPorPeriodo.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Produtos Por Período");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
     public void imprimeRelatorioProdutoPorSaida() throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            HashMap Map = new HashMap();
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/ProdutoPorPeriodo.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Produtos Por Saída");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
     
     public void imprimeRelatorioProdutoPorMontadora(HashMap Map) throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/ProdutoPorMontadora.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Produtos Por Montadora");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
     
    public void imprimeRelatorioSaidaPorPeriodo(HashMap Map) throws JRException, Exception {
        Connection conn =  ConnectionFactory.getSrmConnection(); //aqui no lugar do metodo conectaBanco() vc usa o seu tipo de conexão com o banco
        try {
            
            String arquivo = null;
            arquivo = System.getProperty("user.dir") + "/src/relatorios/SaidaPeriodo.jasper";
            JasperPrint jp = JasperFillManager.fillReport(arquivo, Map, conn);
             JasperViewer view = new JasperViewer(jp, false);
            view.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
           view.setTitle("Produtos Por Montadora");
            view.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }
     
     
}
