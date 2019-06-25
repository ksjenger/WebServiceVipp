package br.com.WebServiceVIpp.view;

import br.com.WebServiceVIpp.entities.ObjetoPostagem;
import br.com.WebServiceVIpp.services.ImportarXlsx;
import javax.swing.JFileChooser;

public class FormPrincipal extends javax.swing.JFrame {

    ObjetoPostagem obj = new ObjetoPostagem();
    
    public FormPrincipal() {
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
        obj = ImportarXlsx.ImportarXlsx(url);

        
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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
