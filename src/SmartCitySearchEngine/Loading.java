/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCitySearchEngine;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ashik
 */
public  class Loading extends javax.swing.JFrame implements Runnable{
Connection conn;
Thread th;
    /**
     * Creates new form Loading
     */
    public Loading() {
        super("Loading");
        initComponents();
        th=new Thread((Runnable)this);
        
    }
    
    public void setUpLoading(){
        setVisible(false);
        th.start();
    
    }

@Override
    public void run(){
        try{
            for (int i=1;i<=200;i++)
            {
                int m=jProgressBar1.getMaximum();
                int v=jProgressBar1.getValue();
                if (v<m)
                {
                    jProgressBar1.setValue(jProgressBar1.getValue()+1);
                }
                else
                {
                    i=201;
                    setVisible(false);
                    Admin ob= new Admin();
                    ob.setVisible(true);
                } Thread.sleep(7);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadingnoticeLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        smartcitygifLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadingnoticeLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        loadingnoticeLabel.setForeground(new java.awt.Color(0, 51, 51));
        loadingnoticeLabel.setText("Loading ..");

        welcomeLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 51, 255));
        welcomeLabel.setText("Welcome to  Admin Panel . .");

        jProgressBar1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jProgressBar1.setStringPainted(true);

        smartcitygifLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Paris.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(loadingnoticeLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(smartcitygifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(welcomeLabel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingnoticeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(smartcitygifLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel loadingnoticeLabel;
    private javax.swing.JLabel smartcitygifLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
