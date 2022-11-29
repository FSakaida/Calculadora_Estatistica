/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadorav4;

import java.io.File;
import javax.swing.JFileChooser;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.rank.Median;
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

/**
 *
 * @author 202110131
 */
public class layoutEstatistica extends javax.swing.JFrame {

    /**
     * Creates new form layoutEstatistica
     */
    
    calculosEstatisticos operacoes = new calculosEstatisticos();
    public layoutEstatistica() {
        initComponents();
        String operacao;
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
        grafico = new javax.swing.JCheckBox();
        txtDados = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();
        btnCarregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        txtModa = new javax.swing.JTextField();
        txtMediana = new javax.swing.JTextField();
        txtDesvio = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistorico = new javax.swing.JTable();
        btnCalcular1 = new javax.swing.JButton();

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
            .addGap(0, 382, Short.MAX_VALUE)
        );

        grafico.setForeground(new java.awt.Color(72, 51, 177));
        grafico.setText("Gráfico");

        txtDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        txtDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDadosActionPerformed(evt);
            }
        });

        btnSelecionar.setForeground(new java.awt.Color(72, 51, 177));
        btnSelecionar.setText("Selecionar");
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

        jLabel1.setText("Arquivo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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

        btnCalcular1.setForeground(new java.awt.Color(72, 51, 177));
        btnCalcular1.setText("Limpar Histórico");
        btnCalcular1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 51, 177), 2));
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDados, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcbasica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(273, 273, 273))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMedia)
                            .addComponent(bmedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bmoda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModa))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bmediana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMediana))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bdesviopadrao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grafico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDados)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcbasica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelecionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCarregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalcular)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmedia)
                    .addComponent(bmoda)
                    .addComponent(bmediana)
                    .addComponent(bdesviopadrao)
                    .addComponent(grafico)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    File arquivo;
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String dados = txtDados.getText();
        List<Double> novosDados = new ArrayList<>();
        for (StringTokenizer stringTokenizer = new StringTokenizer(dados, ";"); stringTokenizer.hasMoreTokens();) {
                    String token = stringTokenizer.nextToken();
                    novosDados.add(Double.parseDouble(token));
        }
        operacoes.setDados(novosDados);
        if (bmedia.isSelected()) {
            txtMedia.setText(operacoes.media() + "");
        }

        if (bmediana.isSelected()) {
           txtMediana.setText(operacoes.mediana() + "");
        }

        if (bmoda.isSelected()) {
            txtModa.setText(operacoes.moda() + "");
        }

        if (bdesviopadrao.isSelected()) {
            txtDesvio.setText(operacoes.desvioPadrao() + "");
        }

        if (grafico.isSelected()) {
            
        }
        salvarOperacao();
    }//GEN-LAST:event_btnCalcularActionPerformed

    
    public void carregarHistorico(){
        
    }
    
    public void salvarOperacao(){
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

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    
    
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bdesviopadrao;
    private javax.swing.JCheckBox bmedia;
    private javax.swing.JCheckBox bmediana;
    private javax.swing.JCheckBox bmoda;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton calcbasica;
    private javax.swing.JCheckBox grafico;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
