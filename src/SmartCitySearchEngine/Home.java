/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCitySearchEngine;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ashik
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        super("Home");
        initComponents();       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchField = new javax.swing.JPanel();
        adminloginButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        citygif = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        suggestButton = new javax.swing.JButton();
        adminLoginLabel = new javax.swing.JLabel();
        suggestLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bradley Hand ITC", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        adminloginButton.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        adminloginButton.setForeground(new java.awt.Color(255, 0, 0));
        adminloginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Users-Administrator-icon (2)92.png"))); // NOI18N
        adminloginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminloginButtonActionPerformed(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 0, 255));
        welcomeLabel.setText("Welcome To Smart City Search Engine ");

        citygif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/city_final.gif"))); // NOI18N

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 51, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-icon 92.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        suggestButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suggestButton.setForeground(new java.awt.Color(255, 102, 0));
        suggestButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Programming-Add-Property-icon96.png"))); // NOI18N
        suggestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestButtonActionPerformed(evt);
            }
        });

        adminLoginLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        adminLoginLabel.setForeground(new java.awt.Color(255, 0, 0));
        adminLoginLabel.setText("Admin Login");

        suggestLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        suggestLabel.setForeground(new java.awt.Color(255, 102, 0));
        suggestLabel.setText("Suggest");

        searchLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(0, 51, 204));
        searchLabel.setText("Search");

        javax.swing.GroupLayout searchFieldLayout = new javax.swing.GroupLayout(searchField);
        searchField.setLayout(searchFieldLayout);
        searchFieldLayout.setHorizontalGroup(
            searchFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchFieldLayout.createSequentialGroup()
                .addGroup(searchFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchFieldLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(citygif)
                        .addGroup(searchFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchFieldLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(adminLoginLabel))
                            .addGroup(searchFieldLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(suggestLabel))
                            .addGroup(searchFieldLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(searchFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(suggestButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminloginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(searchFieldLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(searchLabel))))
                    .addGroup(searchFieldLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(welcomeLabel)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        searchFieldLayout.setVerticalGroup(
            searchFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchFieldLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 33, Short.MAX_VALUE)
                .addComponent(citygif)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchFieldLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suggestButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suggestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(adminloginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminLoginLabel)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void suggestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Suggest ob=new Suggest();
        ob.setVisible(true);
    }//GEN-LAST:event_suggestButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Search ob=new Search();
        ob.setVisible(true);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void adminloginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminloginButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminLogin ob=new AdminLogin();
        ob.setVisible(true);
    }//GEN-LAST:event_adminloginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminLoginLabel;
    private javax.swing.JButton adminloginButton;
    private javax.swing.JLabel citygif;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JButton suggestButton;
    private javax.swing.JLabel suggestLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
