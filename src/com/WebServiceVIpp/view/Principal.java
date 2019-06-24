package com.WebServiceVipp.view;

import com.WebServiceVIpp.entities.DesObjeto;
import com.WebServiceVIpp.entities.Objeto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Principal extends javax.swing.JFrame {

    Objeto obj = new Objeto();
    ArrayList<DesObjeto> conteudo = new ArrayList<>();
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnImportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Importacao VIPP");
        getContentPane().setLayout(null);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        btnImportar.setText("Selecione o Arquivo");
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        jPanel1.add(btnImportar);
        btnImportar.setBounds(50, 20, 220, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 80);

        setSize(new java.awt.Dimension(333, 121));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed

        JFileChooser files = new JFileChooser();
        files.setDialogTitle("Selecione o arquivo");
        files.setFileSelectionMode(JFileChooser.FILES_ONLY);
        files.showOpenDialog(files);
        files.getSelectedFile();
        String url = files.getSelectedFile().getPath();
        File file = new File(url);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //Cria um woorkbook com todas as abas da planilha
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            //recupera a segunda aba da planilha
            XSSFSheet sheet = workbook.getSheetAt(1);

            //retorna todas as linhas da planilha 1 ou aba 2
            Iterator<Row> rowInterator = sheet.iterator();

            //varre todas as linhas da planilha como se fosse um Resultset
            int cont = 0;
            while (rowInterator.hasNext()) {

                //recebe cada linha da planilha
                Row row = rowInterator.next();

                //Pegamos todas as celulas desta linha
                if (cont == 0) {
                    cont++;
                } else {

                    Iterator<Cell> cellInterator = row.iterator();

                    String observacao_1 = null, desObj, destinatario = null, endereco = null,
                            bairro = null, complemento = null, cep = null, cidade = null, uf = null, numero = null;

                    boolean temp = true;

                    //Varremos todas as celulas da linha atual
                    while (cellInterator.hasNext()) {

                        //Aqui criamos uma celula
                        Cell cell = cellInterator.next();

                        switch (cell.getColumnIndex()) {

                            case 0:
                                observacao_1 = "" + cell.getStringCellValue();
                                if (observacao_1.equals(obj.getObservacao_1())) {
                                    temp = false;
                                }
                                break;

                            case 11:
                                desObj = "" + cell.getStringCellValue();
                                if (observacao_1 != null) {
                                    if (observacao_1.equals(obj.getObservacao_1())) {
                                        conteudo.add(new DesObjeto(desObj));
                                    } else {
                                        conteudo.clear();
                                        conteudo.add(new DesObjeto(desObj));
                                    }

                                }

                                break;

                            case 14:
                                destinatario = "" + cell.getStringCellValue();

                            case 16:
                                endereco = "" + cell.getStringCellValue();
                                break;

                            case 17:
                                numero = "" + cell.getStringCellValue();
                                break;

                            case 18:
                                bairro = "" + cell.getStringCellValue();
                                break;

                            case 19:
                                complemento = "" + cell.getStringCellValue();
                                break;

                            case 20:
                                cep = "" + cell.getStringCellValue();
                                break;

                            case 21:
                                cidade = "" + cell.getStringCellValue();
                                break;

                            case 22:
                                uf = "" + cell.getStringCellValue();
                                break;

                        }
                    }
                    if (temp) {
                        obj = new Objeto(destinatario, endereco, numero, complemento,
                                bairro, cidade, uf, cep, observacao_1);
                        obj.setDesObjeto(conteudo);
                    } else {
                        obj.setDesObjeto(conteudo);
                    }
                    
                    System.out.println(obj.toString());
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnImportarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
