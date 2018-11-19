/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.Fahrt;

/**
 *
 * @author sasch
 */
public class FahrtenbuchDLG extends javax.swing.JDialog {

    /**
     * Creates new form FahrtenbuchDLG
     */
    Fahrt newFahrt;
    int km;
    String kennzeichen;
    double liter;
    public FahrtenbuchDLG(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        tfKm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfLiter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfKennzeichen = new javax.swing.JTextField();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("Kilometer");
        getContentPane().add(jLabel1);
        getContentPane().add(tfKm);

        jLabel2.setText("Liter");
        getContentPane().add(jLabel2);
        getContentPane().add(tfLiter);

        jLabel3.setText("Kennzeichen");
        getContentPane().add(jLabel3);
        getContentPane().add(tfKennzeichen);

        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOk(evt);
            }
        });
        getContentPane().add(btOk);

        btCancel.setText("Abbrechen");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCancel(evt);
            }
        });
        getContentPane().add(btCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public Fahrt getNewFahrt() {
        return newFahrt;
    }

    private void onOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOk
        km=Integer.parseInt(tfKm.getText());
        liter=Double.parseDouble(tfLiter.getText());
        kennzeichen=tfKennzeichen.getText();
        newFahrt=new Fahrt(km, liter, kennzeichen);
        dispose();
    }//GEN-LAST:event_onOk

    private void onCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCancel
        dispose();
    }//GEN-LAST:event_onCancel

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
            java.util.logging.Logger.getLogger(FahrtenbuchDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FahrtenbuchDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FahrtenbuchDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FahrtenbuchDLG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FahrtenbuchDLG dialog = new FahrtenbuchDLG(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfKennzeichen;
    private javax.swing.JTextField tfKm;
    private javax.swing.JTextField tfLiter;
    // End of variables declaration//GEN-END:variables
}
