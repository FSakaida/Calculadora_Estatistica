/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadorav4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import org.jfree.chart.ChartPanel;
import org.knowm.xchart.SwingWrapper;

/**
 *
 * @author 202110131
 */
public class layoutEstatistica extends javax.swing.JFrame {

    /**
     * Creates new form layoutEstatistica
     */
    calculosEstatisticos operacoes = new calculosEstatisticos();
    List<String> paraGrafico = new ArrayList<>();
    File historico = new File("C:/Users/202210345/Documents/GitHub/Calculadora_Estatistica/CalculadoraV4/res/Historico/historico.txt");

    public layoutEstatistica() {
        initComponents();
        String operacao;
        carregarHistorico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcbasica = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        txtArquivo = new javax.swing.JTextField();
        bmedia = new javax.swing.JCheckBox();
        bmoda = new javax.swing.JCheckBox();
        bmediana = new javax.swing.JCheckBox();
        bdesviopadrao = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        bgrafico = new javax.swing.JCheckBox();
        txtDados = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();
        btnCarregar = new javax.swing.JButton();
        txtMedia = new javax.swing.JTextField();
        txtModa = new javax.swing.JTextField();
        txtMediana = new javax.swing.JTextField();
        txtDesvio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistorico = new javax.swing.JTable();
        btnLimparHistorico = new javax.swing.JButton();
        btnLimparGeral = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calcbasica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        calcbasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcbasicaActionPerformed(evt);
            }
        });

        btnCalcular.setForeground(new java.awt.Color(72, 51, 177));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtArquivo.setForeground(new java.awt.Color(72, 51, 177));
        txtArquivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        txtArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArquivoActionPerformed(evt);
            }
        });

        bmedia.setForeground(new java.awt.Color(72, 51, 177));
        bmedia.setText("Média");

        bmoda.setForeground(new java.awt.Color(72, 51, 177));
        bmoda.setText("Moda");

        bmediana.setForeground(new java.awt.Color(72, 51, 177));
        bmediana.setText("Mediana");

        bdesviopadrao.setForeground(new java.awt.Color(72, 51, 177));
        bdesviopadrao.setText("Desvio Padrão");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bgrafico.setForeground(new java.awt.Color(72, 51, 177));
        bgrafico.setText("Gráfico");
        bgrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgraficoActionPerformed(evt);
            }
        });

        txtDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        txtDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDadosActionPerformed(evt);
            }
        });

        btnSelecionar.setForeground(new java.awt.Color(72, 51, 177));
        btnSelecionar.setText("...");
        btnSelecionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnCarregar.setForeground(new java.awt.Color(72, 51, 177));
        btnCarregar.setText("Carregar");
        btnCarregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        tbHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Media", "Moda", "Mediana", "Desvio Padrão", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbHistorico);

        btnLimparHistorico.setForeground(new java.awt.Color(72, 51, 177));
        btnLimparHistorico.setText("Limpar Histórico");
        btnLimparHistorico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        btnLimparHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparHistoricoActionPerformed(evt);
            }
        });

        btnLimparGeral.setText("Limpar Geral");
        btnLimparGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparGeralActionPerformed(evt);
            }
        });

        btnFechar.setForeground(new java.awt.Color(72, 51, 177));
        btnFechar.setText("Fechar");
        btnFechar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDados, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bmedia)
                                    .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bmoda)
                                    .addComponent(txtModa, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bmediana)
                                    .addComponent(txtMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bdesviopadrao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bgrafico))
                                    .addComponent(txtDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(calcbasica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimparGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimparHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelecionar))
                            .addComponent(calcbasica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnFechar)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bmedia)
                            .addComponent(bmoda)
                            .addComponent(bmediana)
                            .addComponent(bdesviopadrao)
                            .addComponent(bgrafico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarregar)
                            .addComponent(txtDados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparGeral)
                    .addComponent(btnLimparHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    File arquivo;

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String dados = txtDados.getText();
        List<Double> novosDados = new ArrayList<>();
        try {
            
            if (novosDados == null) {
                throw new Exception("Dados Vazios!!!");
            }
            for (StringTokenizer stringTokenizer = new StringTokenizer(dados, ";"); stringTokenizer.hasMoreTokens();) {
                String token = stringTokenizer.nextToken();
                novosDados.add(Double.parseDouble(token));
            }
            operacoes.setDados(novosDados);
            if (bmedia.isSelected()) {
                txtMedia.setText(numeroCortado(operacoes.media()));
            }

            if (bmediana.isSelected()) {
                txtMediana.setText(operacoes.mediana() + "");
            }

            if (bmoda.isSelected()) {

                String modaS = "";

                if (operacoes.ehModal()) {
                    for (int i = 0; i < operacoes.moda().length; i++) {
                        modaS += operacoes.moda()[i] + " ; ";
                    }
                } else {
                    modaS = "Amodal";
                }

                txtModa.setText(modaS);
            }

            if (bdesviopadrao.isSelected()) {
                txtDesvio.setText(numeroCortado(operacoes.desvioPadrao()));
            }

            if (bgrafico.isSelected()) {
                
                new Thread(() -> {
                Histograma histo = new Histograma(operacoes.getDados());
                //histo.setDataSet(operacoes.getDados());
               
                }).start();
                
                
            }
            salvarOperacao();
        } 
        catch (Exception e) {
            System.out.println("asjlasklklnas");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    public String numeroCortado(double numero) {
        StringTokenizer stringTokenizer = new StringTokenizer((operacoes.media() + ""), ".");
        String pInteira = stringTokenizer.nextToken();
        String pDecimal = "." + stringTokenizer.nextToken().substring(0, 4);
        return (pInteira + pDecimal);
    }

    public void carregarHistorico() {  
       String delimitador = "@";
        try {
            FileReader reader = new FileReader(historico);
            BufferedReader buffer = new BufferedReader(reader);
            String linha = buffer.readLine();
            while (linha != null) {
                String row[] = new String[5];
                int i = 0;
                for (StringTokenizer stringTokenizer = new StringTokenizer(linha, delimitador); stringTokenizer.hasMoreTokens();) {
                    String token = stringTokenizer.nextToken();
                    row[i] = token;
                    i++;
                }
                
                ((DefaultTableModel) tbHistorico.getModel()).addRow(row);
                linha = buffer.readLine();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void salvarOperacao() {
        try{
            String row[] = new String[5];
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("(yyyy/MM/dd) - HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        row[0] = txtMedia.getText();
        row[1] = txtModa.getText();
        row[2] = txtMediana.getText();
        row[3] = txtDesvio.getText();
        row[4] = dtf.format(now);
        ((DefaultTableModel) tbHistorico.getModel()).addRow(row);
        }
        catch(Exception e){
            
        }
    }
    private void txtArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArquivoActionPerformed
        //onde vai aparecer os numeros que o usuario digitar
    }//GEN-LAST:event_txtArquivoActionPerformed

    private void txtDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDadosActionPerformed
        //resultados media moda mediana dp
    }//GEN-LAST:event_txtDadosActionPerformed

    private void calcbasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcbasicaActionPerformed
        new calcv3().setVisible(true);

    }//GEN-LAST:event_calcbasicaActionPerformed


    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        JFileChooser jfc = new JFileChooser();
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            arquivo = jfc.getSelectedFile();
            txtArquivo.setText(arquivo.getAbsolutePath());
        } else {
            arquivo = null;
            txtArquivo.setText("");
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        String delimitador = ";";
        txtDados.setText("");
        try {
            if (delimitador.length() != 1) {
                throw new Exception("Use apenas um caractere como delimitador!!!");
            }
            if (arquivo == null) {
                throw new Exception("Favor selecionar um arquivo!!!");
            }
            FileReader reader = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(reader);
            String linha = buffer.readLine();
            while (linha != null) {
                txtDados.setText(txtDados.getText() + linha);
                linha = buffer.readLine();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnLimparHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparHistoricoActionPerformed
        ((DefaultTableModel) tbHistorico.getModel()).setRowCount(0);
    }//GEN-LAST:event_btnLimparHistoricoActionPerformed

    private void btnLimparGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparGeralActionPerformed
        txtArquivo.setText("");
        txtDados.setText("");
        txtDesvio.setText("");
        txtMedia.setText("");
        txtMediana.setText("");
        txtModa.setText("");
        bmedia.setSelected(false);
        bmediana.setSelected(false);
        bmoda.setSelected(false);
        bdesviopadrao.setSelected(false);
        bgrafico.setSelected(false);


    }//GEN-LAST:event_btnLimparGeralActionPerformed

    private void bgraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgraficoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgraficoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        String delimitador = "@";
        FileWriter writer = null;
        try {
            //URL main = layoutEstatistica.class.getResource("layoutEstatistica.class");
            writer = new FileWriter(historico);
            int nlinhas = ((DefaultTableModel) tbHistorico.getModel()).getRowCount();
            int ncols = ((DefaultTableModel) tbHistorico.getModel()).getColumnCount();
            for (int i = 0; i < nlinhas; i++) {
                String linha = "";
                for (int j = 0; j < ncols; j++) {
                    linha += ((DefaultTableModel) tbHistorico.getModel()).getValueAt(i, j);
//estou iterando a tabela
                    if (j < ncols - 1) {
                        linha += delimitador;
                    }

                }

                writer.write(linha + "\n");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                writer.close();
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(layoutEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layoutEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layoutEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layoutEstatistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new layoutEstatistica().setVisible(true);
            }
        });
    }
    
//    public void grafico(){
//        CategoryChart chart = new CategoryChartBuilder().width(800).height(600)
//                .title("Age Distribution")
//                .xAxisTitle("Age Group")
//                .yAxisTitle("Frequency")
//                .build();
//
//        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
//        chart.getStyler().setAvailableSpaceFill(0.99);
//        chart.getStyler().setOverlapped(true);
//
//        List yData = new ArrayList();
//        yData.addAll(paraGrafico.values());
//        List xData = Arrays.asList(distributionMap.keySet().toArray());
//        chart.addSeries("age group", xData, yData);
//
//        new SwingWrapper<>(chart).displayChart();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bdesviopadrao;
    private javax.swing.JCheckBox bgrafico;
    private javax.swing.JCheckBox bmedia;
    private javax.swing.JCheckBox bmediana;
    private javax.swing.JCheckBox bmoda;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimparGeral;
    private javax.swing.JButton btnLimparHistorico;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton calcbasica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHistorico;
    private javax.swing.JTextField txtArquivo;
    private javax.swing.JTextField txtDados;
    private javax.swing.JTextField txtDesvio;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtMediana;
    private javax.swing.JTextField txtModa;
    // End of variables declaration//GEN-END:variables
}
