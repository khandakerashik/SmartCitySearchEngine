/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartCitySearchEngine;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author ashik
 */
public class ForgotPassword extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form ForgotPassword
     */
public ForgotPassword() {
    super("Forgot Password");
    initComponents();
    conn= SQLiteJDBCDriverConnection.ConnectDB();
    }
    
public void Search(){
    String a1=usernameField.getText();
    String sql="Select * from Account where Username='"+a1+"'";// UNION Select * from Account where Answer='"+a1+"' ORDER BY ASC|DESC";
    try{
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next())
        {
            nameField.setText(rs.getString(1));
            securityquestionField.setText(rs.getString(5));
            rs.close();
            pst.close();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Incorrect Username");
        }
            
                    
    }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }
    }
public void Retrive()
{
    String a1=usernameField.getText();
    String a2=answerField.getText();
    String sql="Select * from Account where Answer='"+a2+"'";
    try{
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        if(rs.next())
        {
            passwordField.setText(rs.getString(3));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please enter valid answer of your security question.");
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        securityquestionLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        generatedLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        securityquestionField = new javax.swing.JTextField();
        answerField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        retriveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        usernameLabel.setText("Username");

        nameLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nameLabel.setText("Name");

        securityquestionLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        securityquestionLabel.setText("Your Security Question");

        answerLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        answerLabel.setText("Answer");

        passwordLabel.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Key-icon24.png"))); // NOI18N
        passwordLabel.setText("Password");

        generatedLabel.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        generatedLabel.setForeground(new java.awt.Color(0, 51, 255));
        generatedLabel.setText("Will be Generated..");

        usernameField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        securityquestionField.setEditable(false);
        securityquestionField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        answerField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        passwordField.setEditable(false);
        passwordField.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N

        backButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 51, 51));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Arrow-Back-icon.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 51, 204));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-icon (1)32.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        retriveButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        retriveButton.setForeground(new java.awt.Color(0, 153, 0));
        retriveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eye-icon32.png"))); // NOI18N
        retriveButton.setText("Retrive");
        retriveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retriveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(generatedLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(retriveButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(answerLabel)
                                    .addComponent(usernameLabel)
                                    .addComponent(nameLabel)
                                    .addComponent(securityquestionLabel)
                                    .addComponent(passwordLabel))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(securityquestionField)
                                    .addComponent(nameField)
                                    .addComponent(usernameField)
                                    .addComponent(answerField))))
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securityquestionLabel)
                    .addComponent(securityquestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerLabel))
                .addGap(18, 18, 18)
                .addComponent(retriveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generatedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(63, 63, 63))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void retriveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retriveButtonActionPerformed
        // TODO add your handling code here:
        Retrive();
    }//GEN-LAST:event_retriveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminLogin ob=new AdminLogin();
        ob.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel generatedLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton retriveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField securityquestionField;
    private javax.swing.JLabel securityquestionLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
